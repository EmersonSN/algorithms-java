package application;

import java.util.Scanner;

import entities.Product;

public class ProductInitilizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;

		int n = sc.nextInt();
		Product[] produto = new Product[n];

		for (int i = 0; i < produto.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			produto[i] = new Product(name, price);
			soma += produto[i].getPrice();
		}
		System.out.printf("%.2f%n", soma / n);

		sc.close();
	}

}
