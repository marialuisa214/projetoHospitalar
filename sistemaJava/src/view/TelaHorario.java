package view;

import control.ControleDados;
import model.Medico;

public class TelaHorario extends javax.swing.JFrame {

    public TelaHorario(ControleDados dados, Medico medico) {
        this.medico=medico;
        this.dados = dados;
        initComponents();
    }

    private void initComponents() {

        labelNomeMedico = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoSolicita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNomeMedico.setText("nomeMedico");

        jLabel2.setText("crm");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoSolicita.setText("Solicitar Reunião");
        botaoSolicita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSolicitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(botaoSolicita)
                .addGap(0, 84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomeMedico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeMedico)
                    .addComponent(botaoVoltar))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(botaoSolicita)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void botaoSolicitaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //como fazer? Mandar string?

        new TelaPrincipalMedico(dados, medico).setVisible(true); 
        this.disable();
    }                                             

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        new TelaPrincipalMedico(dados, medico).setVisible(true); 
        this.disable();
    }    
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoSolicita;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelNomeMedico;
    // End of variables declaration       
    ControleDados dados;
    Medico medico;            
}
