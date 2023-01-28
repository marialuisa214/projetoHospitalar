package control;

//import model.*;
import view.TransicaoMetodosAtendente;

public class ControleDados {
  public static void main(String[] args){
    ControlePaciente pacientes = new ControlePaciente();
    TransicaoMetodosAtendente telaInicial = new TransicaoMetodosAtendente(pacientes); telaInicial.setVisible(true);

    // Paciente paciente = new Paciente("Maria", "321", "123", 'F', "10/12/2001", "4002-8922", "gatinhaassanhada@gmail.com", "Brasilia-DF", "casa do capeta", "nenhuma"); //(nome, rg, cpf, sexo, idade, dataNascimento, telefone, email, cidade, endereco, patologia);
    // Atendente atendente = new Atendente("luana", "1234", null, 'F', "10/12/2001","luana123", "123", null, null, null, null);
    // Medico medico = new Medico("carlos", "333", null, 'M', "06/04/1991", "2121", "malu", "ginicologista", null, null, null, null);
    // Marcada consulta = new Marcada("sdfg","16:00", "16:22");

    // Agenda agenda = new Agenda();
    // agenda.setMedico(medico);
    // agenda.setHorarioInicio("12/02/2023 14:30");
    // agenda.setHorarioInicio("13/02/2023 3:00");

    // // ArrayList<Consulta> listaConsultaTeste = new ArrayList<>();
    // // listaConsultaTeste.add(consulta);

    // // System.out.println(listaConsultaTeste.get(0).getCodigo());

    // atendente.agendaConsulta(agenda, paciente, consulta);
    // // System.out.println(agenda.getListaConsultas().get(0).getCodigo());

    // System.out.println(paciente.getIdade());

  }
}
