package br.com.exemplo2;

public abstract class Pessoa {

	private String nome;
	private String endereco;
	private int telefone;
	
	public Pessoa(String nome, String endereco, int telefone) {
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public abstract String getDocumento();
}
