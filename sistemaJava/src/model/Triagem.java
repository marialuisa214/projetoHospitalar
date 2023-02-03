package model;
import model.Entrada;

public class Triagem {

    // ATRIBUTOS
    private Paciente pacienteVinculado;
    private String descricao;
    private String gravidade;
    private Entrada entrada;
    private Enfermeiro enfermeiro;

    // CONSTRUTOR
    public Triagem(String descricao, String gravidade, Entrada entrada) {
        this.descricao = descricao;
        this.gravidade = gravidade;
        this.entrada = entrada;
    }

    
    Calendar c1 = new Calendar.getInstance();
    Calendar c2 = new Calendar.getInstance();
    Calendar c3 = new Calendar.getInstance();
    Calendar c4 = new Calendar.getInstance();
    Calendar c5 = new Calendar.getInstance();
    Calendar c6 = new Calendar.getInstance();
    Calendar c7 = new Calendar.getInstance();
    Calendar c8 = new Calendar.getInstance();

    
    Paciente p1 = new Triagem ("Gabriela","057.837.986-98",'F',"19/08/1999");
    Paciente p2 = new Triagem ("Miguel","093.324.234-55", 'M',"21/06/1966");
    Paciente p3 = new Triagem ("Lucas","939.934.983-39", 'M',"13/02/1993");
    Paciente p4 = new Triagem ("Laura", "024.245.098-24",'F',"02/03/2012" );
    Paciente p5 = new Triagem ("Marcos","065.653.980-37", 'M', "09/11/1991");
    Paciente p6 = new Triagem ("Jéssica" "345.863.245-67", 'F',"14/07/1999");
    Paciente p7 = new Triagem ("André"," 086.625.876-87", 'M',"17/04/2004");
    Paciente p8 = new Triagem ("Julia","736.925.647-30", 'F',"23/12/2007");


    Entrada e1 = new Entrada(c1,"paciente está bem, mas precisa consultar",p1);
    Entrada e2 = new Entrada(c2,"paciente está com dores a região afetada",p2);
    Entrada e3 = new Entrada(c3,"paciente perdendo sangue e com dor",p3);
    Entrada e4 = new Entrada(c4,"paciente com dor no braço",p4);
    Entrada e5 = new Entrada(c5,"paciente com dor nos olhos e visão turva",p5);
    Entrada e6 = new Entrada(c6,"paciente sangrando, com dor",p6);
    Entrada e7 = new Entrada(c7,"paciente bem, esperando consulta",p7);
    Entrada e8 = new Entrada(c8,"paciente com dores no baixo ventre e náuseas",p8);

    


    Triagem tri1 = new Triagem ("Gabriela, 24 anos, consulta ginecológica","gravidade leve",e1);
    Triagem tri2 = new Triagem ("Miguel, 57 anos, consulta urológica", "gravidade leve",e2);
    Triagem tri3 = new Triagem ("Lucas,30 anos, paciente sem comorbidades levou um tiro na perna","gravidade alta", e3);
    Triagem tri4 = new Triagem ("Laura, 11 anos, paciente quebrou o braço brincando com amigos","gravidade alta", e4);
    Triagem tri5 = new Triagem ("Marcos, 32 anos, com queixas de dor no olho esquerdo, com o olho com inchaço", "gravidade leve","pronto-socorro",e5);
    Triagem tri6 = new Triagem ("Jéssica, 24 anos,cortou-se com barra de ferro enferrujada", " gravidade média",e6);
    Triagem tri7 = new Triagem ("André, 20 anos, consulta dermatológica", "gravidade leve", e7);
    Triagem tri8 = new Triagem ("Julia, 16 anos, queixa de dor no baixo ventrem náuseas e dor de cabeça", "gravidade média", "pronto-socorro", e8);


    // METODOS
    public Paciente getPacienteVinculado() {
        return pacienteVinculado;
    }

    public void setPacienteVinculado(Paciente pacienteVinculado) {
        this.pacienteVinculado = pacienteVinculado;
    }

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

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    // public void cadastraProntuario(Float altura, Float peso, String acompanhamento) {
    //     // quando o paciente ainda não possui prontuario preenchido:
    //     if (this.pacienteVinculado.getProntuario().getValidado() == false) {
    //         this.pacienteVinculado.getProntuario().setAcompanhamento(acompanhamento);
    //         this.pacienteVinculado.getProntuario().setPeso(peso);
    //         this.pacienteVinculado.getProntuario().setAltura(altura);

    //         this.pacienteVinculado.getProntuario().setValidado(true);
    //     }
    // }

}
