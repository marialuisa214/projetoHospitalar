package view;

import javax.swing.JOptionPane;

import control.ControleDados;
import model.Atendente;
import model.Paciente;
import model.TabelaPaciente;
import model.TabelaTodasConsultas;
import model.Marcada;

public class TelaAgendaConsulta extends javax.swing.JFrame {

    public TelaAgendaConsulta(ControleDados dados,  Atendente atendente) {
        this.dados = dados;
        this.atendente = atendente;
        this.tabela = new TabelaTodasConsultas(dados);
        
        initComponents();
        tableConsulta.setModel(this.tabela);
        


    }
                
    private void initComponents() {

        scrollTableConsulta = new javax.swing.JScrollPane();
        tableConsulta = new javax.swing.JTable();
        escolheMedico = new java.awt.Choice();
        buttonMarcaConsulta = new javax.swing.JToggleButton();
        buttonAlteraConsulta = new javax.swing.JToggleButton();
        buttonDesmarcaConsulta = new javax.swing.JToggleButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Horário/Consulta", "Paciente"
            }
        ));
        scrollTableConsulta.setViewportView(tableConsulta);

        escolheMedico.add("Selecione um Paciente!");
        for(int i = 0; i<dados.getBancoPacientes().size(); i ++){
            escolheMedico.add(dados.getBancoPacientes().get(i).getNome());
            
        }

        buttonMarcaConsulta.setBackground(new java.awt.Color(153, 153, 153));
        buttonMarcaConsulta.setText("Marcar Consulta");
        buttonMarcaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMarcaConsultaActionPerformed(evt);
            }
        });

        buttonAlteraConsulta.setBackground(new java.awt.Color(153, 153, 153));
        buttonAlteraConsulta.setText("Alterar Consulta");
        buttonAlteraConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlteraConsultaActionPerformed(evt);
            }
        });

        buttonDesmarcaConsulta.setBackground(new java.awt.Color(153, 153, 153));
        buttonDesmarcaConsulta.setText("Desmarcar Consulta");
        buttonDesmarcaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDesmarcaConsultaActionPerformed(evt);
            }
        });

        botaoVoltar.setBackground(new java.awt.Color(153, 153, 153));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar)
                    .addComponent(escolheMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollTableConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonMarcaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAlteraConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDesmarcaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(botaoVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escolheMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTableConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonMarcaConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAlteraConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDesmarcaConsulta)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>                        

    private void buttonMarcaConsultaActionPerformed(java.awt.event.ActionEvent evt) {   
        for(int i = 0; i<dados.getBancoPacientes().size(); i ++){
            if(escolheMedico.getSelectedItem().equals(dados.getBancoPacientes().get(i).getNome())){
                this.paciente = dados.getBancoPacientes().get(i);
            }

        }
        new TelaMarcaConsulta(dados, atendente, paciente).setVisible(true);
        this.dispose();
        }                                                     

    private void buttonAlteraConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
    }                                                    

    private void buttonDesmarcaConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                       
       if(tableConsulta.getSelectedRow() != -1 ){
            tabela.removeRow(tableConsulta.getSelectedRow());
    }
        
    }                                                      

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new TelaPrincipalAtendente(dados, atendente).setVisible(true);
        this.dispose();
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton buttonAlteraConsulta;
    private javax.swing.JToggleButton buttonDesmarcaConsulta;
    private javax.swing.JToggleButton buttonMarcaConsulta;
    private javax.swing.JButton botaoVoltar;
    private java.awt.Choice escolheMedico;
    private javax.swing.JScrollPane scrollTableConsulta;
    private javax.swing.JTable tableConsulta;
    // End of variables declaration                   

    private TabelaTodasConsultas tabela;
    private ControleDados dados;
    private Atendente atendente;
    private Paciente paciente;
}