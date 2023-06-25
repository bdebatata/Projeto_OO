package model;

import enums.QualidadeMaterial;
/**
 * A classe Maquiagem herda de Produto e serve como especializacao.
 * 
 * @author Bruno Henrique Duarte 
 * @version 1.0
 * 		
 */
public class Maquiagem extends Produto {
	private QualidadeMaterial durabilidade;
	private QualidadeMaterial pigmentacao;
	
	/**
	 * Construtor da classe
	 * @param nome Strinq que representa o nome do Produto 
	 * @param preco double que representa o preco do Produto
	 * @param qtd int que representa a quantidade do Produto
	 * @param cod int que representa o codigo do Produto
	 * @param marca String que representa a marca do Produto
	 * @param durabilidade QualidadeMaterial que representa a qualidade da durabilidade da Maquiagem
	 * @param pigmentacao QualidadeMaterial que representa a qualidade da pigmentacao da Maquiagem
	 * 
	 * @see Produto
	 */
	public Maquiagem(String nome, double preco, int qtd, int cod, String marca, QualidadeMaterial durabilidade,
			QualidadeMaterial pigmentacao) {
		super(nome, preco, qtd, cod, marca);
		this.durabilidade = durabilidade;
		this.pigmentacao = pigmentacao;
	}
	public QualidadeMaterial getDurabilidade() {
		return durabilidade;
	}
	public void setDurabilidade(QualidadeMaterial durabilidade) {
		this.durabilidade = durabilidade;
	}
	public QualidadeMaterial getPigmentacao() {
		return pigmentacao;
	}
	public void setPigmentacao(QualidadeMaterial pigmentacao) {
		this.pigmentacao = pigmentacao;
	}
	@Override
	public String toString() {
		if(getQtd()==0) {
			return "Produto Indisponível!";
		}
		return "Produto Disponível!";
	}
	
}
