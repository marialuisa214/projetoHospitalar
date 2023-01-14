package model;

public class Prontuario {
	
	//ATRIBUTOS
		private Paciente pacienteVinculado;
		private String descricaoMedica;
		private String acompanhamento;  //o que é acompanhamento? descrição do estado do paciente?
		private float peso;
		private float altura;
		//private float dataDeInicioProntuario; -> inserir formatação de data!! e colocar ela no construtor
		//data de atualização do prontuario!
		
		
	//CONSTRUTOR	
		public Prontuario(Paciente pacienteVinculado, String descricaoMedica, float peso,float altura) {
			this.pacienteVinculado = pacienteVinculado;
			this.descricaoMedica = descricaoMedica;
			this.peso = peso;
			this.altura = altura;
		}

	//METODOS	
		public Paciente getPacienteVinculado() {
			return pacienteVinculado;
		}

		public void setPacienteVinculado(Paciente pacienteVinculado) {
			this.pacienteVinculado = pacienteVinculado;
		}

		public String getDescricaoMedica() {
			return descricaoMedica;
		}

		public void setDescricaoMedica(String descricaoMedica) {
			this.descricaoMedica = descricaoMedica;
		}

		public String getAcompanhamento() {
			return acompanhamento;
		}

		public void setAcompanhamento(String acompanhamento) {
			this.acompanhamento = acompanhamento;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		
	}