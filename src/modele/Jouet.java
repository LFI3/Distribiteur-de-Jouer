
package modele;
import java.sql.ResultSet;
import java.sql.Statement;
public class Jouet 
{
  public static  Connexion con=new Connexion();
  
//------------------------------------------------------------------------------
   public static void  ajouter(int num)
     { 
        Statement s=con.getS();
        try
  	{ 	
          s.executeUpdate("Update jouet set nombre=nombre+1 where numero="+num+" ;");
  	}
  	catch(Exception e)
    	{ 
   	System.out.println(e);
	}
    }
//------------------------------------------------------------------------------

   public static void  supprimer(int num)
     { 
         Statement s = con.getS();
         try {
             s.executeUpdate("Update jouet set nombre=nombre-1 where numero=" + num + " ");
         } catch (Exception e) {
             System.out.println(e);
         }
    }
//------------------------------------------------------------------------------  
 public static int afficher(int num)
    {  
       ResultSet  r;
       int nombre=0;
       
       try
   	{
   	r= con.getS().executeQuery("SELECT nombre FROM jouet where numero = " + num + " ");
        while(r.next())
   	{
	 nombre=r.getInt("nombre");
	 return nombre;
        } 
        
        }
   	catch(Exception e){ System.out.println(e);}
        return nombre;
}

}
