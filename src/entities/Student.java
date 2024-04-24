package entities;

public class Student {
	/*
	 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
	 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
	 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
	 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
	 * (seis). EXERCICE 10
	 */

	private String name;
	private double note1;
	private double note2;

	public Student(String name, double note1, double note2) {
		this.name = name;
		this.note1 = note1;
		this.note2 = note2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNote1() {
		return note1;
	}

	public void setNote1(double note1) {
		this.note1 = note1;
	}

	public double getNote2() {
		return note2;
	}

	public void setNote2(double note2) {
		this.note2 = note2;
	}
	
	public double avg(Student student) {
		return (student.getNote1() + student.getNote2()) / 2;
	}

}
