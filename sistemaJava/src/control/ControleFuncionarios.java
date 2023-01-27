package control;

import model.*;

public class ControleFuncionarios {

  // METODOS
  
  // ADMINISTRADOR
  public Medico cadastraMedico(String nome, String cpf, char sexo, String dataNascimento, String usuario,
      String senha, String especialidade) {
    return new Medico(nome, cpf, sexo, dataNascimento, usuario, senha, especialidade);
  }

  public Enfermeiro cadastraEnfermeiro(String nome, String cpf, char sexo, String dataNascimento, String usuario,
      String senha) {
    return new Enfermeiro(nome, cpf, sexo, dataNascimento, usuario, senha);
  }

  public Farmaceutico cadastraFarmaceutico(String nome, String cpf, char sexo, String dataNascimento, String usuario,
      String senha, int crf) {
    return new Farmaceutico(nome, cpf, sexo, dataNascimento, usuario, senha, crf);
  }

  public Atendente cadastraAtendente(String nome, String cpf, char sexo, String dataNascimento, String usuario,
      String senha) {
    return new Atendente(nome, cpf, sexo, dataNascimento, usuario, senha);
  }

  // ATENDENTE
  public Paciente cadastraPaciente(String nome, String cpf, char sexo, String dataNascimento, String patologia) {
    return new Paciente(nome, cpf, sexo, dataNascimento, patologia);
  }

}
