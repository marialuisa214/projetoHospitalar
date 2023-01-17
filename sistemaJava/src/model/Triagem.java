package model;

public class Triagem {

    //ATRIBUTOS
    private String descricao;
    private String gravidade;
    private Entrada entrada;

    //CONSTRUTOR
    public Triagem(String descricao, String gravidade, Entrada entrada) {
        this.descricao = descricao;
        this.gravidade = gravidade;
        this.entrada = entrada;
    }
    
    //METODOS
    public Entrada getEntrada() {
        return entrada;
    }
    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    public String getGravidade() {
        return gravidade;
    }
    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
