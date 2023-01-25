package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Marcada extends Consulta {

    // ATRIBUTOS
    private Date dia;
    private String horarioInicio; //ajustar formataçao das horas hein!!
    private String horarioFim;

    //CONSTRUTOR
    
    public Marcada(String codigo, Paciente paciente,  Medico medico, String horarioInicio, String horarioFim) {
        super(codigo, paciente, medico);
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }
    // METODOS

    public Date getDia() {
        return dia;
    }
    public void setDia(String dia) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Date dataBase = null;

		try {
			dataBase = sdf.parse(dia);
		} catch (java.text.ParseException e) {
			return;
		}
		this.dia = dataBase;
    }

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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}


