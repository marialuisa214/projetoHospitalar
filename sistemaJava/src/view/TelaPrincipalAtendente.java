package view;

import control.ControlePaciente;

public class TelaPrincipalAtendente extends javax.swing.JFrame {

    private ControlePaciente listaPaciente;
    public TelaPrincipalAtendente(ControlePaciente pacientes) {
        this.listaPaciente = pacientes;
        initComponents();
      }
                    
    private void initComponents() {

        labelAtendente = new javax.swing.JLabel();
        labelIdAtendente = new javax.swing.JLabel();
        labelDataHora = new javax.swing.JLabel();
        fieldBuscaPaciente = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();
        buttonBuscaPaciente = new javax.swing.JButton();
        buttonSolicitações = new javax.swing.JButton();
        buttonCadastraPaciente = new javax.swing.JButton();
        buttonAgendaConsulta = new javax.swing.JButton();
        buttonAgendaExame = new javax.swing.JButton();
        buttonNovaEntrada = new javax.swing.JButton();
        labelCadastrado = new javax.swing.JLabel();
        labelNaocadastrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAtendente.setText("<nome atendente>");

        labelIdAtendente.setText("<id atendente>");

        labelDataHora.setText("<data/hora atual>");

        fieldBuscaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaPacienteActionPerformed(evt);
            }
        });

        buttonVoltar.setBackground(new java.awt.Color(153, 153, 153));
        buttonVoltar.setText("voltar");

        buttonBuscaPaciente.setBackground(new java.awt.Color(153, 153, 153));
        buttonBuscaPaciente.setText("Buscar Paciente");
        buttonBuscaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscaPacienteActionPerformed(evt);
            }
        });

        buttonSolicitações.setBackground(new java.awt.Color(153, 153, 153));
        buttonSolicitações.setText("Solicitações");
        buttonSolicitações.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSolicitaçõesActionPerformed(evt);
            }
        });

        buttonCadastraPaciente.setBackground(new java.awt.Color(153, 153, 153));
        buttonCadastraPaciente.setText("Novo Paciente");
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

        buttonNovaEntrada.setBackground(new java.awt.Color(153, 153, 153));
        buttonNovaEntrada.setText("Nova Entrada");
        buttonNovaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovaEntradaActionPerformed(evt);
            }
        });

        labelCadastrado.setText("Este paciente está cadastrado!");

        labelNaocadastrado.setText("Este paciente não está cadastrado!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buttonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAtendente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataHora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdAtendente, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldBuscaPaciente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCadastrado)
                                    .addComponent(labelNaocadastrado))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonAgendaExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAgendaConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(buttonCadastraPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSolicitações, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBuscaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonNovaEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAtendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIdAtendente))
                    .addComponent(buttonVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDataHora)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldBuscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscaPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSolicitações)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCadastraPaciente))
                    .addComponent(labelCadastrado)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelNaocadastrado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAgendaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAgendaExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonNovaEntrada)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>                        

    private void buttonBuscaPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void fieldBuscaPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   

    }                                                  

    private void buttonCadastraPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        this.dispose();
        new CadastroPaciente(listaPaciente).setVisible(true);
    }                                                      

    private void buttonSolicitaçõesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void buttonAgendaConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        new AgendaConsulta().setVisible(true);
    }                                                    

    private void buttonAgendaExameActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        new AgendaExame().setVisible(true);
    }                                                 

    private void buttonNovaEntradaActionPerformed(java.awt.event.ActionEvent evt) {                                                  
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
            java.util.logging.Logger.getLogger(TelaPrincipalAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAgendaConsulta;
    private javax.swing.JButton buttonAgendaExame;
    private javax.swing.JButton buttonBuscaPaciente;
    private javax.swing.JButton buttonCadastraPaciente;
    private javax.swing.JButton buttonNovaEntrada;
    private javax.swing.JButton buttonSolicitações;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField fieldBuscaPaciente;
    private javax.swing.JLabel labelAtendente;
    private javax.swing.JLabel labelCadastrado;
    private javax.swing.JLabel labelDataHora;
    private javax.swing.JLabel labelIdAtendente;
    private javax.swing.JLabel labelNaocadastrado;
    // End of variables declaration                   
}