package model;

import java.util.ArrayList;

public class Medico extends Funcionario {
//ATRIBUTOS
	private String especialidade;
	private String crm;
	
	private ArrayList<Agenda> listaAgenda = new ArrayList<>();
	


//CONSTRUTOR	
	public Medico(String nome, String rg, String cpf, char sexo, String dataNascimento, String telefone, String email, String cidade, String endereco, String usuario, String senha, String crm, String especialidade){
		super(nome, rg, cpf, sexo, dataNascimento, telefone, email, cidade, endereco, usuario, senha);		 		
		this.crm = crm;
		this.especialidade = especialidade;
	}
	
//METODOS
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getRg() {
	return rg;
}

public void setRg(String rg) {
	this.rg = rg;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public char getSexo() {
	return sexo;
}

public void setSexo(char sexo) {
	this.sexo = sexo;
}

public long getIdade() {
	return idade;
}

public void setIdade(long idade) {
	this.idade = idade;
}

public String getDataNascimento() {
	return dataNascimento;
}

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
	
	public String getCrm() {
		return crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	//criar receita para o paciente
	//assinar/confirma receita
	//atestado médico?
	
	
}
