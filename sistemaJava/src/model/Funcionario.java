package controle;

public class Funcionario extends Pessoa {
	
//ATRIBUTOS	
	private String usuario;
	private String senha;
	
//CONSTRUTOR	
	public Funcionario(String nome, String cpf, char sexo, String usuario, String senha){
		super(nome, cpf, sexo);
		this.usuario = usuario;
		this.senha = senha;
	}
	
//METODOS
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
