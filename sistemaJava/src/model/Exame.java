package model;

public class Exame {
    //atributos
    private String nomeExame;
    private String data;
    private String codigo;
    private Prontuario prontuario;
    private Funcionario responsavelTecnico;
    private Agenda agenda;
    
    //construtor
    public Exame(String nomeExame, String codigo){
        this.nomeExame = nomeExame;
        this.codigo = codigo;
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
    
    public Prontuario getProntuario() {
        return prontuario;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


}
