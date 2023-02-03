package model;

import java.util.ArrayList;

public class Enfermeiro extends Funcionario {
	private String coren;
	

	private ArrayList<Triagem> listaTriagem =new ArrayList<>();
	private ArrayList<Exame> listaExame = new ArrayList<>();
	
	//CONSTRUTOR	
	public Enfermeiro(String nome, String rg, String cpf, char sexo, String dataNascimento, String telefone, String email, String cidade, String endereco, String usuario, String senha, String coren){
		super(nome, rg, cpf, sexo, dataNascimento, telefone, email, cidade, endereco, usuario, senha);	
		this.coren = coren;
	}

	//METODO

	public String getCorem() {
		return coren;
	}

	public void setCorem(String corem) {
		this.coren = coren;
	}
	
	public ArrayList<Triagem> getListaTriagem() {
		return listaTriagem;
	}
	public void setListaTriagem(ArrayList<Triagem> listaTriagem) {
		this.listaTriagem = listaTriagem;
	}

	public ArrayList<Exame> getListaExame() {
		return listaExame;
	}

	public void setListaExame(ArrayList<Exame> listaExame) {
		this.listaExame = listaExame;
	}


	

}