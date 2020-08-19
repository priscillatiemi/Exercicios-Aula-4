package br.com.aula4;

public class Carro extends Veiculo{
	private String buzina;
	private boolean arCondicionado;
	
	public Carro(String marca, String placa, String cor, String modelo, int ano, String combustivel, String buzina, boolean arCondicionado) {
		super(marca,placa,cor, modelo, ano, combustivel, buzina, arCondicionado);
		this.buzina=buzina;
		this.arCondicionado=arCondicionado;
		
	}

	public String getBuzina() {
		return buzina;
	}

	public void setBuzina(String buzina) {
		this.buzina = buzina;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
}
