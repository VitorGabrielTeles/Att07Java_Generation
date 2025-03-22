package att_Java07;
import java.util.Scanner;


import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Elementos nos índices ímpares: ");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // 

        System.out.print("Elementos pares: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) { 
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();

        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma: " + soma);

        double media = (double) soma / 10; 
        System.out.printf("Média: %.2f%n", media); 

        scanner.close();
    }
}
