package visao;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControleDados;
import modelo.Alimento;
import modelo.Informatica;
import modelo.Livro;
import modelo.Maquiagem;
import modelo.Produto;
import modelo.Vestuario;

public class PanelPesquisa extends JPanel {
	private JLabel pes = new JLabel();
	private ControleDados dados;
	private JPanel searchPanel = new JPanel();
	private String busca;
	// Labels
	private JLabel produto;
	private JLabel nome;
	private JLabel preco;
	private JLabel quantidade;
	private JLabel cod;
	private JLabel marca;
	private JLabel data;
	private JLabel peso;
	private JLabel tamanhoTela;
	private JLabel armazenamento;
	private JLabel processador;
	private JLabel durabilidade;
	private JLabel pigmentacao;
	private JLabel tecido;
	private JLabel tamanho;
	private JLabel genero;
	private JLabel qtdPag;
	private JTextField searchBar = new JTextField();
	private JButton pesquisar = new JButton();
	private JLabel situacao = new JLabel();
	private List<JLabel> atributos = new ArrayList<>();

	PanelPesquisa(ControleDados dados) {
		this.dados = dados;
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(null);

		pes.setText("Pesquisa de Produtos");
		pes.setBounds(400, 30, 1000, 30);
		pes.setFont(new Font("Impact", Font.BOLD, 30));
		pes.setHorizontalTextPosition(JLabel.RIGHT);
		searchPanel.setBackground(new Color(222, 184, 135));
		searchPanel.setBounds(420, 20, 1055, 783);
		searchPanel.setLayout(null);
		searchPanel.add(pes);
		/*
		 * SearchBar e seu botão
		 */
		searchBar.setBounds(30, 70, 970, 30);
		searchPanel.add(searchBar);
		pesquisar.setBounds(1000, 70, 30, 30);
		searchBar.setFont(new Font("Impact", Font.BOLD, 20));
		searchPanel.add(pesquisar);

		/*
		 * Labels para display dos dados
		 */

		situacao = new JLabel();
		situacao.setBounds(80, 120, 1000, 40);
		situacao.setFont(new Font("Impact", Font.PLAIN, 30));
		searchPanel.add(situacao);

		produto = new JLabel();
		produto.setBounds(80, 160, 1000, 40);
		produto.setFont(new Font("Impact", Font.PLAIN, 30));
		searchPanel.add(produto);

		// Dados caracteristicos de todos os produtos
		nome = new JLabel();
		nome.setFont(new Font("Impact", Font.BOLD, 30));
		nome.setBounds(80, 200, 1000, 40);
		searchPanel.add(nome);

		preco = new JLabel();
		preco.setFont(new Font("Impact", Font.BOLD, 30));
		preco.setBounds(80, 240, 1000, 40);
		searchPanel.add(preco);

		quantidade = new JLabel();
		quantidade.setFont(new Font("Impact", Font.BOLD, 30));
		quantidade.setBounds(80, 280, 1000, 40);
		searchPanel.add(quantidade);

		cod = new JLabel();
		cod.setFont(new Font("Impact", Font.BOLD, 30));
		cod.setBounds(80, 320, 1000, 40);
		searchPanel.add(cod);

		marca = new JLabel();
		marca.setFont(new Font("Impact", Font.BOLD, 30));
		marca.setBounds(80, 360, 1000, 40);
		searchPanel.add(marca);

		// Labels especificas de cada tipo de produto
		// Alimento
		data = new JLabel();
		data.setFont(new Font("Impact", Font.BOLD, 30));
		data.setBounds(80, 400, 1000, 40);
		searchPanel.add(data);

		peso = new JLabel();
		peso.setFont(new Font("Impact", Font.BOLD, 30));
		peso.setBounds(80, 440, 1000, 40);
		searchPanel.add(peso);

		// Informatica
		tamanhoTela = new JLabel();
		tamanhoTela.setFont(new Font("Impact", Font.BOLD, 30));
		tamanhoTela.setBounds(80, 400, 1000, 40);
		searchPanel.add(tamanhoTela);

		armazenamento = new JLabel();
		armazenamento.setFont(new Font("Impact", Font.BOLD, 30));
		armazenamento.setBounds(80, 440, 1000, 40);
		searchPanel.add(armazenamento);

		processador = new JLabel();
		processador.setFont(new Font("Impact", Font.BOLD, 30));
		processador.setBounds(80, 480, 1000, 40);
		searchPanel.add(processador);

		// Maquiagem
		durabilidade = new JLabel();
		durabilidade.setFont(new Font("Impact", Font.BOLD, 30));
		durabilidade.setBounds(80, 400, 1000, 40);
		searchPanel.add(durabilidade);

		pigmentacao = new JLabel();
		pigmentacao.setFont(new Font("Impact", Font.BOLD, 30));
		pigmentacao.setBounds(80, 440, 1000, 40);
		searchPanel.add(pigmentacao);

		// Vestuário
		tecido = new JLabel();
		tecido.setFont(new Font("Impact", Font.BOLD, 30));
		tecido.setBounds(80, 400, 1000, 40);
		searchPanel.add(tecido);

		tamanho = new JLabel();
		tamanho.setFont(new Font("Impact", Font.BOLD, 30));
		tamanho.setBounds(80, 440, 1000, 40);
		searchPanel.add(tamanho);

		// Livro
		genero = new JLabel();
		genero.setFont(new Font("Impact", Font.BOLD, 30));
		genero.setBounds(80, 400, 1000, 40);
		searchPanel.add(genero);

		qtdPag = new JLabel();
		qtdPag.setFont(new Font("Impact", Font.BOLD, 30));
		qtdPag.setBounds(80, 440, 500, 50);
		searchPanel.add(qtdPag);
		/*
		 * Adição dos atributos em uma lista para que possa ser melhor controlada a
		 * visibilidade
		 */
		// Atributos de Alimento
		atributos.add(data);
		atributos.add(peso);
		// Atributos de Informatica
		atributos.add(tamanhoTela);
		atributos.add(processador);
		atributos.add(armazenamento);
		// Atributos de Maquiagem
		atributos.add(pigmentacao);
		atributos.add(durabilidade);
		// Atributs de Vestuário
		atributos.add(tecido);
		atributos.add(tamanho);
		// Atributos de Livro
		atributos.add(genero);
		atributos.add(qtdPag);

		/*
		 * Pesquisa feita pelo controlador
		 */
		pesquisar.addActionListener(e -> {
			atributosOff(atributos);
			if (dados.pesquisa(searchBar.getText()) != null) {
				situacao.setVisible(false);
				Produto x = dados.pesquisa(searchBar.getText());
				nome.setText("Nome: " + x.getNome());
				preco.setText("Preço: R$" + x.getPreco());
				quantidade.setText("Quantidade: " + x.getQtd());
				marca.setText("Marca: " + x.getMarca());
				cod.setText("Código: " + x.getCod());
				if (x instanceof Alimento) {
					produto.setText("Tipo do produto: Alimento");
					Alimento c = (Alimento) x;
					peso.setText("Peso: " + c.getPeso() + "g");
					peso.setVisible(true);
					data.setText("Data de validade: " + c.getSdf().format(c.getDataDeValidade()));
					data.setVisible(true);
				}
				if (x instanceof Informatica) {

					produto.setText("Tipo do produto: Informatica");
					Informatica c = (Informatica) x;
					processador.setText("Processador: " + c.getProcessador());
					processador.setVisible(true);
					tamanhoTela.setText("Tamanho da tela: " + c.getTamanhoDaTela() + " polegadas");
					tamanhoTela.setVisible(true);
					armazenamento.setText("Armazenamento: " + c.getArmazenamento() + "GB");
					armazenamento.setVisible(true);
				}
				if (x instanceof Vestuario) {
					produto.setText("Tipo do produto: Vestuario");
					Vestuario c = (Vestuario) x;
					tecido.setText("Tecido: " + c.getMaterial());
					tecido.setVisible(true);
					tamanho.setText("Tamanho: " + c.getTamanho());
					tamanho.setVisible(true);
				}
				if (x instanceof Maquiagem) {

					produto.setText("Tipo do produto: Maquiagem");
					Maquiagem c = (Maquiagem) x;
					durabilidade.setText("Durabilidade: " + c.getDurabilidade());
					durabilidade.setVisible(true);
					pigmentacao.setText("Durabilidade: " + c.getPigmentacao());
					pigmentacao.setVisible(true);
				}
				if (x instanceof Livro) {

					produto.setText("Tipo do produto: Livro");
					Livro c = (Livro) x;
					genero.setText("Gênero Literário: " + c.getGenero());
					genero.setVisible(true);
					qtdPag.setText("Quantidade de páginas: " + c.getQtdPag());
					qtdPag.setVisible(true);
				}
			} else 
				situacao.setText("Não encontrado!");
		});

		add(searchPanel);
	}

	public void atributosOff(List<JLabel> x) {
		for (JLabel f : x) {
			f.setVisible(false);
		}
	}

	public boolean existeNoEstoque(List<Produto> x, String busca) {
		for (Produto c : x) {
			if (c.getNome().equalsIgnoreCase(busca)) {
				return true;
			}
		}
		return false;
	}

}
