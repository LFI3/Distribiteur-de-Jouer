/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Hachem
 */
public class Demarrage extends Fenetre {

    
    public Demarrage()
    {
       
        plan = new javax.swing.JPanel();
        administration = new javax.swing.JButton();
        acheter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        plan.setBackground(new java.awt.Color(0, 0, 0));
        plan.setLayout(null);

        administration.setBackground(new java.awt.Color(255, 255, 255));
        administration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/acheteur.png"))); // NOI18N
        administration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        administration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                new Paiement();
            }
        });
        plan.add(administration);
        administration.setBounds(750, 150, 260, 260);

        acheter.setBackground(new java.awt.Color(0, 0, 0));
        acheter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/administration.jpg"))); // NOI18N
        acheter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        acheter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                new ConnecterAdministrateur();
            }
        });
        plan.add(acheter);
        acheter.setBounds(70, 150, 260, 262);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/will.jpg"))); // NOI18N
        plan.add(jLabel1);
        jLabel1.setBounds(180, 110, 540, 510);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        plan.add(jLabel2);
        jLabel2.setBounds(10, 10, 1050, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        plan.add(jLabel3);
        jLabel3.setBounds(10, 610, 1050, 50);

        getContentPane().add(plan);
        plan.setBounds(0, 0, 1070, 670); 
    }

   
   
 

    // Variables declaration - do not modify                     
    private javax.swing.JButton acheter;
    private javax.swing.JButton administration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel plan;
    // End of variables declaration                   
}
