package application;

import java.util.Scanner;

public class Exercice4 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */

		Scanner sc = new Scanner(System.in);
		int qtd = 0;
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextInt();
			if (number[i] % 2 == 0) {
				qtd++;
			}
		}
		System.out.print("Numeros pares: ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.print(number[i] + " ");
			}
		}

		System.out.println();
		System.out.println("Quantidade de pares = " + qtd);

		sc.close();
	}
}
