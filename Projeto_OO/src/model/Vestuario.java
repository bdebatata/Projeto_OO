package model;
/**
 * Classe que herda de Produto e serve como especializacao
 * 
 * @author Bruno Henrique Duarte 
 * @version 1.0
 *
 */
public class Vestuario extends Produto{
	private String material;
	private int tamanho;
	/**
	 * Construtor da classe 
	  * @param nome Strinq que representa o nome do Produto 
	 * @param preco double que representa o preco do Produto
	 * @param qtd int que representa a quantidade do Produto
	 * @param cod int que representa o codigo do Produto
	 * @param marca String que representa a marca do Produto
	 * @param material String que representa o material do Vestuario
	 * @param tamanho int que representa o tamanho do Vestuario
	 * 
	 * @see Produto
	 */
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
		if(getQtd()==0) {
			return "Produto Indisponível!";
		}
		return "Produto Disponível!";
	}
	
}
