
package view;

import modele.Jouet;

public class Administration extends Fenetre {

    public Administration() 
    {
        plan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        poupe = new javax.swing.JLabel();
        ajouterPeluche = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        pleuche = new javax.swing.JLabel();
        ajouterPoupe = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cheveux = new javax.swing.JLabel();
        ajouterCheveux = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        arme = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        hero = new javax.swing.JLabel();
        ajouterHero = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        voiture = new javax.swing.JLabel();
        ajouterVoiture = new javax.swing.JButton();
        ajouterArme = new javax.swing.JButton();
        fermer = new javax.swing.JButton();

        
        plan.setBackground(new java.awt.Color(0, 0, 0));
        plan.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        plan.add(jLabel2);
        jLabel2.setBounds(10, 10, 1050, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barre.jpeg"))); // NOI18N
        plan.add(jLabel3);
        jLabel3.setBounds(10, 610, 1050, 50);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Compartiment des Garçon");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 390, 50);

        plan.add(jPanel2);
        jPanel2.setBounds(460, 110, 390, 60);

        jPanel3.setBackground(new java.awt.Color(255, 0, 204));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Des Poupées");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 390, 50);

        plan.add(jPanel3);
        jPanel3.setBounds(40, 190, 390, 60);

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Compartiment des Filles");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 0, 390, 50);

        plan.add(jPanel4);
        jPanel4.setBounds(40, 110, 390, 60);

        jPanel5.setBackground(new java.awt.Color(153, 0, 153));
        jPanel5.setLayout(null);

        poupe.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        poupe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(poupe);
        poupe.setBounds(0, 0, 70, 50);

        plan.add(jPanel5);
        jPanel5.setBounds(40, 260, 70, 60);

        ajouterPeluche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter.jpg"))); // NOI18N
        ajouterPeluche.setBorder(null);
       
        plan.add(ajouterPeluche);
        ajouterPeluche.setBounds(120, 530, 80, 70);

        jPanel6.setBackground(new java.awt.Color(255, 0, 204));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Des Accessoires pour les cheveux");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 50);

        plan.add(jPanel6);
        jPanel6.setBounds(40, 330, 400, 60);

        jPanel7.setBackground(new java.awt.Color(153, 0, 153));
        jPanel7.setLayout(null);

        pleuche.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        pleuche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(pleuche);
        pleuche.setBounds(0, 0, 70, 50);

        plan.add(jPanel7);
        jPanel7.setBounds(40, 540, 70, 60);

        ajouterPoupe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter.jpg"))); // NOI18N
        ajouterPoupe.setBorder(null);
        
        plan.add(ajouterPoupe);
        ajouterPoupe.setBounds(120, 250, 80, 80);

        jPanel8.setBackground(new java.awt.Color(255, 0, 204));
        jPanel8.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Des Peluches roses");
        jPanel8.add(jLabel7);
        jLabel7.setBounds(0, 0, 400, 50);

        plan.add(jPanel8);
        jPanel8.setBounds(40, 470, 400, 60);

        jPanel9.setBackground(new java.awt.Color(153, 0, 153));
        jPanel9.setLayout(null);

        cheveux.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        cheveux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(cheveux);
        cheveux.setBounds(0, 0, 70, 50);

        plan.add(jPanel9);
        jPanel9.setBounds(40, 400, 70, 60);

        ajouterCheveux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter.jpg"))); // NOI18N
        ajouterCheveux.setBorder(null);
        
        plan.add(ajouterCheveux);
        ajouterCheveux.setBounds(120, 390, 80, 80);

        jPanel10.setBackground(new java.awt.Color(0, 102, 255));
        jPanel10.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Des Miniatures d'armes");
        jPanel10.add(jLabel11);
        jLabel11.setBounds(0, 0, 390, 50);

        plan.add(jPanel10);
        jPanel10.setBounds(460, 190, 390, 60);

        jPanel11.setBackground(new java.awt.Color(153, 255, 255));
        jPanel11.setLayout(null);

        arme.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        arme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(arme);
        arme.setBounds(0, 0, 70, 50);

        plan.add(jPanel11);
        jPanel11.setBounds(460, 260, 70, 60);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.jpg"))); // NOI18N
        home.setBorder(null);
       
        plan.add(home);
        home.setBounds(960, 170, 100, 100);

        jPanel12.setBackground(new java.awt.Color(0, 102, 204));
        jPanel12.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Des Figurine de super héro");
        jPanel12.add(jLabel13);
        jLabel13.setBounds(0, 0, 400, 50);

        plan.add(jPanel12);
        jPanel12.setBounds(460, 330, 400, 60);

        jPanel13.setBackground(new java.awt.Color(102, 255, 255));
        jPanel13.setLayout(null);

        hero.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        hero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         jPanel13.add(hero);
        hero.setBounds(0, 0, 70, 50);

        plan.add(jPanel13);
        jPanel13.setBounds(460, 400, 70, 60);

        ajouterHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter.jpg"))); // NOI18N
        ajouterHero.setBorder(null);
       
        plan.add(ajouterHero);
        ajouterHero.setBounds(540, 390, 80, 80);

        jPanel14.setBackground(new java.awt.Color(0, 102, 204));
        jPanel14.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Des Miniatures de voiture et moto");
        jPanel14.add(jLabel15);
        jLabel15.setBounds(0, 0, 400, 50);

        plan.add(jPanel14);
        jPanel14.setBounds(460, 470, 400, 60);

        jPanel15.setBackground(new java.awt.Color(102, 255, 255));
        jPanel15.setLayout(null);

        voiture.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        voiture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       
        jPanel15.add(voiture);
        voiture.setBounds(0, 0, 70, 50);

        plan.add(jPanel15);
        jPanel15.setBounds(460, 540, 70, 60);

        ajouterVoiture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter.jpg"))); // NOI18N
        ajouterVoiture.setBorder(null);
        
        plan.add(ajouterVoiture);
        ajouterVoiture.setBounds(540, 530, 80, 70);

        ajouterArme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter.jpg"))); // NOI18N
        ajouterArme.setBorder(null);
        
        plan.add(ajouterArme);
        ajouterArme.setBounds(540, 250, 80, 80);

        fermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fermer.png"))); // NOI18N
        fermer.setBorder(null);
        
        plan.add(fermer);
        fermer.setBounds(950, 70, 110, 90);

        add(plan);
        plan.setBounds(0, 0, 1070, 670);
        initialiser();
        ajouterPoupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modele.Jouet.ajouter(3);
                initialiser();

            }
        });
        ajouterCheveux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modele.Jouet.ajouter(1); 
                initialiser();
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                new Demarrage();
            }
        });
        ajouterHero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modele.Jouet.ajouter(5);initialiser();
            }
        });
        ajouterVoiture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modele.Jouet.ajouter(6);initialiser();
            }
        });
        ajouterArme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modele.Jouet.ajouter(4);initialiser();
            }
        });
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);

            }
        });
        ajouterPeluche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modele.Jouet.ajouter(2);initialiser();
            }
        });
    }

    public  void initialiser() 
    {
            cheveux. setText(modele.Jouet.afficher(1) + "");
            pleuche.setText(modele.Jouet.afficher(2) + "");         
            poupe .setText(modele.Jouet.afficher(3) + "");
            arme.setText(modele.Jouet.afficher(4) + "");
            hero .setText(modele.Jouet.afficher(5) + "");
            voiture.setText(modele.Jouet.afficher(6) + "");
    }
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton ajouterArme;
    private javax.swing.JButton ajouterCheveux;
    private javax.swing.JButton ajouterHero;
    private javax.swing.JButton ajouterPeluche;
    private javax.swing.JButton ajouterPoupe;
    private javax.swing.JButton ajouterVoiture;
    private javax.swing.JLabel arme;
    private javax.swing.JLabel cheveux;
    private javax.swing.JButton fermer;
    private javax.swing.JLabel hero;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel plan;
    private javax.swing.JLabel pleuche;
    private javax.swing.JLabel poupe;
    private javax.swing.JLabel voiture;
    // End of variables declaration                   
}
