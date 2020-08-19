package br.com.digitalhouse;

public class Teste {
		
		String nome;
		String raca;
		double tamanho;
		double peso;
		String cor;
		boolean chato;
		char sexo;
		int idade;
		
		public Teste() {
			
		}
		public Teste(String nome, String raca,double peso, int idade) {
			this.nome=nome;
			this.raca=raca;
			this.peso=peso;
 			this.idade=idade;
		}
		

		public void miar() {
			System.out.println("miauuuu");
		}
		public boolean isChato() {
			boolean chato;
			if(this.chato) {
				System.out.println("Ele é chato");
				chato = true;
			}else {
				System.out.println("Ele é manso");
				chato = false;
			}
			return chato;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getRaca() {
			return raca;
		}
		public void setRaca(String raca) {
			this.raca = raca;
		}
		public double getTamanho() {
			return tamanho;
		}
		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public char getSexo() {
			return sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void setChato(boolean chato) {
			this.chato = chato;
		}
	}


