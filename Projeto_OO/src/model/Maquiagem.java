package model;

import enums.QualidadeMaterial;

public class Maquiagem extends Produto {
	private QualidadeMaterial durabilidade;
	private QualidadeMaterial pigmentacao;
	
	
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
		return "Maquiagem: "+getNome()+ ", Qualidade de pigmentação: "+getPigmentacao()+", durabilidade: "+getDurabilidade()
				+ "\nQuantidade: "+getQtd()+", com um preço de: R$"+getPreco() +"\nTotalizando: R$"+subTotal();
	}
}
