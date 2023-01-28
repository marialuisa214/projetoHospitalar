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
    
    Paciente paciente = new Paciente("Maria", "321312", "23132", 'F', "31/08/2003", "432123", "malalal", "jijsijsioa", "isjiajis", "nenhuma");
    Paciente paciente2 = new Paciente("Matheus", "321312", "23132", 'F', "31/08/2003", "432123", "malalal", "jijsijsioa", "isjiajis", "nenhuma");
    Paciente paciente3 = new Paciente("Elaine", "321312", "23132", 'F', "31/08/2003", "432123", "malalal", "jijsijsioa", "isjiajis", "nenhuma");
    
    // Atendente atendente = new Atendente("luana", "1234", 'F', "10/12/2001","luana123", "123");
    Medico medico = new Medico("DR Carlos", "32121", "222", 'M', "12/12/1981", "telefone", "email", "cidade", "endereço", "usuario", "senha", "oiCRM", "ginecologista");
    Marcada consulta = new Marcada("123", paciente, medico);

    Enfermeiro enfermeiro = new Enfermeiro("nome", "rg", "cpf", 'F', "03/04/1994", "324232-2322", "email", "cidade", null, "user", "sena");
    System.out.println(consulta.getPaciente().getNome());
    Marcada consulta2 = new Marcada("333", paciente2, medico);
    Marcada consulta3 = new Marcada("457", paciente3, medico);
    Marcada consultafeita = new Marcada("456", paciente3, medico);
    Marcada consulta4 = new Marcada("33763", paciente3, medico);
    consultafeita.setDescricaoMedica("muita daiarreia, Todo cagado");
    // consultafeita.setDia("12/02/2023");

    Exame exame1 = new Exame("tomografia", "211");
    Exame exame2 = new Exame("colonoscopia", "421");

    paciente3.getProntuario().getHistoricoConsultasMarcadas().add(consulta3);
    paciente3.getProntuario().getHistoricoConsultasMarcadas().add(consultafeita);
    paciente3.getProntuario().getHistoricoConsultasMarcadas().add(consulta4);
    paciente3.getProntuario().getHistoricoExame().add(exame2);
    paciente3.getProntuario().getHistoricoExame().add(exame1);

    Entrada entrada = new Entrada("Muita febre, colicas", paciente3);
    Triagem triagem = new Triagem(entrada, enfermeiro);

    enfermeiro.getListaTriagem().add(triagem);
    enfermeiro.getListaExame().add(exame1);
    enfermeiro.getListaExame().add(exame2);



    ControleDados banco = new ControleDados();
    banco.adicionaMedico(medico);
    banco.adicionaConsulta(consulta);
    banco.adicionaConsulta(consulta2);
    banco.adicionaConsulta(consulta3);
    banco.getBancoEnfermeiros().add(enfermeiro);
  
    new TelaLogin(banco).setVisible(true);

    // System.out.println(enfermeiro.getListaTriagem().get(0).getEntrada().getDataEntrada());


   
  }
}
