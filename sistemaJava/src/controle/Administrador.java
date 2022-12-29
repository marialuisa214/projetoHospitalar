package controle;

public class Administrador extends Funcionario{

//CONSTRUTOR
	public Administrador(String nome, String cpf, char sexo, String usuario, String senha){
		super(nome, cpf, sexo, usuario, senha); 		
	}
	
//METODOS
	public Medico cadastraMedico(String nome, String cpf, char sexo, String usuario, 
			String senha, String especialidade) {
		return new Medico(nome, cpf, sexo, usuario, senha, especialidade);
	}
	
	public Enfermeiro cadastraEnfermeiro(String nome, String cpf, char sexo, String usuario, String senha) {
		return new Enfermeiro(nome, cpf, sexo, usuario, senha);
	}
	
	public Farmaceutico cadastraFarmaceutico(String nome, String cpf, char sexo, String usuario, 
			String senha, int crf) {
		return new Farmaceutico(nome, cpf, sexo, usuario, senha, crf);
	}
	
	public Atendente cadastraAtendente(String nome, String cpf, char sexo, String usuario, String senha) {
		return new Atendente(nome, cpf, sexo, usuario, senha);
	}
}
