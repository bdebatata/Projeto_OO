package unitTesting;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.ControleDados;
import enums.GenLiterario;
import enums.QualidadeMaterial;
import model.Alimento;
import model.Informatica;
import model.Livro;
import model.Maquiagem;
import model.Produto;
import model.Vestuario;
import view.PanelUpdate;

/**
 * Classe responsavel pelos testes do panel de update dos dados
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * @see PanelUpdate
 */
public class TesteUpdate {
	/**
	 * Acao a ser realizada antes de todos os testes, no qual coloca como padrao o
	 * ponto para floating-point
	 */
	@BeforeEach
	public void setupLocale() {
		Locale.setDefault(Locale.US);
	}

	/**
	 * Teste de update Basico, no qual se altera todos os atributos basicos, e
	 * verificado se os dados antigos e os novos sao diferentes e dessa forma se
	 * sabe se os dados sofreram update
	 * 
	 * @throws ParseException
	 */
	@Test
	public void updateBasico() throws ParseException {
		PanelUpdate upPanel = new PanelUpdate(new ControleDados());
		upPanel.passagemDados(upPanel.getDados());
		upPanel.getLista().setSelectedIndex(0);

		Produto c = null;
		for (Produto x : upPanel.getDados().getEstoque().getProdutos()) {
			if (upPanel.getLista().getSelectedValue() == x.getNome()) {
				c = x;
			}
		}
		Double precoAntigo = c.getPreco();
		String marcaAntigo = c.getMarca();
		int qtdAntiga = c.getQtd();
		int codAntigo = c.getCod();
		upPanel.getUppreco().setText("300");
		upPanel.getUpmarca().setText("Marca Nova");
		upPanel.getUpquantidade().setText("150");
		int codAleatorio = upPanel.getDados().geraCodAleatorio();

		for (int i = 0; i < 5; i++) {
			if (codAleatorio == codAntigo) {
				codAleatorio = upPanel.getDados().geraCodAleatorio();
			} else if (codAleatorio != codAntigo) {
				upPanel.getUpcod().setText(String.valueOf(codAleatorio));
			}
		}
		upPanel.getUpdate().doClick();
		assertEquals(true, precoAntigo != Double.parseDouble(upPanel.getUppreco().getText()));
		assertEquals(true, marcaAntigo != upPanel.getUpmarca().getText());
		assertEquals(true, qtdAntiga != Integer.parseInt(upPanel.getUpquantidade().getText()));
		assertEquals(true, codAntigo != Integer.parseInt(upPanel.getUpcod().getText()));
		assertEquals(true, precoAntigo != c.getPreco());
		assertEquals(true, marcaAntigo != c.getMarca());
		assertEquals(true, qtdAntiga != c.getQtd());
		assertEquals(true, codAntigo != c.getCod());
	}

	/**
	 * Teste de update de um alimento, se alterando seus atributos especificos e
	 * verificando se eles sao diferentes dos dados antigos
	 * 
	 * @throws ParseException
	 */
	@Test
	public void updateAlimento() throws ParseException {
		PanelUpdate upPanel = new PanelUpdate(new ControleDados());
		upPanel.passagemDados(upPanel.getDados());
		upPanel.getLista().setSelectedIndex(0);

		Alimento c = null;
		for (Produto x : upPanel.getDados().getEstoque().getProdutos()) {
			if (upPanel.getLista().getSelectedValue() == x.getNome()) {
				c = (Alimento) x;
			}
		}
		double pesoAntigo = c.getPeso();
		Date dataAntiga = c.getDataDeValidade();
		upPanel.getUppeso().setText("1001");
		upPanel.getUpdata().setText("20/02/2041");
		upPanel.getUpdate().doClick();
		assertEquals(true, pesoAntigo != Double.parseDouble(upPanel.getUppeso().getText()));
		assertEquals(true, dataAntiga != c.getSdf().parse(upPanel.getUpdata().getText()));
		assertEquals(true, pesoAntigo != c.getPeso());
		assertEquals(true, dataAntiga != c.getDataDeValidade());
	}

