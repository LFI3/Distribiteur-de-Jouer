
package modele;
import java.sql.ResultSet;
import java.sql.Statement;
public class Carte 
{
  public static  Connexion con=new Connexion();
//------------------------------------------------------------------------------

    public static void inserer(int num, int code) {
        Statement s = con.getS();
        try {
            s.executeUpdate("insert into carte(numero,code) values("+num+"," + code + ")");
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
//------------------------------------------------------------------------------
   public static void  modifier(int num, int code)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("Update carte set solde=solde-1 where numero="+num+" and code=" + code + "  ;");
  	}
  	catch(Exception e)
    	{ 
   	System.out.println(e);
	}
    }
//------------------------------------------------------------------------------
public static boolean existe(int num,int code) 
{
        Statement s = con.getS();
        ResultSet r;
        try 
        {
          r=s.executeQuery("select count(*) from carte where numero=" + num + " and code=" + code + "   ;");
          r.next();
          if(r.getInt(1)==1) return true; 
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
       return false; 
    }
//------------------------------------------------------------------------------
}
