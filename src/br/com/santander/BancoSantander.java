package br.com.santander;


public class BancoSantander {
	private int numeroCliente;
	private String sobrenome;
	private String rg;
	private String cpf;
	private double contaPoupanca;
	private double contaCorrente;
	private double jurosMensais;
	private double saque;
	
	public BancoSantander(int numeroCliente, String sobrenome, 
			String rg, String cpf, double contaPoupanca, 
			double contaCorrente) {
		this.numeroCliente = numeroCliente;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.contaPoupanca = contaPoupanca;
		this.contaCorrente = contaCorrente;
	}
	
	
	public int getNumeroCliente() {
		return numeroCliente;
	}



	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public double getContaPoupanca() {
		return contaPoupanca;
	}



	public void setContaPoupanca(double contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}



	public double getContaCorrente() {
		return contaCorrente;
	}



	public void setContaCorrente(double contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public double getJurosMensais() {
		return jurosMensais;
	}



	public void setJurosMensais(double jurosMensais) {
		this.jurosMensais = jurosMensais;
	}

	
	public double getSaque() {
		return saque;
	}


	public void setSaque(double saque) {
		this.saque = saque;
	}


	public void depositar() {
		System.out.println("Pode depositar a quantia que quiser");
	}
	
	public void sacar() {
		if(this.contaPoupanca>saque) {
			System.out.println("Pode sacar");
		}else {
			System.out.println("Não pode sacar");
		}
	}
	
	public void recolherJuros(double contaPoupanca) {
		jurosMensais = contaPoupanca + jurosMensais;
		System.out.println(jurosMensais);
	}
	
	public void depositarCheques(double contaCorrente) {
		double valor = 10.00;
		String emissor = "Joana";
		String data = "17/08/2020";
		System.out.println(valor);
		System.out.println(emissor);
		System.out.println(data);
	}
	
	public void sacarDinheiro () {
		if(this.contaCorrente>saque) {
			System.out.println("Pode sacar o dinheiro");
		}else {
			System.out.println("Usar o cheque especial");
		}
	}
}
