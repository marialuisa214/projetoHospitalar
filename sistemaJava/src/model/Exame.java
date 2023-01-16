package model;

import java.util.*;

public class Exame {
    //atributos
    private String nome;
    private String codigo;
    private Funcionario responsavelTecnico;

    //construtor
    public Exame(String nome, String codigo, Funcionario responsavelTecnico){
        this.nome = nome;
        this.codigo = codigo;
        this.responsavelTecnico = responsavelTecnico;
    }

    //métodos 

    public String getNome() {
        return nome;
      }
    public void setNome(String nome) {
        this.nome = nome;
      }
    public String getCodigo() {
        return codigo;
      }  
    public void setCodigo() {
        this.codigo = codigo;
      }
    public Funcionario getResponsavelTecnico(){
        return responsavelTecnico;
      }  
    public Funcionario setResponsavelTecnico(){
        this.responsavelTecnico;
    }  

}
