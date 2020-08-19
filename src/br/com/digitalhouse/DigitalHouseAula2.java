package br.com.digitalhouse;

public class DigitalHouseAula2 {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		int[] idades = {18,21,5,7,24,67,81};
		
		for(int i = 0; i<idades.length;i++) {
			if(idades[i]>=18) {
				System.out.println("É maior de idade");
			}else {
				System.out.println("Não chegou à maioridade");
			}
		}
		for (int valor:idades) {
			if (valor>=18) {
				System.out.println("É maior de idade");
			}else {
				System.out.println("Nao chegou na maioridade");
			}
		}
		nomes[0] ="Mário";
		nomes[1] = "Gustavo";
		nomes[2] = "Mariana";
		nomes[3] = "Carol";
		nomes[9] = "Carlos";
	}

}
