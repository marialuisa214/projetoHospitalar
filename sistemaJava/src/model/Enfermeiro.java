package model;

import java.util.ArrayList;

public class Enfermeiro extends Funcionario {
	private String crm;
	private ArrayList<Triagem> listaTriagem =new ArrayList<>();
	private ArrayList<Exame> listaExame = new ArrayList<>();
	
	//CONSTRUTOR	
	public Enfermeiro(String nome, String rg, String cpf, char sexo, String dataNascimento, String telefone, String email, String cidade, String endereco, String usuario, String senha){
		super(nome, rg, cpf, sexo, dataNascimento, telefone, email, cidade, endereco, usuario, senha);	
	}

	//METODO
	//fazAcompanhamento
	//faz prontuario
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
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
