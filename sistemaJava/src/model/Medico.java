package model;

import java.util.ArrayList;


public class Medico extends Funcionario {
//ATRIBUTOS
	private String crm;
	private String especialidade;
	private ArrayList<Agenda> listaAgenda = new ArrayList<>();




//CONSTRUTOR	

	public Medico(String nome, String rg, String cpf, char sexo, String dataNascimento, String telefone, String email, String cidade, String endereco, String usuario, String senha, String crm, String especialidade){
		super(nome, cpf, sexo, dataNascimento, usuario, senha); 
		this.crm = crm;		 		
		this.especialidade = especialidade;
	
	}
	
//METODOS
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
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
