package view;

public class TransicaoMetodosAtendente extends javax.swing.JFrame {

    public TransicaoMetodosAtendente() {
        initComponents();
    }
                       
    private void initComponents() {

        labelAtendente = new javax.swing.JLabel();
        labelIdAtendente = new javax.swing.JLabel();
        labelDataHora = new javax.swing.JLabel();
        buttonBuscaPaciente = new javax.swing.JButton();
        fieldBuscaPaciente = new javax.swing.JTextField();
        buttonCadastraPaciente = new javax.swing.JButton();
        buttonAgendaConsulta = new javax.swing.JButton();
        buttonAgendaExame = new javax.swing.JButton();
        buttonSolicitações = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAtendente.setText("<nome atendente>");

        labelIdAtendente.setText("<id atendente>");

        labelDataHora.setText("<data/hora atual>");

        buttonBuscaPaciente.setBackground(new java.awt.Color(153, 153, 153));
        buttonBuscaPaciente.setText("Buscar Paciente");
        buttonBuscaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscaPacienteActionPerformed(evt);
            }
        });

        fieldBuscaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaPacienteActionPerformed(evt);
            }
        });

        buttonCadastraPaciente.setBackground(new java.awt.Color(153, 153, 153));
        buttonCadastraPaciente.setText("Cadastrar Paciente");
        buttonCadastraPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastraPacienteActionPerformed(evt);
            }
        });

        buttonAgendaConsulta.setBackground(new java.awt.Color(153, 153, 153));
        buttonAgendaConsulta.setText("Agenda Consulta");
        buttonAgendaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaConsultaActionPerformed(evt);
            }
        });

        buttonAgendaExame.setBackground(new java.awt.Color(153, 153, 153));
        buttonAgendaExame.setText("Agenda Exame");
        buttonAgendaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaExameActionPerformed(evt);
            }
        });

        buttonSolicitações.setBackground(new java.awt.Color(153, 153, 153));
        buttonSolicitações.setText("Solicitações");
        buttonSolicitações.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSolicitaçõesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAtendente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataHora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdAtendente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonAgendaExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAgendaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldBuscaPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBuscaPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCadastraPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(buttonSolicitações, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelAtendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIdAtendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDataHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(fieldBuscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBuscaPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastraPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAgendaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAgendaExame)
                    .addComponent(buttonSolicitações))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>                        

    private void buttonBuscaPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void fieldBuscaPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void buttonCadastraPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        new CadastroPaciente().setVisible(true);
    }                                                      

    private void buttonSolicitaçõesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void buttonAgendaConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void buttonAgendaExameActionPerformed(java.awt.event.ActionEvent evt) {                                                  
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
            java.util.logging.Logger.getLogger(TransicaoMetodosAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransicaoMetodosAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransicaoMetodosAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransicaoMetodosAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransicaoMetodosAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAgendaConsulta;
    private javax.swing.JButton buttonAgendaExame;
    private javax.swing.JButton buttonBuscaPaciente;
    private javax.swing.JButton buttonCadastraPaciente;
    private javax.swing.JButton buttonSolicitações;
    private javax.swing.JTextField fieldBuscaPaciente;
    private javax.swing.JLabel labelAtendente;
    private javax.swing.JLabel labelDataHora;
    private javax.swing.JLabel labelIdAtendente;
    // End of variables declaration                   
}