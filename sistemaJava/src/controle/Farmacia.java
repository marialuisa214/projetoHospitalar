package controle;

import java.util.List;

public class Farmacia {

  //ATRIBUTOS
  String categoria;
  List<Medicamento> medicamentos; 
  int quantidadeMedicamento;
  Farmaceutico farmaceutico;
  
  //CONSTRUTOR
  public Farmacia(String categoria, Farmaceutico farmaceutico, List<Medicamento> medicamentos,
      int quantidadeMedicamento) {
    this.categoria = categoria;
    this.farmaceutico = farmaceutico;
    this.medicamentos = medicamentos;
    this.quantidadeMedicamento = quantidadeMedicamento;
  } 

  //METODOS
  public String getCategoria() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }
  public Farmaceutico getFarmaceutico() {
    return farmaceutico;
  }
  public void setFarmaceutico(Farmaceutico farmaceutico) {
    this.farmaceutico = farmaceutico;
  }
  public List<Medicamento> getMedicamentos() {
    return medicamentos;
  }
  public void setMedicamentos(List<Medicamento> medicamentos) {
    this.medicamentos = medicamentos;
  }
  public int getQuantidadeMedicamento() {
    return quantidadeMedicamento;
  }
  public void setQuantidadeMedicamento(int quantidadeMedicamento) {
    this.quantidadeMedicamento = quantidadeMedicamento;
  }

}
