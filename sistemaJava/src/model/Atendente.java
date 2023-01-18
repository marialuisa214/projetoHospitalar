package model;

public class Atendente extends Funcionario{

//ATRIBUTOS

//CONSTRUTOR
	public Atendente(String nome, String cpf, char sexo, String dataNascimento, String usuario, String senha){
		super(nome, cpf, sexo, dataNascimento, usuario, senha); 		
	}
	
//METODO
	public Paciente cadastraPaciente(String nome, String cpf, char sexo, String dataNascimento, String patologia, Prontuario prontuario) {
		return new Paciente(nome, cpf, sexo, dataNascimento, patologia, prontuario);
	}

	
}