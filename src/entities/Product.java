package entities;

public class Product {
	private String name;
	private double price;

	/*
	 * Criando um construtor com sobrecarga do anterior, mas agora sem a quantidade
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}

	/* Adicoinando meios de acessar os atributos privados ENCAPSULAMENTO */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
