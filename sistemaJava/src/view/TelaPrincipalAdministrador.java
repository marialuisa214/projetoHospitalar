package view;

import control.ControleDados;
import model.Administrador;

public class TelaPrincipalAdministrador extends javax.swing.JFrame {

    public TelaPrincipalAdministrador(ControleDados dados, Administrador adm) {
        this.dados = dados;
        this.adm = adm;
        initComponents();
    }
                         
    private void initComponents() {

        labelNaocadastrado = new javax.swing.JLabel();
        labelCadastrado = new javax.swing.JLabel();
        buttonBusca = new javax.swing.JButton();
        fieldBusca = new javax.swing.JTextField();
        labelDataHora = new javax.swing.JLabel();
        labelIdAdm = new javax.swing.JLabel();
        labelAdm = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        buttonNovoAtendente = new javax.swing.JButton();
        buttonNovoMedico = new javax.swing.JButton();
        buttonNovoEnfermeiro = new javax.swing.JButton();
        buttonNovoAdm = new javax.swing.JButton();
        buttonGerenciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNaocadastrado.setText("Este funcionário não está cadastrado!");

        labelCadastrado.setText("Este funcionário está cadastrado!");

        buttonBusca.setBackground(new java.awt.Color(153, 153, 153));
        buttonBusca.setText("Buscar Funcionário");
        buttonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscaActionPerformed(evt);
            }
        });

        fieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscaActionPerformed(evt);
            }
        });

        labelDataHora.setText("<data/hora atual>");

        labelIdAdm.setText("<id administrador>");

        labelAdm.setText("<nome administrador>");

        buttonVoltar.setBackground(new java.awt.Color(153, 153, 153));
        buttonVoltar.setText("voltar");

        buttonNovoAtendente.setBackground(new java.awt.Color(153, 153, 153));
        buttonNovoAtendente.setText("Novo Atendente");
        buttonNovoAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoAtendenteActionPerformed(evt);
            }
        });

        buttonNovoMedico.setBackground(new java.awt.Color(153, 153, 153));
        buttonNovoMedico.setText("Novo Médico");
        buttonNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoMedicoActionPerformed(evt);
            }
        });

        buttonNovoEnfermeiro.setBackground(new java.awt.Color(153, 153, 153));
        buttonNovoEnfermeiro.setText("Novo Enfermeiro");
        buttonNovoEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoEnfermeiroActionPerformed(evt);
            }
        });

        buttonNovoAdm.setBackground(new java.awt.Color(153, 153, 153));
        buttonNovoAdm.setText("Novo Administrador");
        buttonNovoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoAdmActionPerformed(evt);
            }
        });

        buttonGerenciar.setBackground(new java.awt.Color(153, 153, 153));
        buttonGerenciar.setText("Gerenciar Funcionarios");
        buttonGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerenciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCadastrado)
                                    .addComponent(labelNaocadastrado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(buttonVoltar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonNovoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNovoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGerenciar)
                            .addComponent(buttonNovoEnfermeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonNovoAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(389, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelAdm, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelDataHora, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelIdAdm, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(24, 24, 24)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelNaocadastrado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonNovoAtendente)
                            .addComponent(labelCadastrado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNovoMedico)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNovoEnfermeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNovoAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGerenciar)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(labelAdm)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelIdAdm)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelDataHora)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void buttonNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        new TelaCadastra(dados, adm).setVisible(true);
        this.dispose();
    }                                                

    private void buttonNovoAtendenteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void buttonBuscaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void fieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void buttonNovoEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void buttonNovoAdmActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void buttonGerenciarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               


    

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonBusca;
    private javax.swing.JButton buttonGerenciar;
    private javax.swing.JButton buttonNovoAdm;
    private javax.swing.JButton buttonNovoAtendente;
    private javax.swing.JButton buttonNovoEnfermeiro;
    private javax.swing.JButton buttonNovoMedico;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField fieldBusca;
    private javax.swing.JLabel labelAdm;
    private javax.swing.JLabel labelCadastrado;
    private javax.swing.JLabel labelDataHora;
    private javax.swing.JLabel labelIdAdm;
    private javax.swing.JLabel labelNaocadastrado;
    // End of variables declaration    
    
    private ControleDados dados;
    private Administrador adm;
}