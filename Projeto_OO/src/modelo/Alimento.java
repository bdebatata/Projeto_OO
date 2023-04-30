package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends Produto{
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataDeValidade;
	private double peso;
	
	public Alimento(String nome, double preco, int qtd, int cod, String marca, Date dataDeValidade, double peso) {
		super(nome, preco, qtd, cod, marca);
		this.dataDeValidade = dataDeValidade;
		this.peso = peso;
	}
	
	public Date getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Alimento: "+getNome()+ ", Data de validade: "+sdf.format(getDataDeValidade())+", Peso: "+getPeso()+"g"
				+ "\nQuantidade: "+getQtd()+", com um preço de: R$"+getPreco() +"\nTotalizando: R$"+subTotal();
	}
}
