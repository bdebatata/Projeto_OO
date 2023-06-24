package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel por armazenar os produtos.
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * @see Produto
 */
public class Estoque {

	private List<Produto> produtos = new ArrayList<>();

	/**
	 * Metodo para retorno da lista onde esta sendo armazenado os Produtos
	 * 
	 * @return Lista de todos os produtos instanciados
	 * @see Produto
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}

	/**
	 * Metodo no qual se insere um produto no estoque
	 * 
	 * @param produto Produto a ser adicionado
	 */
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}

	/**
	 * Metodo no qual se remove um produto do estoque
	 * 
	 * @param produto Produto a ser removido
	 */
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}

	/**
	 * Metodo utilizado para buscar um produto no estoque, no qual se percorre um
	 * bloco forEach comparando o nome ate se encontrar um igual
	 * 
	 * @param nome Nome do produto a ser buscado
	 * @return Produto Produto null caso nao exista no estoque e se existir retorna
	 *         o Produto encontrado
	 *         
	 */
	public Produto busca(String nome) {
		Produto p;
		for (Produto c : produtos) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				p = c;
				return p;
			}
		}
		p = null;
		return p;
	}
}
