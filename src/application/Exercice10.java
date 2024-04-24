package application;

import java.util.Scanner;

import entities.Student;

public class Exercice10 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		Student[] student = new Student[n];

		for (int i = 0; i < student.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			double note1 = sc.nextDouble();
			double note2 = sc.nextDouble();
			student[i] = new Student(name, note1, note2);
		}

		System.out.println("Alunos aprovados:");

		for (int i = 0; i < student.length; i++) {
			if (student[i].avg(student[i]) >= 6.0) {
				System.out.println(student[i].getName());
			}
		}

		sc.close();
	}

}
