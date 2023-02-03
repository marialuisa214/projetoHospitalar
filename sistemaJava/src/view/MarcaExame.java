package view; 

public class MarcaExame extends javax.swing.JFrame {

    public MarcaExame() {
        initComponents();
    }
                     
    private void initComponents() {

        labelNovoExame = new javax.swing.JLabel();
        labelExame = new javax.swing.JLabel();
        dropboxExame = new javax.swing.JComboBox<>();
        labelPaciente = new javax.swing.JLabel();
        dropboxPaciente = new javax.swing.JComboBox<>();
        buttonAgendarExame = new javax.swing.JButton();
        labelData = new javax.swing.JLabel();
        inputData = new javax.swing.JTextField();
        labelHora = new javax.swing.JLabel();
        inputHora = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNovoExame.setText("Novo Exame");

        labelExame.setText("Exame");

        dropboxExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxExameActionPerformed(evt);
            }
        });

        labelPaciente.setText("Paciente");

        dropboxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxPacienteActionPerformed(evt);
            }
        });

        buttonAgendarExame.setBackground(new java.awt.Color(153, 153, 153));
        buttonAgendarExame.setText("Agendar Exame");
        buttonAgendarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendarExameActionPerformed(evt);
            }
        });

        labelData.setText("Data");

        inputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataActionPerformed(evt);
            }
        });

        labelHora.setText("Hora");

        buttonVoltar.setBackground(new java.awt.Color(153, 153, 153));
        buttonVoltar.setText("voltar");
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonVoltar)
                        .addGap(110, 110, 110)
                        .addComponent(labelNovoExame))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelPaciente)
                        .addComponent(labelExame)
                        .addComponent(dropboxExame, 0, 435, Short.MAX_VALUE)
                        .addComponent(dropboxPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelData)
                                .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelHora)))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 194, Short.MAX_VALUE)
                .addComponent(buttonAgendarExame)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNovoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropboxExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPaciente)
                .addGap(3, 3, 3)
                .addComponent(dropboxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(labelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonAgendarExame)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void buttonAgendarExameActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void dropboxExameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void dropboxPacienteActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void inputDataActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
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
            java.util.logging.Logger.getLogger(MarcaExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcaExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcaExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcaExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcaExame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAgendarExame;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> dropboxExame;
    private javax.swing.JComboBox<String> dropboxPaciente;
    private javax.swing.JTextField inputData;
    private javax.swing.JTextField inputHora;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelExame;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelNovoExame;
    private javax.swing.JLabel labelPaciente;
    // End of variables declaration                   
}