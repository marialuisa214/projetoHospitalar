package model;

public class Emergencia extends Consulta {
    // ATRIBUTOS
    private String codigoChamada;
    private Triagem triagem;

    // CONSTRUTOR
    public Emergencia(String codigo, String codigoChamada, Triagem triagem) {
        super(codigo);
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
    
}
