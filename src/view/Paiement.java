
package view;

import controleur.Parametre;
import java.awt.Color;

public class Paiement extends Fenetre implements Runnable
{

    public Paiement() 
    {
        plan = new javax.swing.JPanel();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        retour = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        suivant = new javax.swing.JLabel();
        carteVisa = new javax.swing.JButton();
        dinar = new javax.swing.JButton();
        monnai500 = new javax.swing.JButton();
        carteBanque = new javax.swing.JButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        fermer = new javax.swing.JButton();
        barre2 = new javax.swing.JLabel();
        barre1 = new javax.swing.JLabel();
        t=new Thread(this);
        t.start();
        //----------------------------------------------------------------------
        add(plan);
        //----------------------------------------------------------------------
        plan.setBackground(new java.awt.Color(0, 0, 0));
        plan.setLayout(null);
        plan.add(r2);
        plan.add(r1);
        plan.add(retour);
        plan.add(suivant);
        plan.add(carteVisa);
        plan.add(monnai500);
        plan.add(carteBanque);
        plan.add(r3);
        plan.add(dinar);
        plan.setBounds(0, 0, 1070, 670);
        plan.add(barre1);
        plan.add(barre2);
        plan.add(fermer);
        plan.add(r4); 
        plan.add(titre);
        //----------------------------------------------------------------------
        r2.setBackground(new java.awt.Color(0, 0, 0));
        r2.setForeground(new java.awt.Color(0, 0, 204));
        r2.setBounds(530, 560, 20, 30);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });
        //----------------------------------------------------------------------
        titre.setFont(Parametre.font1);
        titre.setForeground(Color.white);
        titre.setBounds(250, 150, 610, 100);
        titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new javax.swing.ImageIcon(getClass().getResource("/image/cadre5.jpg")))); // NOI18N
        //----------------------------------------------------------------------
        r1.setBackground(new java.awt.Color(0, 0, 0));
        r1.setForeground(new java.awt.Color(0, 0, 204));
        r1.setBounds(500, 560, 20, 30);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
            }
        });
        //----------------------------------------------------------------------
        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "retour.gif"))); // NOI18N
        retour.setBounds(10, 370, 74, 60);
        //----------------------------------------------------------------------
        suivant.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "suivant.gif"))); // NOI18N
        suivant.setBounds(990, 370, 80, 60);
        //----------------------------------------------------------------------
        carteVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "visa.jpg"))); // NOI18N
        carteVisa.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new javax.swing.ImageIcon(getClass().getResource("/image/cadre5.jpg")))); // NOI18N
        carteVisa.setBounds(250, 250, 610, 300);
        carteVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                new CarteVisa();
            }
        });
        //----------------------------------------------------------------------
        dinar.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "dinar.jpg"))); // NOI18N
        dinar.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new javax.swing.ImageIcon(getClass().getResource("/image/cadre5.jpg")))); // NOI18N
        dinar.setBounds(250, 250, 610, 300);
        dinar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                new Dinar();
            }
        });
        //----------------------------------------------------------------------
        monnai500.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "500_millimes.jpg"))); // NOI18N
        monnai500.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new javax.swing.ImageIcon(getClass().getResource("/image/cadre5.jpg")))); // NOI18N
        monnai500.setBounds(250, 250, 610, 300);
        monnai500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                new DemiDinar();
            }
        });
        //----------------------------------------------------------------------
        carteBanque.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "banqaire.jpg"))); // NOI18N
        carteBanque.setBounds(250, 250, 610, 300);
        carteBanque.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new javax.swing.ImageIcon(getClass().getResource("/image/cadre5.jpg")))); // NOI18N
        carteBanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                new CarteBanquaire();
            }
        });
        //----------------------------------------------------------------------
        r3.setBackground(new java.awt.Color(0, 0, 0));
        r3.setForeground(new java.awt.Color(0, 0, 204));
        r3.setBounds(560, 560, 20, 30);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });
        //----------------------------------------------------------------------
        r4.setBackground(new java.awt.Color(0, 0, 0));
        r4.setForeground(new java.awt.Color(0, 0, 204));
        r4.setBounds(590, 560, 20, 30);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });
        //----------------------------------------------------------------------
        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "fermer.png"))); // NOI18N
        fermer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fermer.setBounds(960, 60, 110, 80);
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                
            }
        });
        //----------------------------------------------------------------------
        barre2.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone+"barre.jpeg"))); // NOI18N
        barre2.setBounds(0, 600, 1070, 50);
        //----------------------------------------------------------------------
        barre1.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "barre.jpeg"))); // NOI18N
        barre1.setBounds(10, 10, 1060, 50);
        //----------------------------------------------------------------------
 }

   
   

    public  void viderRadio() 
    {
        r1.setSelected(false);
        r2.setSelected(false);
        r3.setSelected(false);
        r4.setSelected(false);
    }
   
    public void viderBouton() 
    {
        carteBanque.setVisible(false);
        carteVisa.setVisible(false);
        dinar.setVisible(false);
        monnai500.setVisible(false);
    }
    public void selection(int i) 
    {
        if (i == 1)      {carteBanque.setVisible(true);r1.setSelected(true);titre.setText("Carte de Banque"); retour.setVisible(false);suivant.setVisible(true);} 
        else if (i == 2) { carteVisa.setVisible(true); r2.setSelected(true);titre.setText("Carte Visa");retour.setVisible(true);suivant.setVisible(true);} 
        else if (i == 3) {dinar.setVisible(true); r3.setSelected(true);titre.setText("Piece de Dinar");retour.setVisible(true);suivant.setVisible(true);} 
        else if (i == 4) {monnai500.setVisible(true);r4.setSelected(true);titre.setText("Deux pieces de 500 millimes"); retour.setVisible(true);suivant.setVisible(false); }
        
    }
    
    public void run() 
    {
        while(true)
        {
            viderRadio();viderBouton() ;selection(1);
            try{t.sleep(2500);}catch(Exception e){System.out.println("erreur");}
            
            viderRadio();
            viderBouton();
            selection(2);
            try {t.sleep(2500);} catch (Exception e) {System.out.println("erreur");}
             
            viderRadio();
            viderBouton();
            selection(3);
            try {t.sleep(2500);} catch (Exception e) {System.out.println("erreur");}
            
            viderRadio();
            viderBouton();
            selection(4);
            try {t.sleep(2500);} catch (Exception e) {System.out.println("erreur");}
        }
    } 
    
    // Variables declaration - do not modify   
    private Thread t;
    private javax.swing.JLabel barre1;
    private javax.swing.JLabel barre2;
    private javax.swing.JLabel titre;
    private javax.swing.JButton carteBanque;
    private javax.swing.JButton carteVisa;
    private javax.swing.JButton dinar;
    private javax.swing.JButton fermer;
    private javax.swing.JButton monnai500;
    private javax.swing.JPanel plan;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JLabel retour;
    private javax.swing.JLabel suivant;
    // End of variables declaration                   

    
   
}
