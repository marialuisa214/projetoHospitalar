package view;

import javax.swing.*;
import java.awt.*;

public class CadastroFuncionario extends javax.swing.JFrame {


    public CadastroFuncionario() {
        initComponents();
    }

                             
    private void initComponents() {

        CadMedico = new javax.swing.JButton();
        CadEnfermeiro = new javax.swing.JButton();
        CadFarmaceutico = new javax.swing.JButton();
        CadAtendente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadMedico.setText("Cadastrar Médico(o)");
        CadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadMedicoActionPerformed(evt);
            }
        });

        CadEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadEnfermeiroActionPerformed(evt);
            }
        });

        CadFarmaceutico.setText("Cadastro Farmaceutico(a) ");
        CadFarmaceutico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFarmaceuticoActionPerformed(evt);
            }
        });

        CadAtendente.setText("Cadastro Atendente");
        CadAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadAtendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CadEnfermeiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CadFarmaceutico, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(CadAtendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(CadMedico)
                .addGap(31, 31, 31)
                .addComponent(CadEnfermeiro)
                .addGap(42, 42, 42)
                .addComponent(CadFarmaceutico)
                .addGap(43, 43, 43)
                .addComponent(CadAtendente)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    //   private void CadEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {                                              
    //   new telaEnfermeiro().setVisible(true);
    //   }                                             
    //   new CadEnfermeiroActionPerformed ().setVisible(true);
    // }

    //   private void CadFarmaceuticoActionPerformed(java.awt.event.ActionEvent evt) {                                                
    //   new TelaFarmaceutico().setVisible(true);
    //   }                                               

    //   private void CadAtendenteActionPerformed(java.awt.event.ActionEvent evt) {                                             
    //   new TelaAtendente().setVisible(true);
    //  }                                            

    //  private void CadMedicoActionPerformed(java.awt.event.ActionEvent evt) {                                          
    //    new TelaMedico().setVisible(true);
    // }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CadAtendente;
    private javax.swing.JButton CadEnfermeiro;
    private javax.swing.JButton CadFarmaceutico;
    private javax.swing.JButton CadMedico;
    // End of variables declaration                   
}
