package control;

import java.util.ArrayList;

import model.*;

public class ControleDados {
    ArrayList<Medico> bancoMedicos  = new ArrayList<>();;

    public ArrayList<Medico> getBancoMedicos() {
        return bancoMedicos;
    }

    public void adicionaMedico(Medico novoMedico) {
        this.bancoMedicos.add(novoMedico);
      }
    
  
}
