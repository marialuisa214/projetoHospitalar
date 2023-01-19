package model;

public class Marcada extends Consulta {

    // ATRIBUTOS
    private String horarioInicio; //ajustar formataçao das horas hein!!
    private String horarioFim;

    //CONSTRUTOR
    public Marcada(String codigo, String horarioInicio, String horarioFim){
        super(codigo);
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;

    }
    
    // METODOS
    public String getHorarioFim() {
        return horarioFim;
    }
    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }
    public String getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
}
