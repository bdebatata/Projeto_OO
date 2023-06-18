package unitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import control.ControleDados;
import view.PanelPesquisa;

public class TestePesquisa {
	@Test
	public void TesteBarraNula() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText(null);
		pesq.getPesquisar().doClick();
		assertEquals(null ,pesq.getDados().pesquisa(pesq.getSearchBar().getText()));
	}
	@Test
	public void TesteBarraVazia() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("");
		pesq.getPesquisar().doClick();
		assertEquals(null ,pesq.getDados().pesquisa(pesq.getSearchBar().getText()));
	}
	@Test
	public void TesteProdutoInexistente() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Produto Inexistente");
		pesq.getPesquisar().doClick();
		assertEquals(null ,pesq.getDados().pesquisa(pesq.getSearchBar().getText()));
	}
	@Test
	public void TesteProdutoExistente() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Nitro 5");
		pesq.getPesquisar().doClick();
		assertEquals("Nome: Nitro 5", pesq.getNome().getText() );
	}
	@Test
	public void TesteVisibilidadeInformatica() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Nitro 5");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible() );
		assertEquals(true, pesq.getCod().isVisible() );
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getArmazenamento().isVisible());
		assertEquals(true, pesq.getTamanhoTela().isVisible());
		assertEquals(true, pesq.getProcessador().isVisible());
	}
	@Test
	public void TesteVisibilidadeAlimento() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Snickers");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible() );
		assertEquals(true, pesq.getCod().isVisible() );
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getPeso().isVisible());
		assertEquals(true, pesq.getData().isVisible());
	}
	@Test
	public void TesteVisibilidadeLivro() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Ecce-Homo");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible() );
		assertEquals(true, pesq.getCod().isVisible() );
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getGenero().isVisible());
		assertEquals(true, pesq.getQtdPag().isVisible());
	}
	@Test
	public void TesteVisibilidadeVestuario() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Jaqueta");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible() );
		assertEquals(true, pesq.getCod().isVisible() );
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getTamanho().isVisible());
		assertEquals(true, pesq.getTecido().isVisible());
	}
	@Test
	public void TesteVisibilidadeMaquiagem() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("Linha VF");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible() );
		assertEquals(true, pesq.getCod().isVisible() );
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getPigmentacao().isVisible());
		assertEquals(true, pesq.getDurabilidade().isVisible());
	}
	@Test
	public void TestePesquisaMaiusculo() throws ParseException {
		PanelPesquisa pesq = new PanelPesquisa(new ControleDados());
		pesq.getSearchBar().setText("SNIcKerS");
		pesq.getPesquisar().doClick();
		assertEquals(true, pesq.getNome().isVisible());
		assertEquals(true, pesq.getPreco().isVisible());
		assertEquals(true, pesq.getMarca().isVisible() );
		assertEquals(true, pesq.getCod().isVisible() );
		assertEquals(true, pesq.getQuantidade().isVisible());
		assertEquals(true, pesq.getPeso().isVisible());
		assertEquals(true, pesq.getData().isVisible());
	}
	
}
