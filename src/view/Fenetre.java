
package view;

import  controleur.*;
import javax.swing.*;



public class Fenetre extends JFrame  
{
    public JPanel contenu;
    
    public Fenetre()
    { 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setUndecorated(true);
        setTitle("Fenetre");
        setVisible(true);
        setBounds(Parametre.fenetre);
       
   }
   
   
}
