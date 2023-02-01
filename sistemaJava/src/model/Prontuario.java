package model;

import java.util.ArrayList;

public class Prontuario {

	// ATRIBUTOS
	private Paciente paciente;
	private String acompanhamento; // descrição médica
	private float peso;
	private float altura;
	private boolean validado;
	// private ArrayList<Consulta> historicoConsultas;
	// private ArrayList<Exame> historicoExame;
	// private float dataDeInicioProntuario; -> inserir formatação de data!! e
	// colocar ela no construtor
	private ArrayList<Marcada> historicoConsultasMarcadas = new ArrayList<>();
	private ArrayList<Emergencia> historicoConsultasEmergencia = new ArrayList<>();
	// private ArrayList<Emergencia> historicoConsultasEmergencia = new ArrayList<>();
	private ArrayList<Exame> historicoExame =  new ArrayList<>();
	//private float dataDeInicioProntuario; -> inserir formatação de data!! e colocar ela no construtor

	// CONSTRUTOR
	public Prontuario() {
		this.validado = false;
		// ou seja, sempre ao criar um prontuario ele vem sem os dados,
		// só podendo ser passar a ser 'true' quando preenchido por outra classe

	}

	// METODOS

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public boolean getValidado() {
		return validado;
	}

	public void setValidado(boolean validado) {
		this.validado = validado;
	}

	public ArrayList<Marcada> getHistoricoConsultasMarcadas() {
		return historicoConsultasMarcadas;
	}

	public void setHistoricoConsultasMarcadas(Marcada consulta) {
		historicoConsultasMarcadas.add(consulta);
	}

	public ArrayList<Exame> getHistoricoExame() {
		return historicoExame;
	}

	public void setHistoricoExame(Exame exame) {
		historicoExame.add(exame);
	}

	public ArrayList<Emergencia> getHistoricoConsultasEmergencia() {
		return historicoConsultasEmergencia;
	}

	public void setHistoricoConsultasEmergencia(ArrayList<Emergencia> historicoConsultasEmergencia) {
		this.historicoConsultasEmergencia = historicoConsultasEmergencia;
	}

	// public ArrayList<Consulta> getHistoricoConsultas() {
	// return historicoConsultas;
	// }
	// public void adicionaConsulta(Consulta consulta){
	// historicoConsultas.add(consulta);
	// }
	// public ArrayList<Exame> getHistoricoExame() {
	// return historicoExame;
	// }
	// public void adicionaExame(Exame exame){
	// historicoExame.add(exame);
	// }
		
	}