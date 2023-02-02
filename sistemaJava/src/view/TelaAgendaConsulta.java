package view;

public class TelaAgendaConsulta extends javax.swing.JFrame {

    public TelaAgendaConsulta() {
        initComponents();
    }
                        
    private void initComponents() {

        scrollTableConsulta = new javax.swing.JScrollPane();
        tableConsulta = new javax.swing.JTable();
        escolheMedico = new java.awt.Choice();
        buttonMarcaConsulta = new javax.swing.JToggleButton();
        buttonAlteraConsulta = new javax.swing.JToggleButton();
        buttonDesmarcaConsulta = new javax.swing.JToggleButton();
        buttonVoltar = new javax.swing.JButton();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVoltar)
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
                .addComponent(buttonVoltar)
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
        // TODO add your handling code here:
    }                                                   

    private void buttonAlteraConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void buttonDesmarcaConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.dispose();
    }                                            

   

    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton buttonAlteraConsulta;
    private javax.swing.JToggleButton buttonDesmarcaConsulta;
    private javax.swing.JToggleButton buttonMarcaConsulta;
    private javax.swing.JButton buttonVoltar;
    private java.awt.Choice escolheMedico;
    private javax.swing.JScrollPane scrollTableConsulta;
    private javax.swing.JTable tableConsulta;
    // End of variables declaration                   
}
