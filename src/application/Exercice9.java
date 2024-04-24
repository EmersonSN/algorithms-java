package application;

import java.util.Scanner;

import entities.People;

public class Exercice9 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
		 */

		Scanner sc = new Scanner(System.in);
		int old = 0;
		String oldName = "";

		System.out.print("Quantas pessoas você vai cadastrar? ");
		int n = sc.nextInt();
		People[] people = new People[n];

		for (int i = 0; i < people.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			people[i] = new People(name, age);
			if (people[i].getAge() > old) {
				old = people[i].getAge();
				oldName = people[i].getName();
			}
		}
		
		System.out.print("A pessoa mais velha: " + oldName);

		sc.close();
	}

}
