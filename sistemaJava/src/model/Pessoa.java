package controle;

public abstract class Pessoa {
	
//ATRIBUTOS
	private String nome;
	private String cpf;
	private int idade;
//	private dataNascimento; //CRIAR UMA FUNÇÃO QUE JÁ GERE A IDADE DA PESSOA E INSIRA ESSE DADO
	private char sexo;
	
//CONSTRUTOR
	public Pessoa(String nome, String cpf, char sexo) {
		this.nome =nome;
		this.cpf =cpf;
		this.sexo = sexo;
	}

//MÉTODOS		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
}
