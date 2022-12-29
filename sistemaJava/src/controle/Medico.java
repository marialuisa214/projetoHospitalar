package controle;

public class Medico extends Funcionario {
//ATRIBUTOS
	private String especialidade;
	
//CONSTRUTOR	
	public Medico(String nome, String cpf, char sexo, String usuario, String senha, String especialidade){
		super(nome, cpf, sexo, usuario, senha); 		
		this.especialidade = especialidade;
	}

	
	
//METODOS
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	//criar receita para o paciente
	//assinar/confirma receita
	//atestado médico?
	

}
