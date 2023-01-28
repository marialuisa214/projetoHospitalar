package model;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Pessoa {

	// ATRIBUTOS
	protected String nome;
	protected String cpf;
	protected char sexo;
	protected long idade;
	protected String dataNascimento;

	// CONSTRUTOR
	public Pessoa(String nome, String cpf, char sexo, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		calculaIdade();
	}

	// MÉTODOS
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void calculaIdade() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date dataBase = null;
		Date atual = null;

		try {
			dataBase = sdf.parse(this.dataNascimento);
			atual = sdf.parse("06/01/2023");
		} catch (java.text.ParseException e) {
			return;
		}

		long diferencaMS = atual.getTime() - dataBase.getTime();
		long diferencaSegundos = diferencaMS / 1000;
		long diferencaMinutos = diferencaSegundos / 60;
		long diferencaHoras = diferencaMinutos / 60;
		long diferencaDias = diferencaHoras / 24;
		long diferencaMeses = diferencaDias / 30;
		long diferencaAnos = diferencaMeses / 12;
		this.idade = diferencaAnos;
	}

}
