package model;

public class Emergencia extends Consulta {
    // ATRIBUTOS
    private String codigoChamada;
    private Triagem triagem;

    // CONSTRUTOR

    public Emergencia(String codigo,Paciente paciente, Medico medico, String codigoChamada, Triagem triagem) {
        super(codigo, paciente, medico);
        this.codigoChamada = codigoChamada;
        this.triagem = triagem;
    }
    // METODOS
    public Triagem getTriagem() {
        return triagem;
    }
    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public String getCodigoChamada() {
        return codigoChamada;
    }
    public void setCodigoChamada(String codigoChamada) {
        this.codigoChamada = codigoChamada;
    }
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
