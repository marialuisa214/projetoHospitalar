package model;

public class testeModel {
  public static void main(String[] args){
    Paciente paciente = new Paciente("Maria", "123", 'F', "10/12/2001", "nenhuma");
    Atendente atendente = new Atendente("luana", "1234", 'F', "10/12/2001","luana123", "123");
    Medico medico = new Medico("carlos", "333", 'M', "06/04/1991", "2121", "malu", "ginicologista");
    Consulta consulta = new Marcada("sdfg","16:00", "16:22");


    Agenda agenda = new Agenda();
    agenda.setMedico(medico);
    agenda.setHorarioInicio("12/02/2023 14:30");
    agenda.setHorarioInicio("13/02/2023 3:00");
    
    atendente.agendaConsulta(paciente, agenda, consulta);

    System.out.println(paciente.getProntuario().getHistoricoConsultas().get(0));
    
  }
}
