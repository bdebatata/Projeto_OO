package modelo;


public abstract class Produto {
	// Atributos básicos de todo produto
	private String nome;
	private double preco;
	private int qtd;	
	private int cod;
	private String marca;
	
	// Construtor com argumentos 
	public Produto(String nome, double preco, int qtd, int cod, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.cod = cod;
		this.marca = marca;
	}
	
	// Gets e Sets
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
	// Métodos para facilitar update dos atributos;
	public void addQtd(int x) {
		this.qtd += x;
	}
	public void removeQtd(int x) {
		this.qtd -= x;
	}
	public void aumentoPreco(double x) {
		this.preco += x;
	}
	public void diminuiPreco(double x) {
		this.preco -= x;
	}
	public double subTotal() {
		return qtd*preco;
	}
	
	@Override
	public abstract String toString();
	
}
