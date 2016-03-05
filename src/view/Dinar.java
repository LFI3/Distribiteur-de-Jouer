
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dinar extends Fenetre implements Runnable {

   
    public Dinar() 
    {
        
        plan = new javax.swing.JPanel();
        Dinar = new javax.swing.JButton();
        fermer = new javax.swing.JButton();
        barre2 = new javax.swing.JLabel();
        barre1 = new javax.swing.JLabel();
        noir = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        p4 = new javax.swing.JPanel();
        p5 = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        p7 = new javax.swing.JPanel();
        p8 = new javax.swing.JPanel();
        p9 = new javax.swing.JPanel();
        p13 = new javax.swing.JPanel();
        p14 = new javax.swing.JPanel();
        p15 = new javax.swing.JPanel();
        p12 = new javax.swing.JPanel();
        p11 = new javax.swing.JPanel();
        p10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        t = new Thread(this);
        //----------------------------------------------------------------------
        plan.setBackground(new java.awt.Color(0, 0, 0));
        plan.setBounds(0, 0, 1070, 670);
        plan.setLayout(null);
        plan.add(fermer); 
        plan.add(Dinar);
        plan.add(barre2); 
        plan.add(barre1);
        plan.add(noir);
        plan.add(jButton2);
        add(plan);
        //----------------------------------------------------------------------
        Dinar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dinar.jpg"))); // NOI18N
        Dinar.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new javax.swing.ImageIcon(getClass().getResource("/image/cadre5.jpg")))); // NOI18N
        Dinar.setBounds(240, 110, 610, 300);
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
        noir.setBackground(new java.awt.Color(0, 0, 0));
        noir.setVisible(false);
        noir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        noir.setLayout(null);
        noir.setBounds(20, 120, 120, 450);
        noir.add(p14);
        noir.add(p15);
        noir.add(p12);
        noir.add(p11);
        noir.add(p10);
        noir.add(p3); 
        noir.add(p1);
        noir.add(p2);
        noir.add(p4);
        noir.add(p5);
        noir.add(p6); 
        noir.add(p7); 
        noir.add(p8);
        noir.add(p9);
        noir.add(p13);
        //----------------------------------------------------------------------
        p3.setBackground(new java.awt.Color(0, 102, 153));
        p3.setBounds(0, 360, 120, 30);
        p3.setVisible(false);
        //----------------------------------------------------------------------
        p1.setBackground(new java.awt.Color(0, 51, 51));
        p1.setBounds(0, 420, 120, 30);
        p1.setVisible(false);
        //----------------------------------------------------------------------
        p2.setBackground(new java.awt.Color(0, 153, 153));
        p2.setBounds(0, 390, 120, 30);
        p2.setVisible(false);
        //----------------------------------------------------------------------
        p4.setBackground(new java.awt.Color(0, 0, 204));
        p4.setBounds(0, 330, 120, 30);
        p4.setVisible(false);
        //----------------------------------------------------------------------        
        p5.setBackground(new java.awt.Color(153, 51, 255));
        p5.setBounds(0, 300, 120, 30);
        p5.setVisible(false);
        //----------------------------------------------------------------------
        p6.setBackground(new java.awt.Color(255, 51, 153));
        p6.setBounds(0, 270, 120, 30);
        p6.setVisible(false);
        //----------------------------------------------------------------------
        p7.setBackground(new java.awt.Color(255, 51, 51));
        p7.setBounds(0, 240, 120, 30);
        p7.setVisible(false);
        //----------------------------------------------------------------------
        p8.setBackground(new java.awt.Color(255, 102, 51));
        p8.setBounds(0, 210, 120, 30);
        p8.setVisible(false);
        //----------------------------------------------------------------------
        p9.setBackground(new java.awt.Color(255, 204, 51));
        p9.setBounds(0, 180, 120, 30);
        p9.setVisible(false);
        //----------------------------------------------------------------------
        p13.setBackground(new java.awt.Color(102, 255, 102));
        p13.setBounds(0, 60, 120, 30);
        p13.setVisible(false);
        //----------------------------------------------------------------------
        p14.setBackground(new java.awt.Color(102, 255, 153));
        p14.setBounds(0, 30, 120, 30);
        p14.setVisible(false);
        //----------------------------------------------------------------------
        p15.setBackground(new java.awt.Color(204, 255, 204));
        p15.setBounds(0, 0, 120, 30);
        p15.setVisible(false);
        //----------------------------------------------------------------------
        p12.setBackground(new java.awt.Color(51, 255, 51));
        p12.setBounds(0, 90, 120, 30);
        p12.setVisible(false);
        //----------------------------------------------------------------------
        p11.setBackground(new java.awt.Color(153, 255, 51));
        p11.setBounds(0, 120, 120, 30);
        p11.setVisible(false);
        //----------------------------------------------------------------------
        p10.setBackground(new java.awt.Color(204, 255, 51));
        p10.setBounds(0, 150, 120, 30);
        p10.setVisible(false);
        //----------------------------------------------------------------------
        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/valider.png"))); // NOI18N
        jButton2.setBounds(340, 450, 400, 120);
        jButton2.addActionListener(new ActionListener() 
        {
        public void actionPerformed(ActionEvent e) 
        {
           t.start();
           
        }
        });
        //----------------------------------------------------------------------
       

    }

    // Variables declaration - do not modify 
    private Thread t ;
    private javax.swing.JLabel barre1;
    private javax.swing.JLabel barre2;
    private javax.swing.JButton Dinar;
    private javax.swing.JButton fermer;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel noir;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p14;
    private javax.swing.JPanel p15;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JPanel plan;
    // End of variables declaration                   

   
    public void run()
    {
       jButton2.setVisible(false);
        noir.setVisible(true);
      try
      {
      p1.setVisible(true);t.sleep(300);
      p2.setVisible(true); t.sleep(300);
      p3.setVisible(true);t.sleep(300);
          p4.setVisible(true);
          t.sleep(300);
          p5.setVisible(true);
          t.sleep(300);
          p6.setVisible(true);
          t.sleep(300);
          p7.setVisible(true);
          t.sleep(300);
          p8.setVisible(true);
          t.sleep(300);
          p9.setVisible(true);
          t.sleep(300);
          p10.setVisible(true);
          t.sleep(300);
          p11.setVisible(true);
          t.sleep(300);
          p12.setVisible(true);
          t.sleep(300);
          p13.setVisible(true);
          t.sleep(300);
          p14.setVisible(true);
          t.sleep(300);
          p15.setVisible(true);
          t.sleep(300);
          setVisible(false);
          new Jouets();
      }
      catch(Exception e)
      {
      System.out.println("erreur");
      }
    }
}
