package application;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */

		Scanner sc = new Scanner(System.in);
		double sum = 0;

		System.out.print("Quantos elementos vão ter o vetor? ");
		int n = sc.nextInt();
		double[] number = new double[n];

		for (int i = 0; i < number.length; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextDouble();
			sum += number[i];
		}

		double avg = sum / n;

		System.out.printf("Media do vetor = %.3f %n", avg);

		System.out.println("Elementos abaixo da media: ");

		for (int i = 0; i < number.length; i++) {
			if (number[i] < avg) {
				System.out.printf("%.1f %n",number[i]);
			}
		}

		sc.close();
	}

}
