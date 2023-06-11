package model;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	private List<Produto> produtos = new ArrayList<>();
	public List<Produto> getProdutos() {
		return produtos;
	}
	/* Nesse caso não há o método setProdutos já que não
	 * é pra ser possível mudar a lista que tem os produtos 
	 */
	public void addProduto(Produto x) {
		produtos.add(x);
	}
	public void removeProduto(Produto x) {
		produtos.remove(x);
	}
	public void listagem() {
		if(produtos.isEmpty() == true) {
			System.out.print("Não há produtos cadastrados!");
		}
		for(Produto c : produtos) {
			if(c instanceof Alimento) {
				Alimento alimento = (Alimento) c;
				System.out.println(alimento.toString());
			}
			if(c instanceof Informatica) {
				Informatica informatica = (Informatica) c;
				System.out.println(informatica.toString()); 
			}
			if(c instanceof Livro) {
				Livro livro = (Livro) c;
				System.out.println(livro.toString()); 
			}
			if(c instanceof Maquiagem) {
				Maquiagem maquiagem = (Maquiagem) c;
				System.out.println(maquiagem.toString());;
			}
			if(c instanceof Vestuario) {
				Vestuario vestuario = (Vestuario) c;
				System.out.println(vestuario.toString());;
			}
		}
	}
	
	public void busca(String x) {
		for (Produto c:produtos) {
			if(c.getNome()== x) {
				System.out.println(c.toString());
			}
		}
		
	}
}
