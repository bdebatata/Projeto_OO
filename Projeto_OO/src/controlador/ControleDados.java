package controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.Alimento;
import modelo.Estoque;

public class ControleDados {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Estoque estoque = new Estoque();
	// Dados pré armazenados
	public ControleDados() throws ParseException {
		estoque.addProduto(new Alimento("Snickers", 4.99, 400,0100010010, "Mars, Incorporated", sdf.parse("24/02/2024"), 90));
	}
	public void cadAlimento(String nome, double preco, int qtd, int cod, String marca, Date data, double peso )  {
		estoque.addProduto(new Alimento(nome, preco, qtd, cod, marca, data, peso));
		System.out.println("CADASTRADO");
	}

	public Estoque getEstoque() {
		return estoque;
	}
	
	
}

