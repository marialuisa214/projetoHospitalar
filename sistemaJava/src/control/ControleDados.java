package control;

import java.util.ArrayList;

import model.*;

public class ControleDados {
//MEDICO NORMAL
    ArrayList<Medico> bancoMedicos  = new ArrayList<>();
    
    public ArrayList<Medico> getBancoMedicos() {
        return bancoMedicos;
    }
    public void adicionaMedico(Medico novoMedico) {
        this.bancoMedicos.add(novoMedico);
    }

//MEDICO PLANTAO-emergencia
ArrayList<Medico> bancoMedicosPlantao  = new ArrayList<>();
    
public ArrayList<Medico> getBancoMedicosPlantao() {
    return bancoMedicosPlantao;
}

//CONSULTA MARCADA
    ArrayList<Marcada> bancoConsultaMarcadas  = new ArrayList<>();
    
    public ArrayList<Marcada> getBancoConsultaMarcadas() {
        return bancoConsultaMarcadas;
    }
    public void adicionaConsulta(Marcada novaConsultaMarcada) {
        this.bancoConsultaMarcadas.add(novaConsultaMarcada);
    }

//CONSULTAS DE EMERGENCIA
    ArrayList<Emergencia> bancoConsultaEmergencia  = new ArrayList<>();
    
    public ArrayList<Emergencia> getBancoConsultaEmergencias() {
        return bancoConsultaEmergencia;
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


//

//LISTA SOLICITACOES
    ArrayList<Solicitacao> bancoSolicitacaos = new ArrayList<>();

    public ArrayList<Solicitacao> getBancoSolicitacaos() {
        return bancoSolicitacaos;
    }
    public void adicionaSolicitacao(Solicitacao solicitacao) {
        this.bancoSolicitacaos.add(solicitacao);
    }
//ENFERMEIROS
    ArrayList<Enfermeiro> bancoEnfermeiros = new ArrayList<>();

    public ArrayList<Enfermeiro> getBancoEnfermeiros() {
        return bancoEnfermeiros;
    }
    public void adicionaEnfermeiro(Enfermeiro enfermeiro) {
        this.bancoEnfermeiros.add(enfermeiro);
    }
//Triagem
    ArrayList<Triagem> bancoTriagem = new ArrayList<>();

    public ArrayList<Triagem> getBancoTriagem() {
        return bancoTriagem;
    }
//ENTRADAS
ArrayList<Entrada> bancoEntradas = new ArrayList<>();

public ArrayList<Entrada> getaBancoEntradas() {
    return bancoEntradas;
}
    



    
    




    
  
}
