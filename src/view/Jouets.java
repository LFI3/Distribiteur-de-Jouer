
package view;

import java.util.Random;

public class Jouets extends Fenetre implements Runnable{

    public Jouets() 
    {
       
        plan = new javax.swing.JPanel();
        fermer = new javax.swing.JButton();
        barre2 = new javax.swing.JLabel();
        barre1 = new javax.swing.JLabel();
        bleu = new javax.swing.JButton();
        compartimentGarcon = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        jLabelVoiture = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabelArme = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        jLabelHero = new javax.swing.JLabel();
        compartimentFille = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        jLabelPoupe = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jLabelCheveux = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabelPleuche = new javax.swing.JLabel();
        rouge = new javax.swing.JButton();
        t1=new Thread(this);
        t2 = new Thread(this);
        t3 = new Thread(this);
        t4 = new Thread(this);
        //----------------------------------------------------------------------
        t1.start();
        add(plan);
        //----------------------------------------------------------------------
        plan.setBackground(new java.awt.Color(0, 0, 0));
        plan.setLayout(null);
        plan.add(fermer); 
        plan.add(barre2); 
        plan.add(barre1);
        plan.add(bleu);
        plan.add(compartimentGarcon);
        plan.add(compartimentFille);
        plan.setBounds(0, 0, 1070, 670);
        plan.add(rouge);
        //----------------------------------------------------------------------
        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fermer.png"))); // NOI18N
        fermer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fermer.setBounds(960, 60, 110, 80);
        fermer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);

            }
        });
        //----------------------------------------------------------------------
        barre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        barre2.setBounds(0, 600, 1070, 50);
        //----------------------------------------------------------------------
        barre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        barre1.setBounds(10, 10, 1060, 50);
        //----------------------------------------------------------------------
        bleu.setBackground(new java.awt.Color(0, 0, 0));
        bleu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bleu.jpg"))); // NOI18N
        bleu.setBorder(null);
        bleu.setBounds(920, 330, 110, 100);
        bleu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bleu.setVisible(false);
                rouge.setVisible(false);
                t1.stop();
                compartimentFille.setVisible(false);
                t2.start();
                
            }
        });
        
        
        //----------------------------------------------------------------------
        compartimentGarcon.setBackground(new java.awt.Color(0, 0, 0));
        //compartimentGarcon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        compartimentGarcon.setLayout(null);
        compartimentGarcon.setBounds(500, 70, 390, 520);
        compartimentGarcon.add(p6);
        compartimentGarcon.add(p4);
        compartimentGarcon.add(p5);
        //----------------------------------------------------------------------
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
        p6.setLayout(null);
        p6.add(jLabelVoiture); 
        p6.setBounds(10, 350, 370, 160);
        p6.setBackground(new java.awt.Color(255, 255, 255));
        //----------------------------------------------------------------------
        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
        p4.setLayout(null);
        p4.add(jLabelArme);
        p4.setBounds(10, 10, 370, 160);
        //----------------------------------------------------------------------
        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
        p5.setLayout(null);
        p5.add(jLabelHero);
        p5.setBounds(10, 180, 370, 160);
        //----------------------------------------------------------------------
        jLabelVoiture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garcon/voitureMoto/voiture (1).jpg"))); // NOI18N
        jLabelVoiture.setBounds(10, 10, 350, 140);
        //----------------------------------------------------------------------
        jLabelArme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garcon/arme/arme (1).jpg"))); // NOI18N
        jLabelArme.setBounds(10, 10, 350, 140);
        //----------------------------------------------------------------------
        jLabelHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garcon/superHero/hero (1).jpg"))); // NOI18N
        jLabelHero.setBounds(10, 10, 350, 140);
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        

        
        

        compartimentFille.setBackground(new java.awt.Color(0, 0, 0));
        //compartimentFille.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        compartimentFille.setLayout(null);
        compartimentFille.setBounds(60, 70, 390, 520);
        compartimentFille.add(p1);
        compartimentFille.add(p2);
        compartimentFille.add(p3);
        //----------------------------------------------------------------------
        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
        p1.setLayout(null);
        p1.add(jLabelCheveux);
        p1.setBounds(10, 10, 370, 160);
        //----------------------------------------------------------------------
        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
        p2.setLayout(null);
        p2.add(jLabelPleuche);
        p2.setBounds(10, 180, 370, 160);
        //----------------------------------------------------------------------
        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
        p3.setLayout(null);
        p3.setBounds(10, 350, 370, 160); 
        p3.add(jLabelPoupe);
        //----------------------------------------------------------------------
        jLabelPoupe.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPoupe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fille/poupe/poupe (1).jpg"))); // NOI18N
        jLabelPoupe.setBounds(10, 10, 350, 140);
        //----------------------------------------------------------------------
        jLabelCheveux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fille/cheveux/cheveux (1).jpg"))); // NOI18N
        jLabelCheveux.setBounds(10, 10, 350, 140);
        //----------------------------------------------------------------------
        jLabelPleuche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fille/pleuche rose/pleuche (1).jpg"))); // NOI18N
        jLabelPleuche.setBounds(10, 10, 350, 140);
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        rouge.setBackground(new java.awt.Color(0, 0, 0));
        rouge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rouge.jpg"))); // NOI18N
        rouge.setBorder(null);
        rouge.setBounds(920, 220, 110, 100);
        rouge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rouge.setVisible(false);
                bleu.setVisible(false);
                t1.stop();
                compartimentGarcon.setVisible(false);
                t3.start(); 
                
            }
        });
            //----------------------------------------------------------------------
        

        
       
    }

 
   
  

    // Variables declaration - do not modify                     
    private javax.swing.JLabel barre1;
    private javax.swing.JLabel barre2;
    private javax.swing.JPanel compartimentFille;
    private javax.swing.JPanel compartimentGarcon;
    private javax.swing.JButton fermer;
    private javax.swing.JButton bleu;
    private javax.swing.JButton rouge;
    private javax.swing.JLabel jLabelArme;
    private javax.swing.JLabel jLabelCheveux;
    private javax.swing.JLabel jLabelHero;
    private javax.swing.JLabel jLabelPleuche;
    private javax.swing.JLabel jLabelPoupe;
    private javax.swing.JLabel jLabelVoiture;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel plan;
    private Thread t1;
    private Thread t2;
    private Thread t3;
    private Thread t4;
    // End of variables declaration                   

    @Override
    public void run() 
    {
       if(t1.isAlive()) 
       {
         changer();
       }
        if (t2.isAlive()) 
        {
            
            centrerGarcon();
            aleaGarcon() ;
            setVisible(false);
            new Demarrage();
        }
        if (t3.isAlive()) 
        {

           centrerFille();
            aleaFille() ;
            setVisible(false);
            new Demarrage();
        }
        
    }

    private void changer()
    {
        int cheveux=4;
        int poupe =5;
        int pleuche =5; 
        
        int arme = 7;
        int voiture = 6;
        int hero = 6;
        
        
        int ch=1,po=1,pl=1,ar=1,he=1,vr=1;
        try
        {
            
         while(true)
         {
         if(ch<=cheveux){modifierCheveux(ch);ch++;}else{ch=1;modifierCheveux(ch);}
         if (po <= poupe) {modifierPoupe(po);po++;} else {po = 1;modifierPoupe(po);}    
         if (pl <= pleuche) { modifierPleuche(pl);pl++; } else { pl = 1;modifierPleuche(pl); } 
         
         if (ar <= arme) {modifierArme(ar); ar++; } else {ar = 1;modifierArme(ar);}
         if (vr <= voiture) {modifierVoiture(vr);vr++; } else {vr = 1;modifierVoiture(vr);}
         if (he <= hero) {modifierHero(he);he++;} else {he = 1;modifierHero(he);}
                
         t1.sleep(1500);   
         }
        
        }
        catch(Exception e)
        {
        System.out.println("erreur");
        
        }
    }

    private void aleaGarcon() 
    {
        int r=nombreAlea(6, 10);
        int p=r%3;
        try 
        {
               for(int i=1;i<=r;i++)
               {
               
                if (i % 3== 1)
               {
                 p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0,0 ), 6));
                 p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
                 p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
               }
               else if (i % 3 == 2)
               {
                   p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
                   p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                   p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
               }
               else if (i % 3 == 0) {
                       p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
                       p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
                       p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                   }
               
               t2.sleep(700);
               }
               
               if(p==1)
               {
                   p6.setVisible(false);t2.sleep(500);
                   p5.setVisible(false);t2.sleep(500);
                   p4.setBounds(10, 180, 370, 160);
                   modele.Jouet.supprimer(4);
                   t2.sleep(500);
               }
               else if (p==2) 
               {
                p6.setVisible(false);
                t2.sleep(500);
                p4.setVisible(false);
                t2.sleep(500);
                p5.setBounds(10, 180, 370, 160);
                modele.Jouet.supprimer(5);
                t2.sleep(500);
                
                }
               else if (p == 0) {
                p4.setVisible(false);
                t2.sleep(500);
                p5.setVisible(false);
                t2.sleep(500);
                p6.setBounds(10, 180, 370, 160);
                modele.Jouet.supprimer(6);
                t2.sleep(500);
            }
            t2.sleep(2000);
        } catch (Exception e) 
        {
            System.out.println("erreur");

        }
    }
    private void aleaFille() 
    {
        int r = nombreAlea(6, 10);
        int p = r % 3;
        try {
            for (int i = 1; i <= r; i++) {

                if (i % 3 == 1) {
                    p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
                    p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                    p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                } else if (i % 3 == 2) {
                    p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                    p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
                    p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                } else if (i % 3 == 0) {
                    p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                    p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 6));
                    p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 6));
                }

                t2.sleep(700);
            }

            if (p == 1) {
                p3.setVisible(false);
                t2.sleep(500);
                p2.setVisible(false);
                t2.sleep(500);
                p1.setBounds(10, 180, 370, 160);
                t2.sleep(500);
                modele.Jouet.supprimer(1);
            } else if (p == 2) {
                p3.setVisible(false);
                t2.sleep(500);
                p1.setVisible(false);
                t2.sleep(500);
                p2.setBounds(10, 180, 370, 160);
                modele.Jouet.supprimer(2);
                t2.sleep(500);
            } else if (p == 0) {
                p1.setVisible(false);
                t2.sleep(500);
                p2.setVisible(false);
                t2.sleep(500);
                p3.setBounds(10, 180, 370, 160);
                modele.Jouet.supprimer(3);
                t2.sleep(500);
            }
            t2.sleep(2000);
        } catch (Exception e) {
            System.out.println("erreur");

        }
    }
    public void modifierCheveux(int i)
    {
    jLabelCheveux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fille/cheveux/cheveux ("+i+").jpg")));
    }
    public void modifierPleuche(int i) 
    {
        jLabelPleuche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fille/pleuche rose/pleuche ("+i+").jpg"))); // NOI18N
    }
    public void modifierPoupe(int i) 
    {
        jLabelPoupe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fille/poupe/poupe (" + i + ").jpg"))); // NOI18N
    }
    
    public void modifierArme(int i) 
    {
        jLabelArme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garcon/arme/arme ("+i+").jpg"))); // NOI18N
    }
    public void modifierVoiture(int i) {
        jLabelVoiture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garcon/voitureMoto/voiture ("+i+").jpg"))); // NOI18N
    }
    public void modifierHero(int i) {
        jLabelHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garcon/superHero/hero ("+i+").jpg"))); // NOI18N
    }
    public void centrerFille() 
    {
        try {
            for (int i = 60; i <= 340; i++) {
                compartimentFille.setBounds(i, 70, 390, 520);
                t3.sleep(10);
            }
        } catch (Exception e) {
            System.out.println("erreur");
        }
    }
    public void centrerGarcon() 
    {
        try
        {
        for(int i=500;i>=340;i--)
        {
            compartimentGarcon.setBounds(i, 70, 390, 520);
            t2.sleep(10);
        }
        }
        catch(Exception e)
        {
        System.out.println("erreur");
        }
        
    }
    
    public int nombreAlea(int a,int b)
    {
        Random rn = new Random();
        int randomInt = rn.nextInt(b) + a;
        System.out.println(randomInt);
        
        return randomInt;
        //double r=Math.random();
        //return (int) r*(b-a)+a;
    
    }
    
    
}
