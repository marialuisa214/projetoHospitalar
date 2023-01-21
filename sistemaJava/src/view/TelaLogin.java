package view;


public class TelaLogin extends javax.swing.JFrame{
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        passwordSenha = new javax.swing.JPasswordField();
        textFieldUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        buttonEntrar = new javax.swing.JButton();
        radioAdm = new javax.swing.JRadioButton();
        radioAtendente = new javax.swing.JRadioButton();
        radioMedico = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameLogin"); // NOI18N

        textFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsuarioActionPerformed(evt);
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

        buttonEntrar.setBackground(new java.awt.Color(204, 204, 255));
        buttonEntrar.setFont(new java.awt.Font("Gujarati MT", 0, 18)); // NOI18N
        buttonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEntrar.setText("Entrar");

        radioAdm.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        radioAdm.setText("Admisnistrador");
        radioAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdmActionPerformed(evt);
            }
        });

        radioAtendente.setFont(new java.awt.Font("Gurmukhi MN", 0, 14)); // NOI18N
        radioAtendente.setText("Atendente");

        radioMedico.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        radioMedico.setText("Médico");

        jRadioButton1.setFont(new java.awt.Font("Gujarati MT", 0, 14)); // NOI18N
        jRadioButton1.setText("Enfermeiro");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(labelSenha)
                    .addComponent(passwordSenha)
                    .addComponent(labelUsuario)
                    .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(radioAdm)
                .addGap(34, 34, 34)
                .addComponent(radioAtendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(26, 26, 26)
                .addComponent(radioMedico)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAtendente)
                    .addComponent(radioAdm)
                    .addComponent(jRadioButton1)
                    .addComponent(radioMedico))
                .addGap(26, 26, 26)
                .addComponent(buttonEntrar)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>                        

    private void textFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       
    }                                                

    private void radioAdmActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    }                                        

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
    }                                             

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonEntrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField passwordSenha;
    private javax.swing.JRadioButton radioAdm;
    private javax.swing.JRadioButton radioAtendente;
    private javax.swing.JRadioButton radioMedico;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration                   
}


    
