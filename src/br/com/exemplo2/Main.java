package br.com.exemplo2;

public class Main {

	public static void main(String[] args) {
	
		Pessoa pessoa = new PessoaFisica("Mario","rua 1", 6789687, "32323232", "77877", "programador", 18, 'M');
		
		System.out.println(pessoa instanceof Pessoa);
	}

}
