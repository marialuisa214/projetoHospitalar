package view;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import control.ControleDados;
import model.Atendente;
import model.Marcada;
import model.Paciente;

public class TelaMarcaConsulta  extends javax.swing.JFrame {

    public TelaMarcaConsulta(ControleDados dados, Atendente atendente, Paciente paciente) {
        this.dados = dados;
        this.atendente = atendente;
        this.paciente = paciente;
        initComponents();
    }
                
    private void initComponents() {

        labelNovaConsulta = new javax.swing.JLabel();
        labelMedico = new javax.swing.JLabel();
        dropboxMedico = new javax.swing.JComboBox<>();
        labelPaciente = new javax.swing.JLabel();
        dropboxPaciente = new javax.swing.JComboBox<>();
        labelDataHora = new javax.swing.JLabel();
        buttonAgendarConsulta = new javax.swing.JButton();
        fieldDataHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNovaConsulta.setText("Nova Consulta");

        labelMedico.setText("Médico Responsável");


        ArrayList<String> arraylista = new ArrayList<>();
        for(int i = 0; i<dados.getBancoMedicos().size(); i ++){
            arraylista.add(dados.getBancoMedicos().get(i).getNome() + "  /   " + dados.getBancoMedicos().get(i).getEspecialidade());
            System.out.println(arraylista.get(i));
        }
        String[] lista = arraylista.toArray(new String[0]);

        dropboxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(lista));
        dropboxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(lista));
        dropboxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { paciente.getNome()}));


        labelPaciente.setText("Paciente");

       

        labelDataHora.setText("Data/Hora");

        buttonAgendarConsulta.setBackground(new java.awt.Color(153, 153, 153));
        buttonAgendarConsulta.setText("Agendar Consulta");
        buttonAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMedico)
                            .addComponent(labelDataHora)
                            .addComponent(dropboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropboxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPaciente)
                            .addComponent(fieldDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(labelNovaConsulta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(buttonAgendarConsulta)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropboxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPaciente)
                .addGap(5, 5, 5)
                .addComponent(dropboxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDataHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(buttonAgendarConsulta)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>                        

                                                 

    private void buttonAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // if(dropboxMedico.getSelectedItem().equals(">> Selecione um Medico! <<")){
        //     JOptionPane.showMessageDialog(rootPane, "Para registrar uma consulta, selecione um médico corretamente");

        // }else{
            for(int i = 0; i<dados.getBancoMedicos().size(); i ++){
                if(dropboxMedico.getSelectedItem().equals(dados.getBancoMedicos().get(i).getNome() + "  /   " + dados.getBancoMedicos().get(i).getEspecialidade()) && labelDataHora.getText().length() > 2){
                    Random r = new Random();
                    Marcada m = new Marcada(Integer.toString(r.nextInt(1000)), paciente, dados.getBancoMedicos().get(i));
                    m.setData(fieldDataHora.getText());
                    dados.getBancoMedicos().get(i).getListConsultasPendentes().add(m);
                    new TelaPrincipalAtendente(dados, atendente).setVisible(true);;
                    this.dispose();
                }

            }

        // }
    }                                                     

                                                   


    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonAgendarConsulta;
    private javax.swing.JComboBox<String> dropboxMedico;
    private javax.swing.JComboBox<String> dropboxPaciente;
    private javax.swing.JTextField fieldDataHora;
    private javax.swing.JLabel labelDataHora;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JLabel labelNovaConsulta;
    private javax.swing.JLabel labelPaciente;
    // End of variables declaration             
    
    private Paciente paciente;
    private Atendente atendente;
    private ControleDados dados;
    
}