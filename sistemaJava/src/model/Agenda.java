package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Agenda {

  //ATRIBUTOS
  private Calendar dia; //colocar essa porcaria no formato certo
  private Medico medico;
  private String horarioInicio;
  private String horarioFim;
  private Exame exame;
  private int quantidadeConsultas;
  private ArrayList<Consulta> listaConsultas = new ArrayList<>();
  
  
  //criar lista com os horarios, a parti do tempo disponivel na agenda do médico [1,2,3,4,5,6]
  // espaços a serem preencido por exame ou consulta
  
  //METODOS
  public Calendar getDia() {
    return dia;
  }

  public void setDia(Calendar dia) {
    this.dia = dia;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public String getHorarioInicio() {
    return horarioInicio;
  }

  public void setHorarioInicio(String horarioInicio) {
    this.horarioInicio = horarioInicio;
  }

  public String getHorarioFim() {
    return horarioFim;
  }

  public void setHorarioFim(String horarioFim) {
    this.horarioFim = horarioFim;
  }

  public int getQuantidadeConsultas() {
    return quantidadeConsultas;
  }

  public void setQuantidadeConsultas(int quantidadeConsultas) {
    this.quantidadeConsultas = quantidadeConsultas;
  }

  public void setListaConsultas(Consulta consulta) {
    this.listaConsultas.add(consulta);
  }

  public Exame getExame() {
    return exame;
  }

  public void setExame(Exame exame) {
    this.exame = exame;
  }

  public ArrayList<Consulta> getListaConsultas() {
    return listaConsultas;
  }

  public void adicionaConsulta(Consulta consulta) {
    this.listaConsultas.add(consulta);
  }

   // public int diferencaHoras(String horarioInicio, String horarioFim) throws ParseException{
     
   //   DateFormat df = new SimpleDateFormat ("dd/MM/yyyy hh:mm");
     
   //   Date d1 = df.parse (horarioInicio);
   //   Date d2 = df.parse (horarioFim);
   
   
   // long diff = d1.getTime() - d2.getTime();
   // int diffHours = (int) (diff /  (60 * 60 * 1000) % 24);
   
   // return diffHours;
   // }
   
   // public void quantidadeConsultas() throws ParseException{
   //    String t = getHorarioInicio();
   //    String h = getHorarioFim();
   
   //   int consultas = (diferencaHoras(h, t) * 60) / 30;
   //   this.quantidadeConsultas = consultas;
   
   // }

}
