package entities;

public class Register {
	/*
	 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
	 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
	 * média de altura das mulheres, e o número de homens.
	 * EXERCICE 11
	 */

	private double height;
	private char gender;

	public Register(double height, char gender) {
		this.height = height;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
