package control;

import model.*;

import java.util.*;
import java.text.*;

public class ControleAgenda {

  public Agenda agenda;

  public int diferencaHoras(String horarioInicio, String horarioFim) throws ParseException {

    DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    Date d1 = df.parse(horarioInicio);
    Date d2 = df.parse(horarioFim);

    long diff = d1.getTime() - d2.getTime();
    int diffHours = (int) (diff / (60 * 60 * 1000) % 24);

    return diffHours;
  }

  public void quantidadeConsultas() throws ParseException {
    String t = agenda.getHorarioInicio();
    String h = agenda.getHorarioFim();

    int consultas = (diferencaHoras(h, t) * 60) / 30;
    this.agenda.setQuantidadeConsultas(consultas);
  }

  public void adicionaConsulta(Consulta consulta) {
    this.agenda.setListaConsultas(consulta);
  }

}
