package att_Java07;

import java.util.Scanner;

public class att1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vetorInteiro[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		 boolean encontrado = false;

		
		System.out.println("Digite o nemero que voce quer encontrar: ");
		int numero = scanner.nextInt();
		
		for (int i = 0; i < vetorInteiro.length; i++) {
			
			if (numero == vetorInteiro[i]) {
				
				System.out.print("O numero " + numero + " está localizado na posição " + i);
				encontrado = true;
			}
			
		}
		if (!encontrado) {
			System.out.print("O numero " + numero + " não foi encontrado");
		}
		
		
	}

}
