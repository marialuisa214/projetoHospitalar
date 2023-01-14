package model;

import java.util.Calendar;

public class Entrada {
  //ATRIBUTOS
  private Calendar dataEntrada;
  private Calendar dataSaida;
  private String situacaoPaciente;
  private Paciente pacienteVinculado;

  //CONSTRUTOR
  public Entrada(Calendar dataEntrada, String situacaoPaciente, Paciente paciente){
    this.dataEntrada = dataEntrada;
    this.situacaoPaciente = situacaoPaciente;
    this.pacienteVinculado = paciente;
  }

  //METODOS
  public Calendar getDataEntrada() {
    return dataEntrada;
  }
  public void setDataEntrada(Calendar dataEntrada) {
    this.dataEntrada = dataEntrada;
  }
  public Calendar getDataSaida() {
    return dataSaida;
  }
  public void setDataSaida(Calendar dataSaida) {
    this.dataSaida = dataSaida;
  }
  public String getSituacaoPaciente() {
    return situacaoPaciente;
  }
  public void setSituacaoPaciente(String situacaoPaciente) {
    this.situacaoPaciente = situacaoPaciente;
  }
  public Paciente getPacienteVinculado() {
    return pacienteVinculado;
  }
  public void setPacienteVinculado(Paciente pacienteVinculado) {
    this.pacienteVinculado = pacienteVinculado;
  }
}
