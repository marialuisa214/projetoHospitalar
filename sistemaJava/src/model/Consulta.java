package model;

public abstract class Consulta {

    //ATRIBUTOS
    private String codigo;
    private String descricaoMedica;
    private Agenda agenda;
    private Prontuario prontuario; //adicionar miltiplicidade!!!

    //ambas as consultas, tanto a de emergencia e a marcada, não possuem hora de inicio e fim?


    //CONSTRUTOR
    public Consulta(String codigo, String descricaoMedica, Agenda agenda, Prontuario prontuario) {
        this.codigo = codigo;
        this.descricaoMedica = descricaoMedica;
        this.agenda = agenda;
        this.prontuario = prontuario;
    }
    

    //METODOS
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public String getDescricaoMedica() {
        return descricaoMedica;
    }

    public void setDescricaoMedica(String descricaoMedica) {
        this.descricaoMedica = descricaoMedica;
        
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }
}
