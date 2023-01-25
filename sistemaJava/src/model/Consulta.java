package model;

public abstract class Consulta {

    //ATRIBUTOS
    protected Paciente paciente;
    protected String codigo;
    protected String descricaoMedica;
    

    //CONSTRUTOR
    public Consulta(String codigo, Paciente paciente) {
        this.codigo = codigo;
        this.paciente = paciente;
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
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}