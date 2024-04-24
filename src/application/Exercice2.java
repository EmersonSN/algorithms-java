package application;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */

		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] number = new double[n];

		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextDouble();
			sum += number[i];
		}

		System.out.print("Valores: ");
		for (int i = 0; i < number.length; i++) {
			System.out.printf("%.1f ", number[i]);
		}
		
		System.out.println();
		
		System.out.printf("Soma = %.2f%n", sum);
		System.out.printf("Media = %.2f", sum / n);

		sc.close();
	}

}
