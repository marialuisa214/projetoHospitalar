package model;

public abstract class Consulta {

    //ATRIBUTOS
    protected String codigo;
    protected String descricaoMedica;
    
    // private horario; horario em que a colsulta será realizada

    //ambas as consultas, tanto a de emergencia e a marcada, não possuem hora de inicio e fim?


    //CONSTRUTOR
    public Consulta(String codigo ) { 
        this.codigo = codigo;
    }
    

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
