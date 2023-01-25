package control;

import model.*;
import view.*;

public class testeModel {
  public static void main(String[] args){
    
    Paciente paciente = new Paciente("Maria", "123", 'F', "10/12/2001", "nenhuma");
    Paciente paciente2 = new Paciente("Matheus", "8765", 'M', "10/11/2007", "nenhuma");
    Paciente paciente3 = new Paciente("Elaine", "2134", 'F', "13/01/2007", "nenhuma");
    
    
    //Atendente atendente = new Atendente("luana", "1234", 'F', "10/12/2001","luana123", "123");
    Medico medico = new Medico("carlos", "333", 'M', "06/04/1991", "2121", "malu", "ginicologista");
    Marcada consulta = new Marcada("123", paciente, medico,"12:30", "13:30");
    Marcada consulta2 = new Marcada("333", paciente2, medico,"14:30", "15:00");
    Marcada consulta3 = new Marcada("456", paciente3, medico,"18:00", "17:00");
    

    ControleDados banco = new ControleDados();
    banco.adicionaMedico(medico);
    banco.adicionaConsulta(consulta);
    banco.adicionaConsulta(consulta2);
    banco.adicionaConsulta(consulta3);
  
    new TelaLogin(banco).setVisible(true);
   
  }
}
