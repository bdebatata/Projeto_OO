package model;

/**
 * Classe que define o comportamento basico de um produto e todos os atributos
 * basicos para ser um produto. A classe e definida como abstrata para que seja
 * possivel somente instanciar as especializacoes de Produto.
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 */
public abstract class Produto {
	// Atributos básicos de todo produto
	private String nome;
	private double preco;
	private int qtd;
	private int cod;
	private String marca;

	/**
	 * Construtor da classe
	 * 
	 * @param nome Strinq que representa o nome do Produto 
	 * @param preco double que representa o preco do Produto
	 * @param qtd int que representa a quantidade do Produto
	 * @param cod int que representa o codigo do Produto
	 * @param marca String que representa a marca do Produto
	 */
	public Produto(String nome, double preco, int qtd, int cod, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.cod = cod;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	//public abstract String toString();
}
