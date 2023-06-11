package model;

import enums.GenLiterario;

public class Livro extends Produto{
	private GenLiterario genero;
	private int qtdPag;
	
	public Livro(String nome, double preco, int qtd, int cod, String marca, GenLiterario genero, int qtdPag) {
		super(nome, preco, qtd, cod, marca);
		this.genero = genero;
		this.qtdPag = qtdPag;
	}
	public GenLiterario getGenero() {
		return genero;
	}
	public void setGenero(GenLiterario genero) {
		this.genero = genero;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	@Override
	public String toString() {
		return "Livro: "+getNome()+ ", Gênero Literário: "+getGenero()+", Quantidade de páginas: "+getQtdPag()
				+ "\nQuantidade: "+getQtd()+", com um preço de: R$"+getPreco() +"\nTotalizando: R$"+subTotal();
	}
}
