package controle;

public class Condicao {
//ATRIBUTOS
	private Paciente pacienteVinculado;
	private String descricao;
//	private data em que é registrada essa condição
//	atributos de pré exame? saturação, pressão, temperatura corporal?
	
//CONSTRUTOR
	public Condicao(Paciente pacienteVinculado, String descricao) {
		this.pacienteVinculado = pacienteVinculado;
		this.descricao = descricao;
	}
	
//METODO
	public Paciente getPacienteVinculado() {
		return pacienteVinculado;
	}
	public void setPacienteVinculado(Paciente pacienteVinculado) {
		this.pacienteVinculado = pacienteVinculado;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
