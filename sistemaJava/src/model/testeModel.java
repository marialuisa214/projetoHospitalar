package model;

import java.text.ParseException;

public class testeModel {
  public static void main(String[] args){
    Agenda teste = new Agenda();
      teste.setHorarioInicio("02/01/2023 18:30");
      teste.setHorarioFim("03/01/2023 04:30");
      try{
        teste.quantidadeConsultas();
      } catch(ParseException e) {return;}
      
      System.out.println(teste.getQuantidadeConsultas());

    }

  }
  
