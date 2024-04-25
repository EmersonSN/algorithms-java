package application;

import java.util.Scanner;

import entities.People;

public class Exercice3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int plusSixteen = 0;

		System.out.print("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		sc.nextLine();
		People[] people = new People[n];

		for (int i = 0; i < people.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa %n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			people[i] = new People(name, age, height);
			sum += people[i].getHeight();
			if(people[i].getAge() < 16) {
				plusSixteen ++;
			}
		}

		double avg = (double)plusSixteen * 100.0 / n;
		
		System.out.printf("Altura média: %.2f%n", sum / n);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%n", avg );

		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}

		sc.close();
	}

}
