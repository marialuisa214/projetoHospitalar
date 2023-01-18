package model;
import java.util.ArrayList;

public class Paciente extends Pessoa {
//ATRIBUTOS	
	private String patologia; //cormobidade, restrição médica
	private String tipoSanguineo;
	private Prontuario prontuario;
	private ArrayList<Entrada> listaEntradas;
	
public ArrayList<Entrada> getListaEntradas() {
		return listaEntradas;
	}
	public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}
	//CONSTRUTOR	
	public Paciente(String nome, String cpf, char sexo, String dataNascimento, String patologia, Prontuario prontuario){
		super(nome, cpf, sexo, dataNascimento);
		this.patologia = patologia; 
		this.prontuario = new Prontuario();
	}
//METODOS
	public String getPatologia() {
		return patologia;
	}
	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public Prontuario getProntuario() {
		return prontuario;
	}
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}


}
