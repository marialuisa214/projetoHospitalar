package model;

public class Administrador extends Funcionario{
	
	//ATRIBUTO
	private String idAdmin; 
	
	
	//CONSTRUTOR
	
	public Administrador(String nome, String cpf, char sexo, String dataNascimento, String usuario, String senha){
			super(nome, cpf, sexo, dataNascimento, usuario, senha);		
	}
	
	//METODOS
		public String getIdAdmin() {
			return idAdmin;
		}	
	
		public void setIdAdmin(String idAdmin) {
			this.idAdmin = idAdmin;
		}
}
