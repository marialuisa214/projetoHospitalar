package model;
import java.util.Calendar;
 


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

    
        Paciente p1 = new Paciente("Júlia Souza da Silva", "056.345.654-50", 'F', "19/11/1999", "gripe");
        Paciente p2 = new Paciente("Joaquin Ferreira Costa", "056.938.393-30", 'M', "13/02/1996", "braço quebrado");

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        Entrada e1 = new Entrada(c1,"paciente apresenta sintomas gripais",p1);
        Entrada e2 = new Entrada(c2,"paciente quebrou o braço direito",p2);

        Triagem t1 = new Triagem("paciente está com sintomas gripais severos", "moderada",e1 );
        Triagem t2 = new Triagem ("Paciente está com o braço direito quebrado", "grave",e2);

        Emergencia emer1 = new Emergencia("345765","564129",t1);
        Emergencia emer2 = new Emergencia ("978653","976468",t2);
        

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
