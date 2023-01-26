package view;

public class TelaProntuarioEnfermeiro extends javax.swing.JFrame {

    public TelaProntuarioEnfermeiro() {
        initComponents();
    }
                        
        private void initComponents() {
    
            labelNomeEnfer = new javax.swing.JLabel();
            labelNomeEnfermeiro = new javax.swing.JLabel();
            labelCoremEnfer = new javax.swing.JLabel();
            labelCoremEnfermeiro = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            labelNomePac = new javax.swing.JLabel();
            labelNomePaciente = new javax.swing.JLabel();
            labelIdadePac = new javax.swing.JLabel();
            labelIdadePaciente = new javax.swing.JLabel();
            labelPesoPac = new javax.swing.JLabel();
            TextFieldPesoPaciente = new javax.swing.JTextField();
            labelAlturaPac = new javax.swing.JLabel();
            TestFieldAlturaPaciente = new javax.swing.JTextField();
            buttonEnviarProntuario = new javax.swing.JButton();
            buttonVoltar = new javax.swing.JButton();
    
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
            labelNomeEnfer.setText("Nome do enfermeiro(a):");
    
            labelNomeEnfermeiro.setText("jLabel7");
    
            labelCoremEnfer.setText("COREM:");
    
            labelCoremEnfermeiro.setText("jLabel8");
    
            labelNomePac.setText("Nome do paciente:");
    
            labelNomePaciente.setText("jLabel9");
    
            labelIdadePac.setText("Idade:");
    
            labelIdadePaciente.setText("jLabel11");
    
            labelPesoPac.setText("Peso:");
    
            TextFieldPesoPaciente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    TextFieldPesoPacienteActionPerformed(evt);
                }
            });
    
            labelAlturaPac.setText("Altura:");
    
            TestFieldAlturaPaciente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    TestFieldAlturaPacienteActionPerformed(evt);
                }
            });
    
            buttonEnviarProntuario.setText("Enviar prontuário");
            buttonEnviarProntuario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonEnviarProntuarioActionPerformed(evt);
                }
            });
    
            buttonVoltar.setText("Voltar");
            buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonVoltarActionPerformed(evt);
                }
            });
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(buttonEnviarProntuario))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelNomeEnfer)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelNomeEnfermeiro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                    .addComponent(buttonVoltar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelCoremEnfer)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelCoremEnfermeiro))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelNomePac)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelNomePaciente))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelIdadePac)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelIdadePaciente))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelPesoPac)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TextFieldPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelAlturaPac)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TestFieldAlturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonVoltar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomeEnfer, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeEnfermeiro)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCoremEnfer)
                        .addComponent(labelCoremEnfermeiro))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNomePac)
                        .addComponent(labelNomePaciente))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIdadePac)
                        .addComponent(labelIdadePaciente))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPesoPac)
                        .addComponent(TextFieldPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAlturaPac)
                        .addComponent(TestFieldAlturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(buttonEnviarProntuario)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
    
            pack();
        }// </editor-fold>                        
    
        private void buttonEnviarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                       
           
        }                                                      
    
        private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
            
        }                                            
    
        private void TestFieldAlturaPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                        
            
        }                                                       
    
        private void TextFieldPesoPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                      
            
        }                                                     
    
              public static void main(String args[]) {
           
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(TelaProntuarioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(TelaProntuarioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(TelaProntuarioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(TelaProntuarioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
          
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TelaProntuarioEnfermeiro().setVisible(true);
                }
            });
        }
    
        // Variables declaration - do not modify                     
        private javax.swing.JTextField TestFieldAlturaPaciente;
        private javax.swing.JTextField TextFieldPesoPaciente;
        private javax.swing.JButton buttonEnviarProntuario;
        private javax.swing.JButton buttonVoltar;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JLabel labelAlturaPac;
        private javax.swing.JLabel labelCoremEnfer;
        private javax.swing.JLabel labelCoremEnfermeiro;
        private javax.swing.JLabel labelIdadePac;
        private javax.swing.JLabel labelIdadePaciente;
        private javax.swing.JLabel labelNomeEnfer;
        private javax.swing.JLabel labelNomeEnfermeiro;
        private javax.swing.JLabel labelNomePac;
        private javax.swing.JLabel labelNomePaciente;
        private javax.swing.JLabel labelPesoPac;
        // End of variables declaration                   
    }