package control;

import java.util.ArrayList;

import model.*;

public class ControleDados {
//MEDICO
    ArrayList<Medico> bancoMedicos  = new ArrayList<>();
    
    public ArrayList<Medico> getBancoMedicos() {
        return bancoMedicos;
    }
    public void adicionaMedico(Medico novoMedico) {
        this.bancoMedicos.add(novoMedico);
    }

//CONSULTA MARCADA
    ArrayList<Marcada> bancoConsultaMarcadas  = new ArrayList<>();
    
    public ArrayList<Marcada> getBancoConsultaMarcadas() {
        return bancoConsultaMarcadas;
    }
    public void adicionaConsulta(Marcada novaConsultaMarcada) {
        this.bancoConsultaMarcadas.add(novaConsultaMarcada);
    }

//PACIENTES
    ArrayList<Paciente> bancoPacientes = new ArrayList<>();

    public ArrayList<Paciente> getBancoPacientes() {
        return bancoPacientes;
    }
    public void adicionaPacientes(Paciente paciente) {
        this.bancoPacientes.add(paciente);
    }
//LISTA DE SOLICITAÇOES MEDICO P/ ATENDENTE
    // nova classe???






    
  
}
