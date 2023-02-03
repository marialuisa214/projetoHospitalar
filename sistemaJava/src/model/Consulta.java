package model;


public abstract class Consulta {

    //ATRIBUTOS
    protected String codigo;
    protected String descricaoMedica;
    
    // private horario; horario em que a colsulta será realizada

    //ambas as consultas, tanto a de emergencia e a marcada, não possuem hora de inicio e fim?

    //CONSTRUTOR
    public Consulta(String codigo) {
        this.codigo = codigo;
    }
    
    Consulta pac1 = new Consulta ();
    Consulta pac2 = new Consulta();
    Consulta pac3 = new Consulta ();
    Consulta pac4 = new Consulta ();
    Consulta pac5 = new Consutta ();
    Consulta pac6 = new Consulta ();
    Consulta pac7 = new Consulta ();
    Consulta pac8 = new Consulta ();
    Consulta pac9 = new Consulta ();
    Consulta pac10 = new Consulta ();
    Consulta pac11 = new Consulta ();
    Consulta pac12 = new Consulta ();
    Consulta pac13 = new Consulta ();
    Consulta pac14 = new Consulta ();
    Consulta pac15 = new Consulta ();

    //METODOS
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescricaoMedica() {
        return descricaoMedica;
    }

    public void setDescricaoMedica(String descricaoMedica) {
        this.descricaoMedica = descricaoMedica;
    }
}