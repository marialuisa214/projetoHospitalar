package model;

import java.util.ArrayList;

public class Medico extends Funcionario {
//ATRIBUTOS
	private static String especialidade;
	private ArrayList<Agenda> listaAgenda = new ArrayList<>();



//CONSTRUTOR	
	public Medico(String nome, String rg, String cpf, char sexo, long idade,  String dataNascimento, String telefone, String email, String cidade, String endereco, String usuario, String senha, String especialidade){
		super(nome, rg, cpf, sexo, idade, dataNascimento, telefone, email, cidade, endereco, usuario, senha);		 		
		Medico.especialidade = especialidade;
	}
	
//METODOS
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		Medico.especialidade = especialidade;
	}

	public ArrayList<Agenda> getAgenda() {
		return listaAgenda;
	}
	public void setAgenda(ArrayList<Agenda> agenda) {
		this.listaAgenda = agenda;
	}
	
	public void adicionaAgenda(Agenda agenda){
		 this.listaAgenda.add(agenda);
	}

	//criar receita para o paciente
	//assinar/confirma receita
	//atestado médico?
	

}
