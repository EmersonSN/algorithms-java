package application;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] number = new double[n];

		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um número: ");
			number[i] = sc.nextDouble();
		}
		double maxValue = 0;
		int position = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i] > maxValue) {
				maxValue = number[i];
				position = i;
			}
		}

		System.out.println();
		System.out.print("Maior valor = " + maxValue);
		System.out.println();
		System.out.print("Posição do maior valor = " + position);

		sc.close();
	}

}
