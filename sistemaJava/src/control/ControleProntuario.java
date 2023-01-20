package control;

import model.*;

public class ControleProntuario {

  public Prontuario prontuario;

  public void adicionaConsulta(Consulta consulta) {
    this.prontuario.setHistoricoConsulta(consulta);
  }

  public void adicionaExame(Exame exame) {
    this.prontuario.setHistoricoExame(exame);
  }
}
