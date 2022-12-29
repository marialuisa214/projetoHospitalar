package controle;

public class Paciente extends Pessoa {
//ATRIBUTOS	
	private String patologia;
	private String tipoSanguineo;
	
//CONSTRUTOR	
	public Paciente(String nome, String cpf, char sexo, String patologia, String tipoSanguineo){
		super(nome, cpf, sexo);
		this.patologia = patologia;
		this.tipoSanguineo = tipoSanguineo;
	}
//METODOS
	public String getPatologia() {
		return patologia;
	}
	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
	

}
