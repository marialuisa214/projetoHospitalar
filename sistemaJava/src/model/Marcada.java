package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Marcada extends Consulta {

    // ATRIBUTOS
    private String horarioInicio; //ajustar formataçao das horas hein!!
    private String horarioFim;
    private String Dia;
    private boolean status;
    private String descricaoMedica;

    //CONSTRUTOR
    public Marcada(String codigo, Paciente paciente,  Medico medico, String horarioInicio, String horarioFim) {
        super(codigo, paciente, medico);
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.status = false;
    }
    // METODOS

    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        Dia = dia;
    }
    // public void setDia(String dia) {
    //     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	// 	Date dataBase = null;

	// 	try {
	// 		dataBase = sdf.parse(dia);
	// 	} catch (java.text.ParseException e) {
	// 		return;
	// 	}
	// 	this.dia = dataBase;
    // }

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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getDescricaoMedica() {
        return descricaoMedica;
    }

    public void setDescricaoMedica(String descricaoMedica) {
        this.descricaoMedica = descricaoMedica;
    }
}


