
package view;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConnecterAdministrateur extends Fenetre {

    public ConnecterAdministrateur() 
    {
        
        plan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        connecter = new javax.swing.JButton();

        
        plan.setBackground(new java.awt.Color(0, 0, 0));
        plan.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        plan.add(jLabel2);
        jLabel2.setBounds(10, 10, 1050, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        plan.add(jLabel3);
        jLabel3.setBounds(10, 610, 1050, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/password.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 80, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 20, 50, 50);

        login.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jPanel1.add(login);
        login.setBounds(70, 20, 210, 50);

        password.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jPanel1.add(password);
        password.setBounds(70, 80, 210, 50);

        connecter.setBackground(new java.awt.Color(0, 0, 0));
        connecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/connexion.png"))); // NOI18N
        connecter.setBorder(null);
        jPanel1.add(connecter);
        connecter.setBounds(10, 140, 270, 140);
        connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(!login.getText().equals("admin")&&!password.getText().equals("1234"))
                {
                    JOptionPane jop = new JOptionPane();
                    showMessageDialog(null, " Login et Password Incorrecte");
                    login.setText("");password.setText("");
                }
                else if (!login.getText().equals("admin")) 
                {
                    JOptionPane jop = new JOptionPane();
                    showMessageDialog(null, " Login  Incorrecte");
                    login.setText("");
                    password.setText("");
                }
                else if (!password.getText().equals("1234")) 
                {
                    JOptionPane jop = new JOptionPane();
                    showMessageDialog(null, " Password  Incorrecte");
                    password.setText("");
                }
                else
                {
                    setVisible(false);
                    new Administration();
                }
                
               
            }
        });

        plan.add(jPanel1);
        jPanel1.setBounds(390, 170, 290, 300);

       add(plan);
        plan.setBounds(0, 0, 1070, 670);
    }

   

    // Variables declaration - do not modify                     
    private javax.swing.JButton connecter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel plan;
    // End of variables declaration                   
}
