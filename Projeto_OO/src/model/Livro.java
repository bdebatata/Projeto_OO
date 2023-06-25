package model;

import enums.GenLiterario;
/**
 * 
 * A classe Livro herda de Produto e serve como especializacao.
 * @author Bruno Henrique Duarte 
 * @version 1.0
 * 		
 *
 */
public class Livro extends Produto{
	private GenLiterario genero;
	private int qtdPag;
	/**
	 * Construtor da classe
	 * @param nome Strinq que representa o nome do Produto 
	 * @param preco double que representa o preco do Produto
	 * @param qtd int que representa a quantidade do Produto
	 * @param cod int que representa o codigo do Produto
	 * @param marca String que representa a marca do Produto
	 * @param genero GenLiterario que representa o genero do Livro
	 * @param qtdPag int que representa a quantidade de paginas do Livro 
	 * 
	 * @see Produto
	 */
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
		if(getQtd()==0) {
			return "Produto Indisponível!";
		}  else
			return "Produto Disponível!";
	}
	
}
