package unitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import javax.swing.JPanel;

import org.junit.jupiter.api.Test;

import control.ControleDados;
import view.PanelCadastro;

public class TestesCadastro {
	// Testes de cadastros válidos
	@Test
	public void cadastroLivro() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getLivro().doClick();
		cadPanel.getNome().setText("The Hitchhiker's Guide to the Galaxy");
		cadPanel.getPreco().setText("76.90");
		cadPanel.getQuantidade().setValue(100);
		cadPanel.getCod().setText("111");
		cadPanel.getMarca().setText("Arqueiro");
		cadPanel.getQtdPag().setText("208");
		cadPanel.getGen().setSelectedIndex(2);
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(6, cadPanel.getDados().getEstoque().getProdutos().size());
	}

	@Test
	public void cadastroAlimento() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getAlimento().doClick();
		cadPanel.getNome().setText("Pasta de Amendoim");
		cadPanel.getPreco().setText("43.48");
		cadPanel.getQuantidade().setValue(300);
		cadPanel.getCod().setText("1101001");
		cadPanel.getMarca().setText("Dr Peanut");
		cadPanel.getPeso().setText("600");
		cadPanel.getData().setText("17/05/2025");
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(6, cadPanel.getDados().getEstoque().getProdutos().size());
	}

	@Test
	public void cadastroVestuario() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getVestuario().doClick();
		cadPanel.getNome().setText("Calça");
		cadPanel.getPreco().setText("249.90");
		cadPanel.getQuantidade().setValue(100);
		cadPanel.getCod().setText("11010");
		cadPanel.getMarca().setText("Nike");
		cadPanel.getTaman().setText("46");
		cadPanel.getTec().setText("Moletom");
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(6, cadPanel.getDados().getEstoque().getProdutos().size());
	}

	@Test
	public void cadastroMaquiagem() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getMaquiagem().doClick();
		cadPanel.getNome().setText("Palette Eudora Glam Prisma");
		cadPanel.getPreco().setText("199.99");
		cadPanel.getQuantidade().setValue(200);
		cadPanel.getCod().setText("1111101");
		cadPanel.getMarca().setText("Glam");
		cadPanel.getDur().setSelectedIndex(2);
		cadPanel.getQual().setSelectedIndex(2);
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(6, cadPanel.getDados().getEstoque().getProdutos().size());
	}

	@Test
	public void cadastroInformatica() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getInformatica().doClick();
		cadPanel.getNome().setText("G15");
		cadPanel.getPreco().setText("10350.00");
		cadPanel.getQuantidade().setValue(100);
		cadPanel.getCod().setText("1111111");
		cadPanel.getMarca().setText("Dell");
		cadPanel.getTam().setText("15.6");
		cadPanel.getProc().setText("AMD Ryzen™ 7 6800H");
		cadPanel.getArmaze().setText("512");
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(6, cadPanel.getDados().getEstoque().getProdutos().size());
	}

	// Cadastros Inválidos
	@Test
	public void cadastroProdutoVazio() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getCadastrar().doClick();
		// Como há 5 Produtos inicializados no estoque o tamanho da lista deve ser
		// somente igual a 5
		assertEquals(5, cadPanel.getDados().getEstoque().getProdutos().size());
	}

	@Test
	public void cadastroAlimentoDataInvalida() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getNome().setText("Bombom Ouro Branco");
		cadPanel.getPreco().setText("69.90");
		cadPanel.getQuantidade().setValue(100);
		cadPanel.getCod().setText("11001");
		cadPanel.getMarca().setText("Lacta");
		cadPanel.getPeso().setText("1000");
		cadPanel.getData().setText("100/51/2025");
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(5, cadPanel.getDados().getEstoque().getProdutos().size());

	}

	@Test
	public void cadastroLivroSemSelect() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getLivro().doClick();
		cadPanel.getNome().setText("The Hitchhiker's Guide to the Galaxy");
		cadPanel.getPreco().setText("76.90");
		cadPanel.getQuantidade().setValue(100);
		cadPanel.getCod().setText("111");
		cadPanel.getMarca().setText("Arqueiro");
		cadPanel.getQtdPag().setText("208");
		// Sem a seleção de um genero pra cadastro
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(5, cadPanel.getDados().getEstoque().getProdutos().size());
	}
	@Test
	public void cadastroMaquiagemSemSelect() throws ParseException {
		PanelCadastro cadPanel = new PanelCadastro(new ControleDados());
		cadPanel.getMaquiagem().doClick();
		cadPanel.getNome().setText("Palette Eudora Glam Prisma");
		cadPanel.getPreco().setText("199.99");
		cadPanel.getQuantidade().setValue(200);
		cadPanel.getCod().setText("1111101");
		cadPanel.getMarca().setText("Glam");
		// Sem a seleção dos dados especificos
		
		cadPanel.getCadastrar().doClick();
		// Adição de um produto ao estoque, já que todas as informações são válidas
		assertEquals(5
				, cadPanel.getDados().getEstoque().getProdutos().size());
	}

}
