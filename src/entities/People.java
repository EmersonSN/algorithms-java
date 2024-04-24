package entities;

public class People {

	/*
	 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
	 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
	 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
	 * pessoas caso houver. EXERCICE 3
	 */
	private String name;
	private int age;
	private double height;

	public People(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
