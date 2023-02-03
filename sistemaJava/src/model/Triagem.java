package model;
<<<<<<< HEAD
=======
import java.util.Calendar;

>>>>>>> 6378b01eb3dc1565e3876933a9458ad1f95bb729

public class Triagem {

    // ATRIBUTOS
    private String descricao;
    private String gravidade;
    private Entrada entrada;
    private Enfermeiro enfermeiro;


    // CONSTRUTOR
    public Triagem(Entrada entrada, Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
        this.entrada = entrada;
        System.out.println(this.entrada.getPacienteVinculado().getNome());
    }

<<<<<<< HEAD
    public Triagem(String string, Enfermeiro enfermeiro2) {
    }
=======
    
    Calendar c1 =  Calendar.getInstance();
    Calendar c2 =  Calendar.getInstance();
    Calendar c3 =  Calendar.getInstance();
    Calendar c4 =  Calendar.getInstance();
    Calendar c5 =  Calendar.getInstance();
    Calendar c6 =  Calendar.getInstance();
    Calendar c7 =  Calendar.getInstance();
    Calendar c8 =  Calendar.getInstance();

    
    Paciente p1 = new Paciente ("Gabriela","057.837.986-98",'F',"19/08/1999", "demanda ginecológica");
    Paciente p2 = new Paciente ("Miguel","093.324.234-55", 'M',"21/06/1966","demanda urológica");
    Paciente p3 = new Paciente ("Lucas","939.934.983-39", 'M',"13/02/1993", "ferimento de projétil");
    Paciente p4 = new Paciente ("Laura", "024.245.098-24",'F',"02/03/2012", "dor no braço" );
    Paciente p5 = new Paciente ("Marcos","065.653.980-37", 'M', "09/11/1991", "demanda oftalmológica");
    Paciente p6 = new Paciente ("Jéssica","983.937.124-89", 'F',"14/07/1999", "ferimento por barra de ferro");
    Paciente p7 = new Paciente ("André"," 086.625.876-87", 'M',"17/04/2004", "demanda dermatológica");
    Paciente p8 = new Paciente ("Julia","736.925.647-30", 'F',"23/12/2007", "mal-estar");


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
    Triagem tri5 = new Triagem ("Marcos, 32 anos, com queixas de dor no olho esquerdo, com o olho com inchaço", "gravidade leve",e5);
    Triagem tri6 = new Triagem ("Jéssica, 24 anos,cortou-se com barra de ferro enferrujada", " gravidade média",e6);
    Triagem tri7 = new Triagem ("André, 20 anos, consulta dermatológica", "gravidade leve", e7);
    Triagem tri8 = new Triagem ("Julia, 16 anos, queixa de dor no baixo ventrem náuseas e dor de cabeça", "gravidade média", e8);

>>>>>>> 6378b01eb3dc1565e3876933a9458ad1f95bb729

    // METODOS
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