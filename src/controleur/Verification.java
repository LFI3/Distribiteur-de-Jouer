
package controleur;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Verification

{
 //------------------------------------------------------
  public static boolean estVide(String  ch)
  {
   if( ch.length()==0) return true;return false;
    
 }  
 //------------------------------------------------------
  public static boolean estInt(String  ch)
  {
    for(int i=0;i<ch.length();i++)
    {
      if(ch.charAt(i)<'0'|| ch.charAt(i)>'9') 
          return false;
    }
    return true;
 }
 //------------------------------------------------------
 public static boolean composerNchiffre(String ch,int n) {
        if (ch.length()==n) 
        {
                return true;
          
        }
        return false;
    }
 //------------------------------------------------------ 
  public static boolean verifNotVideEtInt(String numero,String code)
       {
          if(estVide(numero))
          {
                  JOptionPane jop = new JOptionPane();
                  showMessageDialog( null," Le Champ de texte de Numero de carte est vide");
                  return false;
          }
          if (estVide(code)) 
          {
               JOptionPane jop = new JOptionPane();
               showMessageDialog(null, " Le Champ de texte de code de carte est vide");
               return false;
           }
          else if (!estInt(numero)) 
          {
               JOptionPane jop = new JOptionPane();
               showMessageDialog(null, " Le Champ de texte de Numero de carte est Incorrecte");
               return false;
           }
          else if (!estInt(code)) 
          {
              JOptionPane jop = new JOptionPane();
              showMessageDialog(null, " Le Champ de texte de code de carte est Incorrecte");
              return false;
          }
           else if (!composerNchiffre(numero,8)) 
           {
               JOptionPane jop = new JOptionPane();
               showMessageDialog(null, " Le Numero de carte est Incorrecte (8 chiffre )");
               return false;
           }
           else if (!composerNchiffre(code, 4)) {
               JOptionPane jop = new JOptionPane();
               showMessageDialog(null, " Le Code de carte est Incorrecte (4 chiffre )");
               return false;
           }
          
          else
          {
              return true;
          }
           
       }
 
 //------------------------------------------------------

}
