package view;


import control.ControleDados;
import model.*;

public class TelaRelatorioConsulta extends javax.swing.JFrame {

    
    public TelaRelatorioConsulta(ControleDados dados, Marcada consulta) {
        this.dados = dados;
        this.consulta = consulta;
        initComponents();
    }

                        
    private void initComponents() {

        labelCrm = new javax.swing.JLabel();
        botaoVoltarMedico = new javax.swing.JButton();
        labelNomeMedico = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelPaciente = new javax.swing.JLabel();
        labelCodigoConsulta = new javax.swing.JLabel();
        botaoConsultaProntuario = new javax.swing.JButton();
        labelTipoConsulta = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        botaoReceita = new javax.swing.JButton();
        botaoFinalizaConsulta = new javax.swing.JButton();
        botaoAtestado = new javax.swing.JButton();
        labelNomePaciente = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        botaoReceita1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCrm.setFont(new java.awt.Font("Gujarati MT", 0, 8)); // NOI18N
        labelCrm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrm.setText(consulta.getMedico().getCrm());

        botaoVoltarMedico.setBackground(new java.awt.Color(204, 153, 255));
        botaoVoltarMedico.setFont(new java.awt.Font("Gujarati MT", 1, 13)); // NOI18N
        botaoVoltarMedico.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltarMedico.setText("Voltar");
        botaoVoltarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarMedicoActionPerformed(evt);
            }
        });

        labelNomeMedico.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        labelNomeMedico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeMedico.setText(consulta.getMedico().getNome());

        labelPaciente.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        labelPaciente.setText("Paciente:");

        labelCodigoConsulta.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        labelCodigoConsulta.setText("Código de Consulta:");

        botaoConsultaProntuario.setBackground(new java.awt.Color(204, 204, 255));
        botaoConsultaProntuario.setFont(new java.awt.Font("Gujarati MT", 1, 15)); // NOI18N
        botaoConsultaProntuario.setText("Prontuario");
        botaoConsultaProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaProntuarioActionPerformed(evt);
            }
        });

        labelTipoConsulta.setFont(new java.awt.Font("Gujarati MT", 0, 12)); // NOI18N
        labelTipoConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTipoConsulta.setText("Tipo_de_consulta");

        textDescricao.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        textDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescricaoActionPerformed(evt);
            }
        });

        labelDescricao.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        labelDescricao.setText("Descriçao:");

        botaoReceita.setBackground(new java.awt.Color(204, 204, 255));
        botaoReceita.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        botaoReceita.setText("Gerar Receita Médica ");

        botaoFinalizaConsulta.setBackground(new java.awt.Color(204, 204, 255));
        botaoFinalizaConsulta.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        botaoFinalizaConsulta.setText("Finalizar Consulta");
        botaoFinalizaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizaConsultaActionPerformed(evt);
            }
        });

        botaoAtestado.setBackground(new java.awt.Color(204, 204, 255));
        botaoAtestado.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        botaoAtestado.setText("Gerar Atestado Médico");

        labelNomePaciente.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        labelNomePaciente.setText(consulta.getPaciente().getNome());

        labelCodigo.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        labelCodigo.setText(consulta.getCodigo());

        botaoReceita1.setBackground(new java.awt.Color(204, 204, 255));
        botaoReceita1.setFont(new java.awt.Font("Gujarati MT", 0, 13)); // NOI18N
        botaoReceita1.setText("Solicitar Exame");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoVoltarMedico)
                                .addGap(13, 13, 13))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAtestado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botaoReceita1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoReceita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelCodigoConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConsultaProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(labelTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoFinalizaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCrm)
                    .addComponent(botaoVoltarMedico))
                .addGap(5, 5, 5)
                .addComponent(labelTipoConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaciente)
                    .addComponent(labelNomePaciente))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoConsulta)
                    .addComponent(botaoConsultaProntuario)
                    .addComponent(labelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoReceita1)
                        .addGap(18, 18, 18)
                        .addComponent(botaoReceita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAtestado))
                    .addComponent(textDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(botaoFinalizaConsulta)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>                        

    private void botaoVoltarMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        
    }                                                 

    private void botaoConsultaProntuarioActionPerformed(java.awt.event.ActionEvent evt) {  
       new TelaProntuario().setVisible(true);
       this.dispose();                                                     
        
    }                                                       

    private void textDescricaoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }                                             

    private void botaoFinalizaConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
    }                                                     

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAtestado;
    private javax.swing.JButton botaoConsultaProntuario;
    private javax.swing.JButton botaoFinalizaConsulta;
    private javax.swing.JButton botaoReceita;
    private javax.swing.JButton botaoReceita1;
    private javax.swing.JButton botaoVoltarMedico;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigoConsulta;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JLabel labelNomePaciente;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JLabel labelTipoConsulta;
    private javax.swing.JTextField textDescricao;
    // End of variables declaration           
    
    private Marcada consulta;
    private ControleDados dados;
}


