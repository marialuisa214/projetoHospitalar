package view;

import control.ControleDados;
import model.Atendente;
import model.TabelaPaciente;
import model.TabelaTodasConsultas;

public class TelaAgendaExame extends javax.swing.JFrame {

    public TelaAgendaExame(ControleDados dados, Atendente atendente) {
        this.dados = dados;
        this.atendente = atendente;
        // this.tabela = new TabelaTodasConsultas(dados);
        initComponents();


    }
                          
    private void initComponents() {

        scrollTableExame = new javax.swing.JScrollPane();
        tableExame = new javax.swing.JTable();
        buttonMarcaExame = new javax.swing.JToggleButton();
        buttonAlteraExame = new javax.swing.JToggleButton();
        buttonDesmarcarConsulta = new javax.swing.JToggleButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableExame.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableExame.setViewportView(tableExame);

        buttonMarcaExame.setBackground(new java.awt.Color(153, 153, 153));
        buttonMarcaExame.setText("Marcar Consulta");
        buttonMarcaExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMarcaExameActionPerformed(evt);
            }
        });

        buttonAlteraExame.setBackground(new java.awt.Color(153, 153, 153));
        buttonAlteraExame.setText("Alterar Consulta");
        buttonAlteraExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlteraExameActionPerformed(evt);
            }
        });

        buttonDesmarcarConsulta.setBackground(new java.awt.Color(153, 153, 153));
        buttonDesmarcarConsulta.setText("Desmarcar Consulta");
        buttonDesmarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDesmarcarConsultaActionPerformed(evt);
            }
        });

        buttonVoltar.setBackground(new java.awt.Color(153, 153, 153));
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVoltar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollTableExame, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonMarcaExame, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAlteraExame, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDesmarcarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(buttonVoltar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTableExame, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonMarcaExame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonAlteraExame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDesmarcarConsulta)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>                        

    private void buttonDesmarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                        
       
    }                                                       

    private void buttonMarcaExameActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       
    }                                                

    private void buttonAlteraExameActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       
    }                                                 

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new TelaPrincipalAtendente(dados, atendente).setVisible(true);
        this.dispose();
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton buttonAlteraExame;
    private javax.swing.JToggleButton buttonDesmarcarConsulta;
    private javax.swing.JToggleButton buttonMarcaExame;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JScrollPane scrollTableExame;
    private javax.swing.JTable tableExame;
    // End of variables declaration            

    private TabelaPaciente tabela;
    private ControleDados dados;
    private Atendente atendente;
}
