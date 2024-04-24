package application;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */

		Scanner sc = new Scanner(System.in);
		int sum = 0, j = 0;

		System.out.print("Quantos elementos terá no vetor? ");
		int n = sc.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um número: ");
			number[i] = sc.nextInt();
			if (number[i] % 2 == 0) {
				sum += number[i];
				j++;
			}
		}
		
		if(sum > 0) {
			double avg = sum / j;
			System.out.printf("Media dos pares = %.1f", avg);
		} else {
			System.out.println("Nenhum numero par");
		}
		sc.close();
	}

}
