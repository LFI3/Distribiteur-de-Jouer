
package view;

import controleur.Parametre;

public class Bienvenu extends Fenetre implements Runnable 
{

    public Bienvenu() 
    {
        
        noire = new javax.swing.JPanel();
        prgresseBar = new javax.swing.JLabel();
        pourcentage = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        arrierplan = new javax.swing.JLabel();
        t=new Thread(this);
        t.start();
        //----------------------------------------------------------------------
        add(loading);
        add(noire);
        add(pourcentage);
        add(arrierplan);
        //----------------------------------------------------------------------
        noire.setBackground(new java.awt.Color(0, 0, 0));
        noire.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        noire.setLayout(null);
        noire.add(prgresseBar);
        noire.setBounds(200, 550, Parametre.x-400, 30);
        //----------------------------------------------------------------------
        prgresseBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ProgressBar.gif"))); // NOI18N
        prgresseBar.setBounds(0, 0, 0, 30);
        //----------------------------------------------------------------------
        
        pourcentage.setBackground(new java.awt.Color(255, 255, 255));
        pourcentage.setFont(new java.awt.Font("Segoe WP Semibold", 1, 36)); // NOI18N
        pourcentage.setForeground(new java.awt.Color(255, 255, 255));
        pourcentage.setBounds(510, 600, 120, 40);
        //----------------------------------------------------------------------
        loading.setBackground(new java.awt.Color(255, 255, 255));
        loading.setFont(new java.awt.Font("Segoe WP Semibold", 1, 36)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading ...");
        loading.setBounds(290, 600, 210, 50);
        //----------------------------------------------------------------------
        arrierplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img2.jpg"))); // NOI18N
        arrierplan.setBounds(0,0,Parametre.x, Parametre.y);
        //----------------------------------------------------------------------
    }

    public void run() 
    {
        try {
            t.sleep(1000);
        } catch (Exception e) {
            System.out.println("erreur");
        }
       for(int i=0;i<=100;i++)
       {
           pourcentage.setText(" "+i+" %");
           prgresseBar.setBounds(0, 0, (int) (6.7*i), 30);
           try {t.sleep(100);} catch (Exception e) {System.out.println("erreur");}
           
       }
        try {t.sleep(1000);} catch (Exception e) {System.out.println("erreur");}
        setVisible(false);
        new Demarrage();
    }
    // Variables declaration - do not modify
    private Thread t; 
    private javax.swing.JLabel pourcentage;
    private javax.swing.JLabel prgresseBar;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel arrierplan;
    private javax.swing.JPanel noire;
    // End of variables declaration                   

    
}