	/**
	 * Teste de update de um Produto de informatica, se alterando seus atributos
	 * especificos e verificando se eles sao diferentes dos dados antigos
	 * 
	 * @throws ParseException
	 */
	@Test
	public void updateInformatica() throws ParseException {
		PanelUpdate upPanel = new PanelUpdate(new ControleDados());
		upPanel.passagemDados(upPanel.getDados());
		upPanel.getLista().setSelectedIndex(1);

		Informatica c = null;
		for (Produto x : upPanel.getDados().getEstoque().getProdutos()) {
			if (upPanel.getLista().getSelectedValue() == x.getNome()) {
				c = (Informatica) x;
			}
		}
		double tamanhoAntigo = c.getTamanhoDaTela();
		String processadorAntigo = c.getProcessador();
		int armazenamentoAntigo = c.getArmazenamento();
		upPanel.getUptamanhoTela().setText("21");
		upPanel.getUparmazenamento().setText("1001");
		upPanel.getUpprocessador().setText("Processador Novo");
		upPanel.getUpdate().doClick();

		assertEquals(true, armazenamentoAntigo != Integer.parseInt(upPanel.getUparmazenamento().getText()));
		assertEquals(true, processadorAntigo != upPanel.getUpprocessador().getText());
		assertEquals(true, tamanhoAntigo != Double.parseDouble(upPanel.getUptamanhoTela().getText()));
		assertEquals(true, tamanhoAntigo != c.getTamanhoDaTela());
		assertEquals(true, processadorAntigo != c.getProcessador());
		assertEquals(true, armazenamentoAntigo != c.getArmazenamento());

	}
	/**
	 * Teste de update de uma Maquiagem, se alterando seus atributos
	 * especificos e verificando se eles sao diferentes dos dados antigos
	 * 
	 * @throws ParseException
	 */
	@Test
	public void updateMaquiagem() throws ParseException {
		PanelUpdate upPanel = new PanelUpdate(new ControleDados());
		upPanel.passagemDados(upPanel.getDados());
		upPanel.getLista().setSelectedIndex(2);
		Maquiagem c = null;
		QualidadeMaterial pigAntiga = null;
		QualidadeMaterial durAntiga = null;
		for (Produto x : upPanel.getDados().getEstoque().getProdutos()) {
			if (upPanel.getLista().getSelectedValue() == x.getNome()) {
				c = (Maquiagem) x;
				if (c.getPigmentacao() == QualidadeMaterial.valueOf("Baixa")) {
					upPanel.getUppigmentacao().setText("Media");
					pigAntiga = QualidadeMaterial.valueOf("Baixa");
				} else if (c.getPigmentacao() == QualidadeMaterial.valueOf("Media")) {
					upPanel.getUppigmentacao().setText("Alta");
					pigAntiga = QualidadeMaterial.valueOf("Media");
				} else if (c.getPigmentacao() == QualidadeMaterial.valueOf("Alta")) {
					upPanel.getUppigmentacao().setText("Baixa");
					pigAntiga = QualidadeMaterial.valueOf("Alta");
				}
				if (c.getDurabilidade() == QualidadeMaterial.valueOf("Baixa")) {
					upPanel.getUpdurabilidade().setText("Media");
					durAntiga = QualidadeMaterial.valueOf("Baixa");
				} else if (c.getDurabilidade() == QualidadeMaterial.valueOf("Media")) {
					upPanel.getUpdurabilidade().setText("Alta");
					durAntiga = QualidadeMaterial.valueOf("Media");
				} else if (c.getDurabilidade() == QualidadeMaterial.valueOf("Alta")) {
					upPanel.getUpdurabilidade().setText("Baixa");
					durAntiga = QualidadeMaterial.valueOf("Alta");
				}
			}
		}

		upPanel.getUpdate().doClick();
		assertEquals(true, durAntiga != QualidadeMaterial.valueOf(upPanel.getUpdurabilidade().getText()));
		assertEquals(true, pigAntiga != QualidadeMaterial.valueOf(upPanel.getUppigmentacao().getText()));
		assertEquals(true, durAntiga != c.getDurabilidade());
		assertEquals(true, pigAntiga != c.getPigmentacao());

	}
	/**
	 * Teste de update de um Produto de vestuario, se alterando seus atributos
	 * especificos e verificando se eles sao diferentes dos dados antigos
	 * 
	 * @throws ParseException
	 */
	@Test
	public void updateVestuario() throws ParseException {
		PanelUpdate upPanel = new PanelUpdate(new ControleDados());
		upPanel.passagemDados(upPanel.getDados());
		upPanel.getLista().setSelectedIndex(3);

		Vestuario c = null;
		for (Produto x : upPanel.getDados().getEstoque().getProdutos()) {
			if (upPanel.getLista().getSelectedValue() == x.getNome()) {
				c = (Vestuario) x;
			}
		}
		String materialAntigo = c.getMaterial();
		int tamanhoAntigo = c.getTamanho();
		upPanel.getUptecido().setText("Material Novo");
		upPanel.getUptamanho().setText("52");
		upPanel.getUpdate().doClick();
		assertEquals(true, materialAntigo != upPanel.getUptecido().getText());
		assertEquals(true, tamanhoAntigo != Integer.parseInt(upPanel.getUptamanho().getText()));
		assertEquals(true, materialAntigo != c.getMaterial());
		assertEquals(true, tamanhoAntigo != c.getTamanho());

	}
	/**
	 * Teste de update de um Livro, se alterando seus atributos
	 * especificos e verificando se eles sao diferentes dos dados antigos
	 * 
	 * @throws ParseException
	 */
	@Test
	public void updateLivro() throws ParseException {
		PanelUpdate upPanel = new PanelUpdate(new ControleDados());
		upPanel.passagemDados(upPanel.getDados());
		upPanel.getLista().setSelectedIndex(4);

		Livro c = null;
		for (Produto x : upPanel.getDados().getEstoque().getProdutos()) {
			if (upPanel.getLista().getSelectedValue() == x.getNome()) {
				c = (Livro) x;
			}
		}
		GenLiterario genAleatorio = upPanel.getDados().generoAleatorio();
		GenLiterario genAntigo = c.getGenero();
		int qtdPagAntigo = c.getQtdPag();
		for (int i = 0; i < 5; i++) {

			if (genAleatorio == genAntigo) {
				genAleatorio = upPanel.getDados().generoAleatorio();
			} else if (genAleatorio != genAntigo) {

				upPanel.getUpgenero().setText(String.valueOf(genAleatorio));
			}

		}
		upPanel.getUpqtdPag().setText("1501");
		upPanel.getUpdate().doClick();
		assertEquals(true, genAntigo != GenLiterario.valueOf(upPanel.getUpgenero().getText()));
		assertEquals(true, qtdPagAntigo != Integer.parseInt(upPanel.getUpqtdPag().getText()));
		assertEquals(true, genAntigo != c.getGenero());
		assertEquals(true, qtdPagAntigo != c.getQtdPag());
	}
	/**
	 * Teste de update dos dados basicos vazios
	 * @throws ParseException
	 */
	@Test
	public void updateDadosVazios() throws ParseException {
		PanelUpdate upPanel = new PanelUpdate(new ControleDados());
		upPanel.passagemDados(upPanel.getDados());
		upPanel.getLista().setSelectedIndex(0);

		Produto c = null;
		for (Produto x : upPanel.getDados().getEstoque().getProdutos()) {
			if (upPanel.getLista().getSelectedValue() == x.getNome()) {
				c = x;
			}
		}
		Double precoAntigo = c.getPreco();
		String marcaAntigo = c.getMarca();
		int qtdAntiga = c.getQtd();
		int codAntigo = c.getCod();
		upPanel.getUppreco().setText("300");
		upPanel.getUpmarca().setText("");
		upPanel.getUpquantidade().setText("");
		upPanel.getUpcod().setText("");

		upPanel.getUpdate().doClick();
		assertEquals(true, precoAntigo == c.getPreco());
		assertEquals(true, marcaAntigo == c.getMarca());
		assertEquals(true, qtdAntiga == c.getQtd());
		assertEquals(true, codAntigo == c.getCod());
	}

}
