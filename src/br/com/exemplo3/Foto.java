package br.com.exemplo3;

public class Foto implements Imprimivel{
	
	public void imprimir() {
		System.out.println("Sou uma foto");
	}
	
	public int numeroImpressao() {
		return 15;
	}
}
