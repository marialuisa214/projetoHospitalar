package model;

public class Atendente extends Funcionario{

//ATRIBUTOS
	private String idAtendente;

	
//CONSTRUTOR
	public Atendente(String nome, String cpf, char sexo, String dataNascimento, String usuario, String senha){
		super(nome, cpf, sexo, dataNascimento, usuario, senha); 		
	}
	
//METODO
	public String getIdAtendente() {
			return idAtendente;
	}
	
	public void setIdAtendente(String idAtendente) {
		this.idAtendente = idAtendente;
	}
	
}