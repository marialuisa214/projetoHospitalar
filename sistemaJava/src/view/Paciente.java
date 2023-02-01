package view;

public class Paciente extends javax.swing.JFrame {

    public Paciente() {
        initComponents();
    }
                   
    private void initComponents() {

        inputEndereco = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        selecaooSexoFeminino = new javax.swing.JCheckBox();
        labelTelefone = new javax.swing.JLabel();
        selecaoSexoMasculino = new javax.swing.JCheckBox();
        inputTelefone = new javax.swing.JTextField();
        labelNomePaciente = new javax.swing.JLabel();
        labelCidadeEstado = new javax.swing.JLabel();
        labelCpfPaciente = new javax.swing.JLabel();
        inputCidadeEstado = new javax.swing.JTextField();
        labelSexoPaciente = new javax.swing.JLabel();
        labelRG = new javax.swing.JLabel();
        labelNascimentoPaciente = new javax.swing.JLabel();
        inputRG = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        labelObsMedica = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        buttonCadastraPaciente = new javax.swing.JButton();
        inputEmail = new javax.swing.JTextField();
        inputNascimento = new javax.swing.JTextField();
        labelCadastroPaciente = new javax.swing.JLabel();
        patologiascroll = new javax.swing.JScrollPane();
        restricoesMedicas = new javax.swing.JTextArea();
        buttonNovoExame = new javax.swing.JButton();
        buttonNovaConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoActionPerformed(evt);
            }
        });

        labelEndereco.setText("Endereço residencial:");

        selecaooSexoFeminino.setText("Feminino");
        selecaooSexoFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaooSexoFemininoActionPerformed(evt);
            }
        });

        labelTelefone.setText("Telefone:");

        selecaoSexoMasculino.setText("Masculino");
        selecaoSexoMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoSexoMasculinoActionPerformed(evt);
            }
        });

        inputTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneActionPerformed(evt);
            }
        });

        labelNomePaciente.setText("Nome do Paciente:");

        labelCidadeEstado.setText("Cidade/Estado:");

        labelCpfPaciente.setText("CPF:");

        labelSexoPaciente.setText("Sexo:");

        labelRG.setText("RG:");

        labelNascimentoPaciente.setText("Data de nascimento:");

        inputRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRGActionPerformed(evt);
            }
        });

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        labelObsMedica.setText("possui alguma observação médica?");

        labelEmail.setText("E-mail:");

        inputCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfActionPerformed(evt);
            }
        });

        buttonCadastraPaciente.setBackground(new java.awt.Color(153, 153, 153));
        buttonCadastraPaciente.setText("Alterar Cadastro");
        buttonCadastraPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastraPacienteActionPerformed(evt);
            }
        });

        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        inputNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNascimentoActionPerformed(evt);
            }
        });

        labelCadastroPaciente.setText("Paciente");

        restricoesMedicas.setColumns(20);
        restricoesMedicas.setRows(5);
        restricoesMedicas.setText("(alergia, alerta ou restrição médica, etc..) ");
        patologiascroll.setViewportView(restricoesMedicas);

        buttonNovoExame.setBackground(new java.awt.Color(153, 153, 153));
        buttonNovoExame.setText("Novo Exame");
        buttonNovoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoExameActionPerformed(evt);
            }
        });

        buttonNovaConsulta.setBackground(new java.awt.Color(153, 153, 153));
        buttonNovaConsulta.setText("Nova Consulta");
        buttonNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(labelCadastroPaciente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputTelefone))
                            .addComponent(labelObsMedica)
                            .addComponent(labelEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSexoPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaoSexoMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selecaooSexoFeminino))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labelRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputRG, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(labelCpfPaciente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNascimentoPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputNascimento)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(inputCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomePaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(buttonCadastraPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonNovoExame)
                                .addGap(12, 12, 12)
                                .addComponent(buttonNovaConsulta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCidadeEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCidadeEstado))
                            .addComponent(patologiascroll)
                            .addComponent(inputEndereco))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelCadastroPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomePaciente)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCpf)
                    .addComponent(inputRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRG)
                    .addComponent(labelCpfPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSexoPaciente)
                    .addComponent(selecaoSexoMasculino)
                    .addComponent(selecaooSexoFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNascimentoPaciente)
                    .addComponent(inputNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefone)
                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidadeEstado)
                    .addComponent(inputCidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelObsMedica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patologiascroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastraPaciente)
                    .addComponent(buttonNovoExame)
                    .addComponent(buttonNovaConsulta))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>                        

    private void inputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void selecaooSexoFemininoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void selecaoSexoMasculinoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void inputRGActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void inputCpfActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void buttonCadastraPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void inputNascimentoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void buttonNovoExameActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void buttonNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonCadastraPaciente;
    private javax.swing.JButton buttonNovaConsulta;
    private javax.swing.JButton buttonNovoExame;
    private javax.swing.JTextField inputCidadeEstado;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputNascimento;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputRG;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel labelCadastroPaciente;
    private javax.swing.JLabel labelCidadeEstado;
    private javax.swing.JLabel labelCpfPaciente;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNascimentoPaciente;
    private javax.swing.JLabel labelNomePaciente;
    private javax.swing.JLabel labelObsMedica;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelSexoPaciente;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JScrollPane patologiascroll;
    private javax.swing.JTextArea restricoesMedicas;
    private javax.swing.JCheckBox selecaoSexoMasculino;
    private javax.swing.JCheckBox selecaooSexoFeminino;
    // End of variables declaration                   
}

