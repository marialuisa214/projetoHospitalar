package controle;

public class Atendente extends Funcionario{

//ATRIBUTOS

//CONSTRUTOR
	public Atendente(String nome, String cpf, char sexo, String usuario, String senha){
		super(nome, cpf, sexo, usuario, senha); 		
	}
	
//METODO
	public Paciente cadastraPaciente(String nome, String cpf, char sexo, String patologia, String tipoSanguineo) {
		return new Paciente(nome, cpf, sexo, patologia, tipoSanguineo);
	}
}
