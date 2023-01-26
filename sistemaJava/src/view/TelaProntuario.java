package view;

import control.ControleDados;
import model.Paciente;

public class TelaProntuario extends javax.swing.JFrame {



    public TelaProntuario() {
        initComponents();
    }
                       
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        labelNomePaciente = new javax.swing.JLabel();
        labelIdadePaciente = new javax.swing.JLabel();
        labelPesoPaciente = new javax.swing.JLabel();
        labelAlturaPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHistConsulta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaHistoExame = new javax.swing.JTable();
        labelHistoricoConsulta = new javax.swing.JLabel();
        labelHistoricoExame = new javax.swing.JLabel();
        botaoDetalhesConsulta = new javax.swing.JButton();
        botaoDetalhesExame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNome.setText("Nome do Paciente:");

        labelIdade.setText("Idade:");

        labelPeso.setText("Peso:");

        labelAltura.setText("Altura:");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelNomePaciente.setText("nome__");

        labelIdadePaciente.setText("_idade");

        labelPesoPaciente.setText("p_eso");

        labelAlturaPaciente.setText("altura_do_paciente");

        tabelaHistConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaHistConsulta);

        tabelaHistoExame.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaHistoExame);

        labelHistoricoConsulta.setText("Historico de Consultas");

        labelHistoricoExame.setText("Historico de Exames");

        botaoDetalhesConsulta.setText("MaisDetalhes");
        botaoDetalhesConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDetalhesConsultaActionPerformed(evt);
            }
        });

        botaoDetalhesExame.setText("Mais Detalhes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHistoricoExame)
                    .addComponent(labelHistoricoConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAltura)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIdade)
                                    .addComponent(labelPeso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPesoPaciente)
                                    .addComponent(labelIdadePaciente)
                                    .addComponent(labelAlturaPaciente)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addGap(18, 18, 18)
                                .addComponent(labelNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoDetalhesExame)
                            .addComponent(botaoDetalhesConsulta))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(botaoVoltar)
                    .addComponent(labelNomePaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdade)
                    .addComponent(labelIdadePaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeso)
                    .addComponent(labelPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAltura)
                    .addComponent(labelAlturaPaciente))
                .addGap(35, 35, 35)
                .addComponent(labelHistoricoConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDetalhesConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(labelHistoricoExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDetalhesExame)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>                        

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void botaoDetalhesConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
    }                                                     

    // public static void main(String args[]) {
       
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new TelaProntuario().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoDetalhesConsulta;
    private javax.swing.JButton botaoDetalhesExame;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelAlturaPaciente;
    private javax.swing.JLabel labelHistoricoConsulta;
    private javax.swing.JLabel labelHistoricoExame;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelIdadePaciente;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomePaciente;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPesoPaciente;
    private javax.swing.JTable tabelaHistConsulta;
    private javax.swing.JTable tabelaHistoExame;
    // End of variables declaration  
}