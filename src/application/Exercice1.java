package application;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos número você vai digitar? ");
		int n = sc.nextInt();
		int[] number = new int[n];

		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextInt();
		}

		System.out.println("Numeros negativos:");

		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				System.out.println(number[i]);
			}
		}

		sc.close();
	}

}
