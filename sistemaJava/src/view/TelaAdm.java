
package view;

import javax.swing.JOptionPane;

public class TelaAdm extends javax.swing.JFrame {
 // para não abrir várias vezes a tela de login
    public static boolean login;
    
    
    public TelaAdm() {
        initComponents();
        
      //txtCodigoIdentificacao (new LimitaCaracteres (15,LimitaCaractere.TipoEntrada.CODIGO));
      //txtSenha ( new LimitaCaractere(10, LimitaCaracteres.TipoEntrada.SENHA));
    }

                              
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        textcodigoidentificacao = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        NovoCadastro = new javax.swing.JButton();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenstelas/Design sem nome.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("telaDeLoginInicial");
        getContentPane().setLayout(null);

        jLabel1.setText("Código de Identificação:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 60, 129, 16);

        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(272, 138, 35, 16);

        entrar.setText("ENTRAR");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(258, 200, 73, 23);

        textcodigoidentificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcodigoidentificacaoActionPerformed(evt);
            }
        });
        getContentPane().add(textcodigoidentificacao);
        textcodigoidentificacao.setBounds(211, 90, 170, 22);

        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtsenha);
        txtsenha.setBounds(210, 160, 170, 22);

        NovoCadastro.setText("Novo cadastro");
        NovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(NovoCadastro);
        NovoCadastro.setBounds(240, 230, 110, 23);

        pack();
    }// </editor-fold>                        

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {                                       
     if (textcodigoidentificacao.getText().equals("usuário") && new String(txtsenha.getPassword()) .equals("123")){
         JOptionPane.showMessageDialog(null,"Acesso permitido");
     }   
     else{ 
         JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos!");
         
     }
    }                                      

    private void textcodigoidentificacaoActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void NovoCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                             
       // new CadastroFuncionarios().setVisible(true);
    }                                            

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //try {
            //for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                //if ("Nimbus".equals(info.getName())) {
                   // javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   // break;
                //}
              //}
        //} catch (ClassNotFoundException ex) {
          //  java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (InstantiationException ex) {
           /* * java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        /*} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
          </editor-fold>

        /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new telaprincipal().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify                     
    private javax.swing.JButton NovoCadastro;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textcodigoidentificacao;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration                   
}
