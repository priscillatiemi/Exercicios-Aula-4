package br.com.digitalhouse;

public class Main {

	public static void main(String[] args) {
		
		String nome = "docinho";
		boolean chato = true;	
		Teste gato1= new Teste("docinho","persa",0.4,13);
		Teste gato2 = new Teste("docinho", "persa",0.4, 13);
		Teste gato3 = gato1;
				//System.out.println(gato1.toString());
		System.out.println(gato1.isChato());
		gato1.setChato(chato);
		System.out.println(gato1.isChato());
		//System.out.println(gato1.isChato());
		//gato1.miar();
			}
	}

