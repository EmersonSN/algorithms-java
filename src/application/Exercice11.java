package application;

import java.util.Scanner;

import entities.Register;

public class Exercice11 {

	public static void main(String[] args) {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */

		Scanner sc = new Scanner(System.in);
		double heighter = 0, lower = 0;
		double sum = 0;
		int j = 0;
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Register[] register = new Register[n];

		for (int i = 0; i < register.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char gender = sc.next().charAt(0);
			register[i] = new Register(height, gender);
			if (register[i].getGender() == 'F') {
				sum += register[i].getHeight();
				j++;
			}
			if (register[i].getHeight() > heighter) {
				heighter = register[i].getHeight();
			}
		}

		lower = heighter;

		for (int i = 0; i < register.length; i++) {
			if (register[i].getHeight() < lower) {
				lower = register[i].getHeight();
			}
		}

		System.out.printf("Menor altura = %.2f%n", lower);

		System.out.printf("Maior altura = %.2f%n", heighter);

		System.out.printf("Media das alturas das mulheres altura = %.2f%n", sum / j);

		System.out.printf("Numero de homens = %d", n - j);
		sc.close();
	}

}
