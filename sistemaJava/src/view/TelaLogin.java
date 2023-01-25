package view;

import control.ControleDados;

public class TelaLogin extends javax.swing.JFrame {
    public TelaLogin() {
        initComponents();
    }
                         
    private void initComponents() {

        // buttonGroup1 = new javax.swing.ButtonGroup();
        passwordSenha = new javax.swing.JPasswordField();
        textUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        radioAdm = new javax.swing.JRadioButton();
        radioAtendente = new javax.swing.JRadioButton();
        radioMedico = new javax.swing.JRadioButton();
        radioEnfermeiro = new javax.swing.JRadioButton();

        controle = new ControleDados();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameLogin"); // NOI18N

        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(102, 102, 255));
        labelUsuario.setText("Usuario");

        labelSenha.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(102, 102, 255));
        labelSenha.setText("Senha");

        labelLogin.setFont(new java.awt.Font("Gujarati MT", 0, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(102, 102, 255));
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("Login");
        labelLogin.setMaximumSize(new java.awt.Dimension(44, 24));
        labelLogin.setMinimumSize(new java.awt.Dimension(44, 24));


        botaoEntrar.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(102, 0, 255));
        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        radioAdm.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        radioAdm.setText("Admisnistrador");
        radioAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdmActionPerformed(evt);
            }
        });

        radioAtendente.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        radioAtendente.setText("Atendente");

        radioMedico.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        radioMedico.setText("Médico");

        radioEnfermeiro.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        radioEnfermeiro.setText("Enfermeiro");
        radioEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEnfermeiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(labelSenha)
                    .addComponent(passwordSenha)
                    .addComponent(labelUsuario)
                    .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(radioAdm)
                .addGap(34, 34, 34)
                .addComponent(radioAtendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(radioEnfermeiro)
                .addGap(26, 26, 26)
                .addComponent(radioMedico)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAtendente)
                    .addComponent(radioAdm)
                    .addComponent(radioEnfermeiro)
                    .addComponent(radioMedico))
                .addGap(26, 26, 26)
                .addComponent(botaoEntrar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>                        

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           

    private void radioAdmActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    }                                        

    private void radioEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
    }                                               

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        if(radioMedico.isSelected()){
            if(textUsuario.getText().equals("Ana") && passwordSenha.getText().equals("123")){
                new TelaPrincipalMedico().setVisible(true);
                this.dispose();
            }
        }else if(radioAdm.isSelected()){
         
        }else if(radioAtendente.isSelected()){
         
        }else if(radioEnfermeiro.isSelected()){
        
        }
        
        
        
        
        
        
    }                                           

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoEntrar;
    // private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField passwordSenha;
    private javax.swing.JRadioButton radioAdm;
    private javax.swing.JRadioButton radioAtendente;
    private javax.swing.JRadioButton radioEnfermeiro;
    private javax.swing.JRadioButton radioMedico;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration     
    private ControleDados controle;

    //CONSTRUTOR
    public TelaLogin(ControleDados controle){
        this.controle = controle;

    }
}