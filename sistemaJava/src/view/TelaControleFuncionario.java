package view;

import control.ControleDados;
import model.Administrador;
import model.Atendente;
import model.TabelaFuncAdm;
import model.TabelaFuncAtendente;
import model.TabelaFuncEnfermeiro;
import model.TabelaFuncMedico;

public class TelaControleFuncionario extends javax.swing.JFrame {

    public TelaControleFuncionario(ControleDados dados, Administrador adm) {
        this.dados = dados;
        this.adm = adm;

        this.medicoTabela = new TabelaFuncMedico(dados); 
        this.enfermeiroTabela = new TabelaFuncEnfermeiro(dados);
        this.admTabela = new TabelaFuncAdm(dados);
        this.atendenteTabela = new TabelaFuncAtendente(dados);
        initComponents();

        tableMedico.setModel(medicoTabela);
        tableEnfermeiro.setModel(enfermeiroTabela);
        tableAtendente.setModel(atendenteTabela);
        tableAdministrador.setModel(admTabela);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelGerenciadorDeFuncionarios.setText("Gerenciador de Funcionários");

        

        buttonPesquisaMedico.setBackground(new java.awt.Color(153, 153, 153));
        buttonPesquisaMedico.setText("busca");
        buttonPesquisaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaMedicoActionPerformed(evt);
            }
        });

        buttonPesquisaEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaEnfermeiroActionPerformed(evt);
            }
        });
        
        buttonPesquisaAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaAtendenteActionPerformed(evt);
            }
        });
        
        buttonPesquisaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisaAdmActionPerformed(evt);
            }
        });

        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldBuscaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPesquisaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fieldBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonPesquisaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206)
                        .addComponent(labelGerenciadorDeFuncionarios)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGerenciadorDeFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldBuscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldBuscaEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisaMedico)
                    .addComponent(buttonPesquisaEnfermeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
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
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>                        

                                                           

    private void buttonPesquisaMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
    }      
    private void buttonPesquisaEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
    } 
    private void buttonPesquisaAtendenteActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
    } 
    private void buttonPesquisaAdmActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
    }    
    
    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {  
        new TelaPrincipalAdministrador(dados, adm).setVisible(true);
        this.dispose();                                                   
        
    } 
 

    // Variables declaration - do not modify                     
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
    private javax.swing.JLabel labelGerenciadorDeFuncionarios;
    private javax.swing.JTable tableAdministrador;
    private javax.swing.JTable tableAtendente;
    private javax.swing.JTable tableEnfermeiro;
    private javax.swing.JTable tableMedico;
    // End of variables declaration    

    private ControleDados dados;
    private Administrador adm;

    private TabelaFuncAdm admTabela;
    private TabelaFuncEnfermeiro enfermeiroTabela;
    private TabelaFuncAtendente atendenteTabela;
    private TabelaFuncMedico medicoTabela;

}
