package application;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quanto valores vai ter cada vetor? ");
		int n = sc.nextInt();
		int[] number1 = new int[n];
		int[] number2 = new int[n];

		System.out.println("Gigite valores do vetor A: ");
		for (int i = 0; i < number1.length; i++) {
			number1[i] = sc.nextInt();
		}

		System.out.println("Gigite valores do vetor B: ");
		for (int i = 0; i < number2.length; i++) {
			number2[i] = sc.nextInt();
		}

		System.out.println("Vetor resultante: ");
		for (int i = 0; i < number1.length; i++) {
			int soma = number1[i] + number2[i];
			System.out.println(soma);
		}

		sc.close();
	}

}
