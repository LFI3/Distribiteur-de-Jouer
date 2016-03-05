package view;

import controleur.Parametre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarteVisa extends Fenetre {

    public CarteVisa() {
        plan = new javax.swing.JPanel();
        CarteVisa = new javax.swing.JButton();
        fermer = new javax.swing.JButton();
        barre2 = new javax.swing.JLabel();
        barre1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        add(plan);

        //----------------------------------------------------------------------
        plan.setBackground(new java.awt.Color(0, 0, 0));
        plan.setLayout(null);
        plan.setBounds(0, 0, 1070, 670);
        plan.add(CarteVisa);
        plan.add(fermer);
        plan.add(barre2);
        plan.add(barre1);
        plan.add(jTextField2);
        plan.add(jButton1);
        plan.add(jLabel2);
        plan.add(jPasswordField1);
        plan.add(jLabel3);
        //----------------------------------------------------------------------
        CarteVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource(Parametre.cheminIcone + "visa.jpg"))); // NOI18N
        CarteVisa.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new javax.swing.ImageIcon(getClass().getResource("/image/cadre5.jpg")))); // NOI18N
        CarteVisa.setBounds(240, 80, 610, 300);
        
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
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBounds(420, 420, 310, 60);
        jTextField2.setFont(new java.awt.Font("Yu Gothic Light", 1, 36));
        //----------------------------------------------------------------------
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/connexion.png"))); // NOI18N
        jButton1.setBounds(750, 420, 270, 130);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String num=jTextField2.getText();
                String code = jPasswordField1.getText();
               if(controleur.Verification.verifNotVideEtInt(num,code))
               {
                 if(modele.Carte.existe(Integer.valueOf(num), Integer.valueOf(code)))
                 {
                    modele.Carte.modifier(Integer.valueOf(num), Integer.valueOf(code));
                 }
                 else
                 {
                     modele.Carte.inserer(Integer.valueOf(num), Integer.valueOf(code));
                 }
                   
                setVisible(false);
                new Jouets();
               }
               else
               {
                   jTextField2.setText("");
                   jPasswordField1.setText("");
               }
                
            }
        });
        //----------------------------------------------------------------------
        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Code     :");
        jLabel2.setBounds(240, 490, 170, 60);
        //----------------------------------------------------------------------
        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero :");
        jLabel3.setBounds(240, 420, 170, 60);
        //----------------------------------------------------------------------
        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setFont(new java.awt.Font("Yu Gothic Light", 1, 36)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBounds(420, 490, 310, 60);
            //----------------------------------------------------------------------

    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel barre1;
    private javax.swing.JLabel barre2;
    private javax.swing.JButton CarteVisa;
    private javax.swing.JButton fermer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel plan;
    // End of variables declaration                   
}
