package control;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import enums.GenLiterario;
import enums.QualidadeMaterial;
import model.Alimento;
import model.Estoque;
import model.Informatica;
import model.Livro;
import model.Maquiagem;
import model.Produto;
import model.Vestuario;

public class ControleDados {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Estoque estoque = new Estoque();
	private String pad = "dd/MM/yyyy";
	private DateTimeFormatter format = DateTimeFormatter.ofPattern(pad);
	
	// Dados pré armazenados
	public ControleDados() throws ParseException {
		estoque.addProduto(new Alimento("Snickers", 4.99, 400, 1010, "Mars, Incorporated", sdf.parse("24/02/2024"), 90));
		estoque.addProduto(new Informatica("Nitro 5",4999.99, 150, 101001, "Acer", 17, 512, "i7-11800H"));
		estoque.addProduto(new Maquiagem("Linha VF", 367.5, 100,100100, "WePink", QualidadeMaterial.valueOf("Alta"),QualidadeMaterial.valueOf("Alta") ));
		estoque.addProduto(new Vestuario("Jaqueta", 2500, 15,10100100, "Gucci", "Couro", 46));
		estoque.addProduto(new Livro("Ecce-Homo", 25, 50,010100, "L&PM Pocket", GenLiterario.valueOf("Filosofia"), 113 ));
	}
	public void cadAlimento(String nome, double preco, int qtd, int cod, String marca, Date data, double peso )  {
		estoque.addProduto(new Alimento(nome, preco, qtd, cod, marca, data, peso));
	}
	public void cadInformatica(String nome, double preco, int qtd, int cod, String marca, double tamanhoDaTela,
			int armazenamento, String processador)  {
		estoque.addProduto(new Informatica(nome, preco, qtd, cod, marca, tamanhoDaTela, armazenamento, processador ));
	}
	public void cadVestuario(String nome, double preco, int qtd, int cod, String marca, String material, int tamanho)  {
		estoque.addProduto(new Vestuario(nome, preco, qtd, cod, marca, material, tamanho));
	}
	public void cadLivro(String nome, double preco, int qtd, int cod, String marca, GenLiterario genero, int qtdPag)  {
		estoque.addProduto(new Livro(nome, preco, qtd, cod, marca, genero, qtdPag));
	}
	public void cadMaquiagem(String nome, double preco, int qtd, int cod, String marca, QualidadeMaterial durabilidade,
			QualidadeMaterial pigmentacao) {
		estoque.addProduto(new Maquiagem(nome, preco, qtd, cod, marca, durabilidade, pigmentacao));
	}
	public void remove(Produto p) {
		estoque.removeProduto(p);
	}
	public Produto pesquisa(String nome) {
		Produto p;
		for(Produto x : estoque.getProdutos()) {
			if(x.getNome().equalsIgnoreCase(nome)) {
				p=x;
				return p;
			}
		}
		p=null;
		return p;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public boolean CheckData(String data) {
		try {
			LocalDate date = LocalDate.parse(data, format);
			return true;
		} catch(DateTimeParseException e){
			return false;
		}
	}
	
}

