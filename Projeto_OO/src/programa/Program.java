package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import enums.GenLiterario;
import enums.QualidadeMaterial;
import modelo.Alimento;
import modelo.Estoque;
import modelo.Informatica;
import modelo.Livro;
import modelo.Maquiagem;
import modelo.Produto;
import modelo.Vestuario;


public class Program {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		// Instanciação do objeto estoque;
		Estoque estoque = new Estoque();
		/* Criação e adição de produtos ao estoque, chamada do construtor de produto e usando-o como
		parâmetro para adição dele à lista do estoque: Create(CRUD 1/4); */
		// Produto Ouro Branco e seus atributos adicionados ao estoque
		estoque.addProduto(new Alimento("Ouro Branco", 5, 100, 11011, "Lacta", sdf.parse("20/02/2024"), 90));
		// Produto Nitro e seus atributos adicionados ao estoque
		estoque.addProduto(new Informatica("Nitro", 3900, 100, 10101,"Acer", 14, 512, "i710600"));
		// Produto Blush e seus atributos adicionados ao estoque
		estoque.addProduto(new Maquiagem("Blush", 5.99, 150, 11111,"Beauty Free",QualidadeMaterial.valueOf("Media"), QualidadeMaterial.valueOf("Alta")));
		// Produto Politica e seus atributos adicionados ao estoque
		estoque.addProduto(new Livro("Politica", 49.90, 300, 10011,"Lafonte", GenLiterario.valueOf("Politica"),100));
		// Produto Calça e seus atributos adicionados ao estoque
		estoque.addProduto(new Vestuario("Calça", 60, 50, 10110, "Gucci" , "Jeans", 44));
		// Listagem dos produtos até então cadastrados;
		System.out.println("Produtos Cadastrados:");
		estoque.listagem();
		/* Alteração de dados de um produto
		usando os métodos 'sets' dado que os atributos de classe são PRIVADOS*/
		/* Alterando os seguintes atributos dos produtos:
		 * Nitro: Adição de 50 modelos ao estoque;
		 * Blush: Redução de 100 modelos do estoque;
		 * Politica: Redução do preço em 14.90;
		 * Calça: Alteração do material utilizado ; 
		 */
		for(Produto pc : estoque.getProdutos()) {
			if(pc.getNome().equals("Snickers")) {
				pc.aumentoPreco(3);
			}
			if(pc.getNome().equals("Nitro")) {
				pc.addQtd(50);
			}
			if(pc.getNome().equals("Blush")) {
				pc.removeQtd(100);
			}
			if(pc.getNome().equals("Politica")) {
				pc.diminuiPreco(14.90);
			}
			if(pc.getNome().equals("Calça")) {
				Vestuario vest = (Vestuario)	 pc;
				vest.setMaterial("Moletom");
			}
		}
		System.out.println("\n\n\n\n\nDados Atualizados:");
		estoque.listagem();
		/*Busca de um produto no estoque dado seu nome;
		 * Procurando no estoque o produto Ouro Branco
		 */
		System.out.println("\n\n\n\n\n\n\n\n\n");
		estoque.busca("Ouro Branco");
		System.out.println("\n\n\n\n\n\n\n\n\n");
		/* Deleção de produtos do estoque;
		 * Exclusão de todos os produtos no estoque;
		 * Dada tal situação o código mostra que não há produtos cadastrados no estoque;
		 * */
		for(Produto prod : estoque.getProdutos() ) {
				if("Nitro".equals(prod.getNome())) {
					estoque.removeProduto(prod);
					break;
			}
		}
		for(Produto prod : estoque.getProdutos() ) {
			if("Politica".equals(prod.getNome())) {
				estoque.removeProduto(prod);
				break;
			}
		}
		for(Produto prod : estoque.getProdutos()) {
			if("Ouro Branco".equals(prod.getNome())) {
				estoque.removeProduto(prod);
				break;
			}
		}
		for(Produto prod : estoque.getProdutos()) {
			if("Ouro Branco".equals(prod.getNome())) {
				estoque.removeProduto(prod);
				break;
			}
		}
		for(Produto prod : estoque.getProdutos()) {
			if("Blush".equals(prod.getNome())) {
				estoque.removeProduto(prod);
				break;
			}
		}
		for(Produto prod : estoque.getProdutos()) {
			if("Calça".equals(prod.getNome())) {
				estoque.removeProduto(prod);
				break;
			}
		}
		System.out.println("\n\n\n\n\nDados Atualizados:");
		estoque.listagem();
		sc.close();
	}
}

