package control;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.*;
import view.*;

public class testeModel {
  public static void main(String[] args){
    

    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Date c = new Date();
    System.out.println(formatador.format(c));
    
    Paciente paciente = new Paciente("Maria", "123", 'F', "10/12/2001", "nenhuma");
    Paciente paciente2 = new Paciente("Matheus", "8765", 'M', "10/11/2007", "nenhuma");
    Paciente paciente3 = new Paciente("Elaine", "2134", 'F', "13/01/2007", "nenhuma");
    
    
    Atendente atendente = new Atendente("luana", "1234", 'F', "10/12/2001","luana123", "123");
    Medico medico = new Medico("carlos", "333", 'M', "06/04/1991", "2121", "malu", "ginicologista");
    Marcada consulta = new Marcada("123", paciente, medico);

    System.out.println(consulta.getPaciente().getNome());
    Marcada consulta2 = new Marcada("333", paciente2, medico);
    Marcada consulta3 = new Marcada("456", paciente3, medico);
    Marcada consultafeita = new Marcada("456", paciente3, medico);
    Marcada consulta4 = new Marcada("33763", paciente3, medico);
    consultafeita.setDescricaoMedica("muita daiarreia, Todo cagado");
    consultafeita.setDia("12/02/2023");

    Exame exame1 = new Exame("tomografia", "211");
    Exame exame2 = new Exame("colonoscopia", "421");

    paciente3.getProntuario().getHistoricoConsultasMarcadas().add(consulta3);
    paciente3.getProntuario().getHistoricoConsultasMarcadas().add(consultafeita);
    paciente3.getProntuario().getHistoricoConsultasMarcadas().add(consulta4);
    paciente3.getProntuario().getHistoricoExame().add(exame2);
    paciente3.getProntuario().getHistoricoExame().add(exame1);


    ControleDados banco = new ControleDados();
    banco.adicionaMedico(medico);
    banco.adicionaConsulta(consulta);
    banco.adicionaConsulta(consulta2);
    banco.adicionaConsulta(consulta3);
  
    new TelaLogin(banco).setVisible(true);
   
  }
}
