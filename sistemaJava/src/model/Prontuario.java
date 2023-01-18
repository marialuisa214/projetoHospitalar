package model;

import java.util.ArrayList;

public class Prontuario {
	
	//ATRIBUTOS
		private String acompanhamento;  //descrição médica
		private float peso;
		private float altura;
		// private boolean validado = false;
		private ArrayList<Consulta> historicoConsultas;
		private ArrayList<Exame> historicoExame;
		//private float dataDeInicioProntuario; -> inserir formatação de data!! e colocar ela no construtor

	//CONSTRUTOR

		//METODOS	
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

		// public boolean isValidado() {
		// 	return validado;
		// }

		// public void setValidado(boolean validado) {
		// 	this.validado = validado;
		// }

		public ArrayList<Consulta> getHistoricoConsultas() {
			return historicoConsultas;
		}

		public ArrayList<Exame> getHistoricoExame() {
			return historicoExame;
		}

	// inserir item por item por item dentro do array 
		// public void setHistoricoConsultas(ArrayList<Consulta> historicoConsultas) {
		// 	this.historicoConsultas = historicoConsultas;
		// }
		
		
	}