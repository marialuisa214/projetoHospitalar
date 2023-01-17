package model;

public class Exame {
    //atributos
    private String nomeExame;
    private String codigo;
    private Funcionario responsavelTecnico;
    private Agenda agenda;
    
    //construtor
    public Exame(String nomeExame, String codigo, Funcionario responsavelTecnico){
        this.nomeExame = nomeExame;
        this.codigo = codigo;
        this.responsavelTecnico = responsavelTecnico;
    }
    //métodos 

    public String getNomeExame() {
        return nomeExame;
    }
    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }
    public String getCodigo() {
        return codigo;
    }  
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Funcionario getResponsavelTecnico() {
      return responsavelTecnico;
    }

    public void setResponsavelTecnico(Funcionario responsavelTecnico) {
      this.responsavelTecnico = responsavelTecnico;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    private Prontuario prontuario;

    public Prontuario getProntuario() {
        return prontuario;
    }


}
