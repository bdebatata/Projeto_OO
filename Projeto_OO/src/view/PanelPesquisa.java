package view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.ControleDados;
import model.Alimento;
import model.Informatica;
import model.Livro;
import model.Maquiagem;
import model.Produto;
import model.Vestuario;

/**
 * Classe que herda de JPanel, e utilizada na classe TelaInicial como um JPanel
 * e fica responsavel pela funcionalidade de pesquisa de Produtos
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * 
 * @see Produto
 * @see TelaInicial
 */
public class PanelPesquisa extends JPanel {
	private JLabel pes = new JLabel();
	private ControleDados dados;
	private JPanel searchPanel = new JPanel();
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
	private List<JLabel> atributosBase = new ArrayList<>();

	/**
	 * Construtor da classe, adiciona todos os componentes ao JPanel e implementa a
	 * logica de busca, onde cria uma TextField e um botao de pesquisa.
	 * 
	 * @param dados Dados que serao passado pela TelaInicial
	 */
	public PanelPesquisa(ControleDados dados) {
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
		atributosBase.add(nome);
		atributosBase.add(preco);
		atributosBase.add(quantidade);
		atributosBase.add(marca);
		atributosBase.add(cod);
		atributosBase.add(produto);

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
			atributosOff(atributosBase);
			if (dados.pesquisa(searchBar.getText()) == null) {
				situacao.setVisible(true);
				situacao.setText("Não encontrado!");
			} else if (dados.pesquisa(searchBar.getText()) != null) {
				Produto x = dados.pesquisa(searchBar.getText());
				produto.setVisible(true);
				nome.setText("Nome: " + x.getNome());
				nome.setVisible(true);
				preco.setText("Preço: R$" + x.getPreco());
				preco.setVisible(true);
				quantidade.setText("Quantidade: " + x.getQtd());
				quantidade.setVisible(true);
				marca.setText("Marca: " + x.getMarca());
				marca.setVisible(true);
				cod.setText("Código: " + x.getCod());
				cod.setVisible(true);
				if (x instanceof Alimento) {
					situacao.setText(x.toString());
					produto.setText("Tipo do produto: Alimento");
					Alimento c = (Alimento) x;
					peso.setText("Peso: " + c.getPeso() + "g");
					peso.setVisible(true);
					data.setText("Data de validade: " + c.getSdf().format(c.getDataDeValidade()));
					data.setVisible(true);
				}
				if (x instanceof Informatica) {
					situacao.setText(x.toString());
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
					situacao.setText(x.toString());
					produto.setText("Tipo do produto: Vestuario");
					Vestuario c = (Vestuario) x;
					tecido.setText("Tecido: " + c.getMaterial());
					tecido.setVisible(true);
					tamanho.setText("Tamanho: " + c.getTamanho());
					tamanho.setVisible(true);
				}
				if (x instanceof Maquiagem) {
					situacao.setText(x.toString());
					produto.setText("Tipo do produto: Maquiagem");
					Maquiagem c = (Maquiagem) x;
					durabilidade.setText("Durabilidade: " + c.getDurabilidade());
					durabilidade.setVisible(true);
					pigmentacao.setText("Durabilidade: " + c.getPigmentacao());
					pigmentacao.setVisible(true);
				}
				if (x instanceof Livro) {
					situacao.setText(x.toString());
					produto.setText("Tipo do produto: Livro");
					Livro c = (Livro) x;
					genero.setText("Gênero Literário: " + c.getGenero());
					genero.setVisible(true);
					qtdPag.setText("Quantidade de páginas: " + c.getQtdPag());
					qtdPag.setVisible(true);
				}
			}
		});
		add(searchPanel);
	}

	/**
	 * Metodo que altera para falso a visibilidade de todos os JLabels contidos na
	 * lista
	 * 
	 * @param listJPanel Lista que contem os Labels de dados especificos de todo
	 *                   tipo de Produto
	 */
	public void atributosOff(List<JLabel> listJLabel) {
		for (JLabel f : listJLabel) {
			f.setVisible(false);
		}
	}
	public JTextField getSearchBar() {
		return searchBar;
	}
	public void setSearchBar(JTextField searchBar) {
		this.searchBar = searchBar;
	}
	public JButton getPesquisar() {
		return pesquisar;
	}
	public void setPesquisar(JButton pesquisar) {
		this.pesquisar = pesquisar;
	}
	public ControleDados getDados() {
		return dados;
	}
	public JLabel getNome() {
		return nome;
	}
	public void setNome(JLabel nome) {
		this.nome = nome;
	}
	public JLabel getPreco() {
		return preco;
	}
	public void setPreco(JLabel preco) {
		this.preco = preco;
	}

	public JLabel getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(JLabel quantidade) {
		this.quantidade = quantidade;
	}

	public JLabel getCod() {
		return cod;
	}

	public void setCod(JLabel cod) {
		this.cod = cod;
	}

	public JLabel getMarca() {
		return marca;
	}

	public void setMarca(JLabel marca) {
		this.marca = marca;
	}

	public JLabel getData() {
		return data;
	}

	public void setData(JLabel data) {
		this.data = data;
	}

	public JLabel getPeso() {
		return peso;
	}

	public void setPeso(JLabel peso) {
		this.peso = peso;
	}

	public JLabel getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(JLabel tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public JLabel getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(JLabel armazenamento) {
		this.armazenamento = armazenamento;
	}

	public JLabel getProcessador() {
		return processador;
	}

	public void setProcessador(JLabel processador) {
		this.processador = processador;
	}

	public JLabel getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(JLabel durabilidade) {
		this.durabilidade = durabilidade;
	}

	public JLabel getPigmentacao() {
		return pigmentacao;
	}

	public void setPigmentacao(JLabel pigmentacao) {
		this.pigmentacao = pigmentacao;
	}

	public JLabel getTecido() {
		return tecido;
	}

	public void setTecido(JLabel tecido) {
		this.tecido = tecido;
	}

	public JLabel getTamanho() {
		return tamanho;
	}

	public void setTamanho(JLabel tamanho) {
		this.tamanho = tamanho;
	}

	public JLabel getGenero() {
		return genero;
	}

	public void setGenero(JLabel genero) {
		this.genero = genero;
	}

	public JLabel getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(JLabel qtdPag) {
		this.qtdPag = qtdPag;
	}

}
