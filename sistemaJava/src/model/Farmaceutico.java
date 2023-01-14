package model;

public class Farmaceutico extends Funcionario {
//ATRIBUTOS
	private int crf;
	
	
//CONSTRUTOR
	public Farmaceutico(String nome, String cpf, char sexo, String dataNascimento, String usuario, String senha, int crf){
		super(nome, cpf, sexo, dataNascimento, usuario, senha); 				
		this.crf = crf;
	}
	
//METODOS
	public int getCrf() {
		return crf;
	}
	public void setCrf(int crf) {
		this.crf = crf;
	}

}
