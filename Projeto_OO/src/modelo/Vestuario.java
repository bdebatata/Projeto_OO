package modelo;

public class Vestuario extends Produto{
	private String material;
	private int tamanho;
	
	public Vestuario(String nome, double preco, int qtd, int cod, String marca, String material, int tamanho) {
		super(nome, preco, qtd, cod, marca);
		this.material = material;
		this.tamanho = tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		return "Vestuário: "+getNome()+ ", tecido/material: "+getMaterial()+", tamanho: "+getTamanho()
				+ "\nQuantidade: "+getQtd()+", com um preço de: R$"+getPreco() +"\nTotalizando: R$"+subTotal();
	}
}
