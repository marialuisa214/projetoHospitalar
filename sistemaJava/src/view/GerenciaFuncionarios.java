package view;

public class GerenciaFuncionarios extends javax.swing.JFrame {

    public GerenciaFuncionarios() {
        initComponents();
    }
                        
    private void initComponents() {

        labelGerenciadorDeFuncionarios = new javax.swing.JLabel();
        fieldBuscaMedico = new javax.swing.JTextField();
        buttonPesquisaMedico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        fieldBuscaEnfermeiro = new javax.swing.JTextField();
        buttonPesquisaEnfermeiro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEnfermeiro = new javax.swing.JTable();
        fieldBuscaAtendente = new javax.swing.JTextField();
        buttonPesquisaAtendente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAtendente = new javax.swing.JTable();
        fieldBuscaAdministrador = new javax.swing.JTextField();
        buttonPesquisaAdm = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableAdministrador = new javax.swing.JTable();
        buttonVoltar = new javax.swing.JButton();
        buttonExlcuirM = new javax.swing.JButton();
        buttonEditarM = new javax.swing.JButton();
        buttonExlcuirE = new javax.swing.JButton();
        buttonEditarE = new javax.swing.JButton();
        buttonExlcuirA = new javax.swing.JButton();
        buttonEditarA = new javax.swing.JButton();
        buttonExlcuirAt = new javax.swing.JButton();
        buttonEditarAt = new javax.swing.JButton();
        labelMedico = new javax.swing.JLabel();
        labelEnfermeiro = new javax.swing.JLabel();
        labelAdm = new javax.swing.JLabel();
        labelAt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelGerenciadorDeFuncionarios.setText("Gerenciador de Funcionários");

        fieldBuscaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaMedicoActionPerformed(evt);
            }
        });

        buttonPesquisaMedico.setBackground(new java.awt.Color(153, 153, 153));
        buttonPesquisaMedico.setText("busca");
        buttonPesquisaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaMedicoActionPerformed(evt);
            }
        });

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableMedico);

        fieldBuscaEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaEnfermeiroActionPerformed(evt);
            }
        });

        buttonPesquisaEnfermeiro.setBackground(new java.awt.Color(153, 153, 153));
        buttonPesquisaEnfermeiro.setText("busca");

        tableEnfermeiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableEnfermeiro);

        fieldBuscaAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaAtendenteActionPerformed(evt);
            }
        });

        buttonPesquisaAtendente.setBackground(new java.awt.Color(153, 153, 153));
        buttonPesquisaAtendente.setText("busca");

        tableAtendente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableAtendente);

        fieldBuscaAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaAdministradorActionPerformed(evt);
            }
        });

        buttonPesquisaAdm.setBackground(new java.awt.Color(153, 153, 153));
        buttonPesquisaAdm.setText("busca");

        tableAdministrador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tableAdministrador);

        buttonVoltar.setBackground(new java.awt.Color(153, 153, 153));
        buttonVoltar.setText("voltar");

        buttonExlcuirM.setBackground(new java.awt.Color(153, 153, 153));
        buttonExlcuirM.setText("Excluir");

        buttonEditarM.setBackground(new java.awt.Color(153, 153, 153));
        buttonEditarM.setText("Editar");

        buttonExlcuirE.setBackground(new java.awt.Color(153, 153, 153));
        buttonExlcuirE.setText("Excluir");

        buttonEditarE.setBackground(new java.awt.Color(153, 153, 153));
        buttonEditarE.setText("Editar");

        buttonExlcuirA.setBackground(new java.awt.Color(153, 153, 153));
        buttonExlcuirA.setText("Excluir");

        buttonEditarA.setBackground(new java.awt.Color(153, 153, 153));
        buttonEditarA.setText("Editar");

        buttonExlcuirAt.setBackground(new java.awt.Color(153, 153, 153));
        buttonExlcuirAt.setText("Excluir");

        buttonEditarAt.setBackground(new java.awt.Color(153, 153, 153));
        buttonEditarAt.setText("Editar");

        labelMedico.setText("Medico");

        labelEnfermeiro.setText("Enfermeiro");

        labelAdm.setText("Administrador");

        labelAt.setText("Atendente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206)
                        .addComponent(labelGerenciadorDeFuncionarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonExlcuirA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEditarA))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelMedico)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fieldBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonPesquisaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fieldBuscaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonPesquisaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelAdm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonExlcuirM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonEditarM)))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fieldBuscaEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonPesquisaEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fieldBuscaAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonPesquisaAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonExlcuirE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEditarE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonExlcuirAt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEditarAt))
                            .addComponent(labelEnfermeiro, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGerenciadorDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVoltar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMedico)
                    .addComponent(labelEnfermeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldBuscaEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisaMedico)
                    .addComponent(buttonPesquisaEnfermeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonExlcuirM)
                                .addComponent(buttonEditarM))
                            .addComponent(buttonExlcuirE)
                            .addComponent(buttonEditarE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAdm)
                            .addComponent(labelAt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBuscaAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPesquisaAtendente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBuscaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPesquisaAdm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExlcuirA)
                    .addComponent(buttonEditarA)
                    .addComponent(buttonExlcuirAt)
                    .addComponent(buttonEditarAt))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void fieldBuscaMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void fieldBuscaEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void fieldBuscaAtendenteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void fieldBuscaAdministradorActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void buttonPesquisaMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
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
            java.util.logging.Logger.getLogger(GerenciaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonEditarA;
    private javax.swing.JButton buttonEditarAt;
    private javax.swing.JButton buttonEditarE;
    private javax.swing.JButton buttonEditarM;
    private javax.swing.JButton buttonExlcuirA;
    private javax.swing.JButton buttonExlcuirAt;
    private javax.swing.JButton buttonExlcuirE;
    private javax.swing.JButton buttonExlcuirM;
    private javax.swing.JButton buttonPesquisaAdm;
    private javax.swing.JButton buttonPesquisaAtendente;
    private javax.swing.JButton buttonPesquisaEnfermeiro;
    private javax.swing.JButton buttonPesquisaMedico;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField fieldBuscaAdministrador;
    private javax.swing.JTextField fieldBuscaAtendente;
    private javax.swing.JTextField fieldBuscaEnfermeiro;
    private javax.swing.JTextField fieldBuscaMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelAdm;
    private javax.swing.JLabel labelAt;
    private javax.swing.JLabel labelEnfermeiro;
    private javax.swing.JLabel labelGerenciadorDeFuncionarios;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JTable tableAdministrador;
    private javax.swing.JTable tableAtendente;
    private javax.swing.JTable tableEnfermeiro;
    private javax.swing.JTable tableMedico;
    // End of variables declaration                   
}
