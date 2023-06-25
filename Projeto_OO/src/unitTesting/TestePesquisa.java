package unitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import control.ControleDados;
import view.PanelPesquisa;

/**
 * Classe que testa o JPanel reponsavel pela pesquisa de produtos
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * @see PanelPesquisa
 */
public class TestePesquisa {
	/**
	 * Teste de pesquisa com a barra nula
	 * 
	 * @throws ParseException
	 */
	@Test
	public void TesteBarraNula() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText(null);
		pesq.getPesquisar().doClick();
		assertEquals(null, pesq.getDados().pesquisa(pesq.getSearchBar().getText()));
	}

	/**
	 * Teste de pesquisa com a barra de pesquisa vazia
	 * 
	 * @throws ParseException
	 */
	@Test
	public void TesteBarraVazia() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("");
		pesq.getPesquisar().doClick();
		assertEquals(null, pesq.getDados().pesquisa(pesq.getSearchBar().getText()));
	}

	/**
	 * Teste de pesquisa de produto inexistente no estoque
	 * 
	 * @throws ParseException
	 */
	@Test
	public void TesteProdutoInexistente() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto Inexistente");
		pesq.getPesquisar().doClick();
		assertEquals(null, pesq.getDados().pesquisa(pesq.getSearchBar().getText()));
	}

	/**
	 * Teste de pesquisa de produto existente no estoque
	 * 
	 * @throws ParseException
	 */
	@Test
	public void TesteProdutoExistente() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto 1");
		pesq.getPesquisar().doClick();
		assertEquals("Nome: Produto 1", pesq.getNome().getText());
	}

	/**
	 * Teste de visibilidade dos dados que caracterizam a pesquisa de um produto que
	 * pertence ao tipo Informatica
	 * 
	 * @throws ParseException
	 * @see Informatica
	 */
	@Test
	public void TesteVisibilidadeInformatica() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto 2");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible());
		assertEquals(true, pesq.getCod().isVisible());
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getArmazenamento().isVisible());
		assertEquals(true, pesq.getTamanhoTela().isVisible());
		assertEquals(true, pesq.getProcessador().isVisible());
	}

	/**
	 * Teste de visibilidade dos dados que caracterizam a pesquisa de um produto que
	 * pertence ao tipo Alimento
	 * 
	 * @throws ParseException
	 * @see Alimento
	 */
	@Test
	public void TesteVisibilidadeAlimento() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto 1");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible());
		assertEquals(true, pesq.getCod().isVisible());
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getPeso().isVisible());
		assertEquals(true, pesq.getData().isVisible());
	}

	/**
	 * Teste de visibilidade dos dados que caracterizam a pesquisa de um produto que
	 * pertence ao tipo Livro
	 * 
	 * @throws ParseException
	 * @see Livro
	 */
	@Test
	public void TesteVisibilidadeLivro() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto 5");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible());
		assertEquals(true, pesq.getCod().isVisible());
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getGenero().isVisible());
		assertEquals(true, pesq.getQtdPag().isVisible());
	}

	/**
	 * Teste de visibilidade dos dados que caracterizam a pesquisa de um produto que
	 * pertence ao tipo Vestuario
	 * 
	 * @throws ParseException
	 * @see Vestuario
	 */
	@Test
	public void TesteVisibilidadeVestuario() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto 4");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible());
		assertEquals(true, pesq.getCod().isVisible());
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getTamanho().isVisible());
		assertEquals(true, pesq.getTecido().isVisible());
	}

	/**
	 * Teste de visibilidade dos dados que caracterizam a pesquisa de um produto que
	 * pertence ao tipo Maquiagem
	 * 
	 * @throws ParseException
	 * @see Maquiagem
	 */
	@Test
	public void TesteVisibilidadeMaquiagem() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto 3");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible());
		assertEquals(true, pesq.getCod().isVisible());
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getPigmentacao().isVisible());
		assertEquals(true, pesq.getDurabilidade().isVisible());
	}

	/**
	 * Teste de pesquisa onde a pesquisa foi feita toda em maiusculo
	 * 
	 * @throws ParseException
	 */
	@Test
	public void TestePesquisaMaiusculo() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("pRODutO 1");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible());
		assertEquals(true, pesq.getCod().isVisible());
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getPeso().isVisible());
		assertEquals(true, pesq.getData().isVisible());
	}

}
