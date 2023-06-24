package model;
/**
 * A classe informatica herda de Produto e serve como especializacao.
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * 		
 */
public class Informatica extends Produto {
	private double tamanhoDaTela;
	private int armazenamento;
	private String processador;
	/**
	 * Construtor da classe
	 * @param nome Strinq que representa o nome do Produto 
	 * @param preco double que representa o preco do Produto
	 * @param qtd int que representa a quantidade do Produto
	 * @param cod int que representa o codigo do Produto
	 * @param marca String que representa a marca do Produto
	 * @param tamanhoDaTela double que representa o tamanho da tela
	 * @param armazenamento int que representa o armazenamento 
	 * @param processador String que representa o nome do processador
	 * 
	 * @see Produto
	 */
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
	
	
	
}
