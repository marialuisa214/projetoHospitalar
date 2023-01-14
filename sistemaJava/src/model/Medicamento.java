package model;

public class Medicamento {

  //ATRIBUTOS
  String nome;
  int codMedicamento;
  String lab;

  //METODOS
  public Medicamento(String nome, int codMedicamento, String lab) {
    this.nome = nome;
    this.codMedicamento = codMedicamento;
    this.lab = lab;
  }

  //ATRIBUTOS
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getCodMedicamento() {
    return codMedicamento;
  }
  public void setCodMedicamento(int codMedicamento) {
    this.codMedicamento = codMedicamento;
  }
  public String getLab() {
    return lab;
  }
  public void setLab(String lab) {
    this.lab = lab;
  }
  
}
