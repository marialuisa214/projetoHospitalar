package view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JList;

import control.*;
import model.Atendente;



public class TelaPrincipalAtendente extends javax.swing.JFrame {


    public TelaPrincipalAtendente(ControleDados dados, Atendente atendente) {
      this.dados = dados;
      this.atendente = atendente;
      this.c = new Date();
      initComponents();
    }
                       
    private void initComponents() {

        labelAtendente = new javax.swing.JLabel();
        labelIdAtendente = new javax.swing.JLabel();
        labelDataHora = new javax.swing.JLabel();
        buttonBuscaPaciente = new javax.swing.JButton();
        buttonCadastraPaciente = new javax.swing.JButton();
        buttonAgendaConsulta = new javax.swing.JButton();
        buttonAgendaExame = new javax.swing.JButton();
        buttonSolicitações = new javax.swing.JButton();
        fieldBuscaPaciente = new javax.swing.JTextField();
        listaPacientes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAtendente.setText(atendente.getNome());

        labelIdAtendente.setText(atendente.getIdAtendente());

        labelDataHora.setText(formatador.format(c));

        buttonBuscaPaciente.setBackground(new java.awt.Color(153, 153, 153));
        buttonBuscaPaciente.setText("Buscar Paciente");
        buttonBuscaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscaPacienteActionPerformed(evt);
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

        fieldBuscaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAtendente)
                    .addComponent(labelDataHora)
                    .addComponent(labelIdAtendente)
                    .addComponent(fieldBuscaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(listaPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonBuscaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCadastraPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAgendaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAgendaExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSolicitações, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldBuscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscaPaciente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(buttonCadastraPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAgendaConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAgendaExame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSolicitações))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(listaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void buttonBuscaPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void fieldBuscaPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // this.listaPacientes = new JList<>(this.listaPaciente.listaNomePacientes());
    }                                                  

    private void buttonCadastraPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // this.dispose();
        // new CadastroPaciente(listaPaciente).setVisible(true);
    }                                                      

    private void buttonSolicitaçõesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void buttonAgendaConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // new AgendaConsulta().setVisible(true);
    }                                                    

    private void buttonAgendaExameActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // new AgendaExame().setVisible(true);
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
    private javax.swing.JList<String> listaPacientes;

    private ControleDados dados;
    private Atendente atendente;
    // End of variables declaration
    
    private SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    private Date c;
}

