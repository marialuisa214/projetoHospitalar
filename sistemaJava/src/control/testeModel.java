package control;

import model.*;
import view.*;

public class testeModel {
  public static void main(String[] args){
    
    
    Medico medico = new  Medico("carlos", "333", 'M', "06/04/1991", "2121", "malu", "ginicologista");
    ControleDados banco = new ControleDados();
    banco.adicionaMedico(medico);
  
    new TelaLogin(banco).setVisible(true);
   
  }
}
