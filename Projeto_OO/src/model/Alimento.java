package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * A classe alimento herda de Produto e serve como tipo especifico de produto.
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 *
 */
public class Alimento extends Produto {

	private SimpleDateFormat sdf;
	private Date dataDeValidade;
	private double peso;

	/**
	 * Construtor da classe
	 * 
	 * @param nome Strinq que representa o nome do Produto 
	 * @param preco double que representa o preco do Produto
	 * @param qtd int que representa a quantidade do Produto
	 * @param cod int que representa o codigo do Produto
	 * @param marca String que representa a marca do Produto
	 * @param data Date que representa a data de validade do Alimento
	 * @param peso double que representa o peso do Alimento
	 * 
	 * @see Produto 
	 */
	public Alimento(String nome, double preco, int quantidade, int codigo, String marca, Date dataDeValidade,
			double peso) {
		super(nome, preco, quantidade, codigo, marca);
		sdf = new SimpleDateFormat("dd/MM/yyyy");
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

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	@Override
	public String toString() {
		Date dataAgora = new Date();
		
		if(getQtd() == 0) {
			return "Produto Indisponível!";
		} else
			if(dataAgora.after(dataDeValidade)) {
				return "Alimento vencido";
			} else 
				return "Produto Disponível!";
	}
}
