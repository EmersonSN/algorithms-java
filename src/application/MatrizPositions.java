package application;

import java.util.Scanner;

public class MatrizPositions {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
		 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
		 * abaixo de X, quando houver, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {

					System.out.println("Position " + i + "," + j + ":");

					if (j - 1 >= 0 && j - 1 < mat[i].length) {
						System.out.printf("Left: %d%n", mat[i][j - 1]);
					}
					if (i - 1 >= 0 && i < mat.length) {
						System.out.printf("Up: %d%n", mat[i - 1][j]);
					}
					if (j + 1 >= 0 && j + 1 < mat[i].length) {
						System.out.printf("Right: %d%n", mat[i][j + 1]);
					}
					if (i + 1 >= 0 && i + 1 < mat.length) {
						System.out.printf("Down: %d%n", mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
