package model;

public class Informatica extends Produto {
	private double tamanhoDaTela;
	private int armazenamento;
	private String processador;
	
	public Informatica(String nome, double preco, int qtd, int cod, String marca, double tamanhoDaTela,
			int armazenamento, String processador) {
		super(nome, preco, qtd, cod, marca);
		this.tamanhoDaTela = tamanhoDaTela;
		this.armazenamento = armazenamento;
		this.processador = processador;
	}
	public double getTamanhoDaTela() {
		return tamanhoDaTela;
	}
	public void setTamanhoDaTela(double tamanhoDaTela) {
		this.tamanhoDaTela = tamanhoDaTela;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	@Override
	public String toString() {
		return "Informática: "+getNome()+ ", Processador: "+getProcessador()+", Tamanho da tela: "+getTamanhoDaTela()+" polegadas"
				+ "\nQuantidade: "+getQtd()+", com um preço de: R$"+getPreco() +"\nTotalizando: R$"+subTotal();
	}
	
	
}
