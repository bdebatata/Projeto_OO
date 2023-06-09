package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import control.ControleDados;
import enums.GenLiterario;
import enums.QualidadeMaterial;

/**
 * Classe que herda de JPanel, e utilizada na classe TelaInicial como um JPanel
 * e fica responsavel pela funcionalidade de cadastro de Produtos
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * 
 * @see Produto
 * @see TelaInicial
 */
public class PanelCadastro extends JPanel {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private JLabel cad = new JLabel();
	private JPanel cadPanel = new JPanel();
	private JButton alimento = new JButton("Alimento");
	private JButton vestuario = new JButton("Vestuário");
	private JButton informatica = new JButton("Informática");
	private JButton livro = new JButton("Livro");
	private JButton maquiagem = new JButton("Maquiagem");
	private JButton cadastrar = new JButton("Cadastrar");
	// Atributos básicos (JLabels e JTextFiels)
	private JLabel rotNome = new JLabel("Nome: ");
	private JTextField nome = new JTextField();
	private JLabel rotPreco = new JLabel("Preço: ");
	private JTextField preco = new JTextField();
	private JLabel rotMarca = new JLabel("Marca: ");
	private JTextField marca = new JTextField();
	private JLabel rotCod = new JLabel("Código: ");
	private JTextField cod = new JTextField();
	private JLabel rotQuantidade = new JLabel("Quantidade: ");
	private JSpinner quantidade = new JSpinner();
	private List<JPanel> cads = new ArrayList<>();
	// Atributos de alimento
	private JLabel rotPeso = new JLabel("Peso: ");
	private JTextField peso = new JTextField();
	private JLabel rotData = new JLabel("Data de Validade: ");
	private JTextField data = new JTextField();
	// Atrubutos de vestuario
	private JLabel rotTaman;
	private JTextField taman;
	private JLabel rotTec;
	private JTextField tec;
	// Atributos de Informatica
	private JLabel rotProc;
	private JTextField proc;
	private JLabel rotArma;
	private JTextField armaze;
	private JLabel rotTam;
	private JTextField tam;
	// Atributos de Livro
	private JLabel rotGen;
	private JList<String> gen;
	private JLabel rotPag;
	private JTextField qtdPag;
	// Atributos de Maquiagem
	private JList<String> dur;
	private JList<String> qual;

	private GenLiterario[] generos;
	private QualidadeMaterial[] qualidades;
	// Panels para Cadastro
	private JPanel panelAlimento = new JPanel();
	private JPanel panelVestuario = new JPanel();
	private JPanel panelInformatica = new JPanel();
	private JPanel panelLivro = new JPanel();
	private JPanel panelMaq = new JPanel();

	// Controle de dados
	private ControleDados dados;

	/**
	 * Construtor da classe, adiciona todos os componentes ao JPanel e implementa a
	 * logica de cadastro, que so e permitido quando o usuario seleciona um tipo
	 * especifico de produto, assim alterando as visibilidade do JPanel associado a tal tipo de produto e o botao de cadastro
	 * 
	 * @param dados Dados que serao passados pela TelaInicial
	 * @see TelaInicial
	 */
	public PanelCadastro(ControleDados dados) {
		this.dados = dados;
		cads.add(panelMaq);
		cads.add(panelLivro);
		cads.add(panelInformatica);
		cads.add(panelVestuario);
		cads.add(panelAlimento);
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(new BorderLayout());

		cad.setText("Cadastro");
		cad.setHorizontalAlignment(JLabel.CENTER);
		cad.setVerticalAlignment(JLabel.NORTH);
		cad.setFont(new Font("Impact", Font.BOLD, 50));
		cad.setHorizontalTextPosition(JLabel.RIGHT);

		// Painel para os botões

		cadPanel.setBackground(new Color(255, 222, 173));
		cadPanel.setLayout(null);
		cadPanel.add(alimento);
		cadPanel.add(informatica);
		cadPanel.add(vestuario);
		cadPanel.add(maquiagem);
		cadPanel.add(livro);
		// Alteração das cores dos botões
		alimento.setBackground(new Color(148, 103, 97));
		alimento.setBounds(150, 0, 150, 30);
		alimento.setFont(new Font("Impact", Font.PLAIN, 20));
		informatica.setBackground(new Color(148, 103, 97));
		informatica.setBounds(310, 0, 150, 30);
		informatica.setFont(new Font("Impact", Font.PLAIN, 20));
		vestuario.setBackground(new Color(148, 103, 97));
		vestuario.setBounds(470, 0, 150, 30);
		vestuario.setFont(new Font("Impact", Font.PLAIN, 20));
		maquiagem.setBackground(new Color(148, 103, 97));
		maquiagem.setBounds(630, 0, 150, 30);
		maquiagem.setFont(new Font("Impact", Font.PLAIN, 20));
		livro.setBackground(new Color(148, 103, 97));
		livro.setBounds(790, 0, 150, 30);
		livro.setFont(new Font("Impact", Font.PLAIN, 20));
		// TextFields e seus rótulos

		JPanel infoPanel = new JPanel();
		infoPanel.setBounds(30, 100, 1000, 230);
		infoPanel.setBackground(new Color(255, 222, 173));
		infoPanel.setLayout(null);

		// Criar e configurar o rótulo e o campo de texto
		rotNome.setFont(new Font("Impact", Font.BOLD, 30));
		rotNome.setBounds(150, 0, 150, 50);
		nome.setFont(new Font("Impact", Font.PLAIN, 20));
		nome.setBounds(150, 40, 200, 40);

		rotPreco.setFont(new Font("Impact", Font.BOLD, 30));
		rotPreco.setBounds(400, 0, 150, 50);
		preco.setFont(new Font("Impact", Font.PLAIN, 20));
		preco.setBounds(400, 40, 200, 40);

		rotQuantidade.setFont(new Font("Impact", Font.BOLD, 30));
		rotQuantidade.setBounds(650, 0, 200, 50);
		quantidade.setFont(new Font("Impact", Font.PLAIN, 20));
		quantidade.setBounds(650, 40, 250, 40);

		rotMarca.setFont(new Font("Impact", Font.BOLD, 30));
		rotMarca.setBounds(150, 100, 250, 40);
		marca.setFont(new Font("Impact", Font.PLAIN, 20));
		marca.setBounds(150, 140, 250, 40);

		rotCod.setFont(new Font("Impact", Font.BOLD, 30));
		rotCod.setBounds(420, 100, 250, 40);
		cod.setFont(new Font("Impact", Font.PLAIN, 20));
		cod.setBounds(420, 140, 250, 40);

		// Adicionar o rótulo e o campo de texto ao painel de informações
		infoPanel.add(rotNome);
		infoPanel.add(nome);
		infoPanel.add(rotPreco);
		infoPanel.add(preco);
		infoPanel.add(rotQuantidade);
		infoPanel.add(quantidade);
		infoPanel.add(rotMarca);
		infoPanel.add(marca);
		infoPanel.add(rotCod);
		infoPanel.add(cod);

		// Adicionar o painel de informações abaixo do painel de botões
		add(infoPanel);
		// Adição do painel de botões ao centro do BorderLayout
		add(cadPanel, BorderLayout.CENTER);
		// Adição do rótulo de cadastro ao topo do BorderLayout
		add(cad, BorderLayout.NORTH);
		// Panels de controle da tela de cadastro

		
		panelAlimento.setName("panelAlimento");
		panelAlimento.setBackground(new Color(255, 222, 173));
		panelAlimento.setLayout(null);
		panelAlimento.setBounds(150, 330, 800, 300);
		rotPeso.setFont(new Font("Impact", Font.BOLD, 30));
		rotPeso.setBounds(30, 0, 250, 40);
		peso.setFont(new Font("Impact", Font.PLAIN, 20));
		peso.setBounds(30, 40, 250, 40);
		panelAlimento.add(rotPeso);
		panelAlimento.add(peso);
		rotData.setFont(new Font("Impact", Font.BOLD, 30));
		rotData.setBounds(300, 0, 250, 40);
		data.setFont(new Font("Impact", Font.PLAIN, 20));
		data.setBounds(300, 40, 250, 40);
		data.setText("dd/mm/yyyy");
		panelAlimento.add(rotData);
		panelAlimento.add(data);

		// Panel de vestuario
		panelVestuario.setName("panelVestuario");
		panelVestuario.setBackground(new Color(255, 222, 173));
		panelVestuario.setLayout(null);
		panelVestuario.setBounds(150, 330, 800, 300);
		rotTaman = new JLabel("Tamanho: ");
		rotTaman.setFont(new Font("Impact", Font.BOLD, 30));
		rotTaman.setBounds(30, 0, 250, 40);
		taman = new JTextField();
		taman.setFont(new Font("Impact", Font.PLAIN, 20));
		taman.setBounds(30, 40, 250, 40);
		panelVestuario.add(rotTaman);
		panelVestuario.add(taman);
		rotTec = new JLabel("Tecido/Material: ");
		rotTec.setFont(new Font("Impact", Font.BOLD, 30));
		rotTec.setBounds(300, 0, 250, 40);
		tec = new JTextField();
		tec.setFont(new Font("Impact", Font.PLAIN, 20));
		tec.setBounds(300, 40, 250, 40);
		panelVestuario.add(rotTec);
		panelVestuario.add(tec);

		// Panel de informatica
		panelInformatica.setName("panelInformatica");
		panelInformatica.setBackground(new Color(255, 222, 173));
		panelInformatica.setLayout(null);
		panelInformatica.setBounds(150, 330, 800, 300);
		rotProc = new JLabel("Processador: ");
		rotProc.setFont(new Font("Impact", Font.BOLD, 30));
		rotProc.setBounds(30, 0, 250, 40);
		proc = new JTextField();
		proc.setFont(new Font("Impact", Font.PLAIN, 20));
		proc.setBounds(30, 40, 250, 40);
		panelInformatica.add(rotProc);
		panelInformatica.add(proc);
		rotArma = new JLabel("Armazenamento: ");
		rotArma.setFont(new Font("Impact", Font.BOLD, 30));
		rotArma.setBounds(300, 0, 250, 40);
		armaze = new JTextField();
		armaze.setFont(new Font("Impact", Font.PLAIN, 20));
		armaze.setBounds(300, 40, 250, 40);
		panelInformatica.add(rotArma);
		panelInformatica.add(armaze);
		rotTam = new JLabel("Tamanho da Tela: ");
		rotTam.setFont(new Font("Impact", Font.BOLD, 30));
		rotTam.setBounds(30, 100, 250, 40);
		tam = new JTextField();
		tam.setFont(new Font("Impact", Font.PLAIN, 20));
		tam.setBounds(30, 140, 250, 40);
		panelInformatica.add(rotTam);
		panelInformatica.add(tam);

		// Panel de Livro
		panelLivro.setName("panelLivro");
		panelLivro.setBackground(new Color(255, 222, 173));
		panelLivro.setLayout(null);
		panelLivro.setBounds(150, 330, 800, 300);
		rotGen = new JLabel("Gênero: ");
		rotGen.setFont(new Font("Impact", Font.BOLD, 30));
		rotGen.setBounds(30, 0, 250, 40);
		// Atribui a um vetor de String todos os valores possíveis do conjunto enumerado
		generos = GenLiterario.values();
		String[] genString = new String[generos.length];
		for (int i = 0; i < generos.length; i++) {
			genString[i] = generos[i].toString();
		}
		gen = new JList<>(genString);
		gen.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane genLit = new JScrollPane(gen);
		genLit.setBounds(30, 40, 400, 40);
		gen.setFont(new Font("Impact", Font.PLAIN, 25));
		gen.setBounds(30, 40, 400, 40);
		panelLivro.add(rotGen);
		panelLivro.add(genLit);
		rotPag = new JLabel("Quantidade de Páginas: ");
		rotPag.setFont(new Font("Impact", Font.BOLD, 30));
		rotPag.setBounds(30, 100, 400, 40);
		qtdPag = new JTextField();
		qtdPag.setFont(new Font("Impact", Font.PLAIN, 20));
		qtdPag.setBounds(30, 140, 400, 40);
		panelLivro.add(rotPag);
		panelLivro.add(qtdPag);

		// Panel de maquiagem
		panelMaq.setName("panelMaq");
		panelMaq.setBackground(new Color(255, 222, 173));
		panelMaq.setLayout(null);
		panelMaq.setBounds(150, 330, 800, 300);
		// Atribui a um vetor de String todos os valores possíveis do conjunto enumerado
		qualidades = QualidadeMaterial.values();
		String[] qualString = new String[qualidades.length];
		for (int i = 0; i < qualidades.length; i++) {
			qualString[i] = qualidades[i].toString();
		}
		JLabel rotQual = new JLabel("Qualidade da pigmentação: ");
		rotQual.setBounds(30, 0, 400, 40);
		rotQual.setFont(new Font("Impact", Font.BOLD, 30));
		qual = new JList<>(qualString);
		JScrollPane qualidade = new JScrollPane(qual);
		qual.setFont(new Font("Impact", Font.PLAIN, 30));
		qualidade.setBounds(30, 40, 400, 40);
		panelMaq.add(rotQual);
		panelMaq.add(qualidade);
		JLabel rotDur = new JLabel("Durabilidade: ");
		rotDur.setFont(new Font("Impact", Font.BOLD, 30));
		rotDur.setBounds(30, 100, 400, 40);
		dur = new JList<>(qualString);
		JScrollPane durabilidade = new JScrollPane(dur);
		dur.setFont(new Font("Impact", Font.PLAIN, 30));
		durabilidade.setBounds(30, 140, 400, 40);
		panelMaq.add(rotDur);
		panelMaq.add(durabilidade);

		panelAlimento.setVisible(false);
		panelVestuario.setVisible(false);
		panelInformatica.setVisible(false);
		panelLivro.setVisible(false);
		panelMaq.setVisible(false);
		alimento.addActionListener(e -> {
			for (JPanel c : cads) {
				c.setVisible(false);
			}
			// botão que permite o cadastro
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			// Adição do panel que permite a visualização das boxes de cadastro especifico
			cadPanel.add(panelAlimento);
			panelAlimento.setVisible(true);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});

		vestuario.addActionListener(e -> {
			for (JPanel c : cads) {
				c.setVisible(false);
			}
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			cadPanel.add(panelVestuario);
			panelVestuario.setVisible(true);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});
		informatica.addActionListener(e -> {
			for (JPanel c : cads) {
				c.setVisible(false);
			}
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			cadPanel.add(panelInformatica);
			panelInformatica.setVisible(true);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});
		livro.addActionListener(e -> {
			for (JPanel c : cads) {
				c.setVisible(false);
			}
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			cadPanel.add(panelLivro);
			panelLivro.setVisible(true);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});
		maquiagem.addActionListener(e -> {
			for (JPanel c : cads) {
				c.setVisible(false);
			}
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			cadPanel.add(panelMaq);
			panelMaq.setVisible(true);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});
		// Ação de cadastrar
		cadastrar.addActionListener(e -> {

			if (nome.getText().isBlank() || preco.getText().isBlank() || Double.parseDouble(preco.getText()) <= 0
					|| (int) quantidade.getValue() <= 0 || Integer.parseInt(cod.getText()) <= 0
					|| cod.getText().isBlank() || marca.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Não pode haver campos vazios ou com valores negativos");
				return;
			}

			if (panelAlimento.isVisible() == true) {
				/*
				 * Para saber que a tela de cadastro de alimento está ativa foi pego a
				 * visibilidade dos campos de cadastro necessárias para seu cadastro
				 *
				 * Caso haja algum campo vazio na tela de cadastro de alimento não deve ser
				 * possível cadastrar, logo há um pop-up solicitando a escrita nos campos vazios
				 */
				if (data.getText().isBlank() || peso.getText().isBlank() || data.getText().isEmpty()
						|| peso.getText().isEmpty()) {
					// Dados de alimento vazios
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				} else {

					/*
					 * Cadastro efetivo de um alimento no estoque, além disso é "apagado" dos
					 * JTextFields as informações escritas
					 */
					if (dados.CheckData(data.getText()) == false) {
						JOptionPane.showMessageDialog(null, "Formato de data inválido");
						return;
					}
					try {
						dados.cadAlimento(nome.getText(), Double.parseDouble(preco.getText()),
								(int) quantidade.getValue(), Integer.parseInt(cod.getText()), marca.getText(),
								sdf.parse(data.getText()), Double.parseDouble(peso.getText()));
						nome.setText("");
						preco.setText("");
						cod.setText("");
						marca.setText("");
						quantidade.setValue(0);
						peso.setText("");
						data.setText("");
						JOptionPane.showMessageDialog(null, "Cadastrado o Alimento");
					} catch (NumberFormatException | ParseException e1) {
						e1.printStackTrace();
					}
				}
				/*
				 * Checando a visibilidade dos campos que caracterizam o vestuario
				 */
			}
			if (panelVestuario.isVisible() == true) {
				if (taman.getText().isBlank() || tec.getText().isBlank() || tec.getText().isEmpty()
						|| taman.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				} else
					// Cadastro de um Vestuario no estoque
					dados.cadVestuario(nome.getText(), Double.parseDouble(preco.getText()), (int) quantidade.getValue(),
							Integer.parseInt(cod.getText()), marca.getText(), tec.getText(),
							Integer.parseInt(taman.getText()));
				nome.setText("");
				preco.setText("");
				cod.setText("");
				marca.setText("");
				quantidade.setValue(0);
				tec.setText("");
				taman.setText("");
				JOptionPane.showMessageDialog(null, "Cadastrado o Vestuario");
				return;
			}
			if (panelLivro.isVisible() == true) {

				if (qtdPag.getText().isBlank() || qtdPag.getText().isEmpty() || gen.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione nos campos vazios!");
				} else
					dados.cadLivro(nome.getText(), Double.parseDouble(preco.getText()), (int) quantidade.getValue(),
							Integer.parseInt(cod.getText()), marca.getText(),
							GenLiterario.valueOf(gen.getSelectedValue()), Integer.parseInt(qtdPag.getText()));
				JOptionPane.showMessageDialog(null, "Cadastrado o Livro");
				nome.setText("");
				preco.setText("");
				cod.setText("");
				marca.setText("");
				quantidade.setValue(0);
				gen.clearSelection();
				qtdPag.setText("");
			}
			if (panelMaq.isVisible() == true) {

				if (qual.isSelectionEmpty() || dur.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "Selecione algo nos campos vazios!");
				} else
					dados.cadMaquiagem(nome.getText(), Double.parseDouble(preco.getText()), (int) quantidade.getValue(),
							Integer.parseInt(cod.getText()), marca.getText(),
							QualidadeMaterial.valueOf(dur.getSelectedValue()),
							QualidadeMaterial.valueOf(qual.getSelectedValue()));
				JOptionPane.showMessageDialog(null, "Cadastrado a Maquiagem");
				nome.setText("");
				preco.setText("");
				cod.setText("");
				marca.setText("");
				quantidade.setValue(0);
				qual.clearSelection();
				dur.clearSelection();

			}
			if (panelInformatica.isVisible() == true) {
				if (tam.getText().isBlank() || proc.getText().isBlank() || armaze.getText().isBlank()
						|| tam.getText().isEmpty() || proc.getText().isEmpty() || armaze.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				} else
					dados.cadInformatica(nome.getText(), Double.parseDouble(preco.getText()),
							(int) quantidade.getValue(), Integer.parseInt(cod.getText()), marca.getText(),
							Double.parseDouble(tam.getText()), Integer.parseInt(armaze.getText()), proc.getText());
				JOptionPane.showMessageDialog(null, "Cadastrado a Informatica");
				nome.setText("");
				preco.setText("");
				cod.setText("");
				quantidade.setValue(0);
				marca.setText("");
				armaze.setText("");
				proc.setText("");
				tam.setText("");
			}
		});
	}
	public JTextField getNome() {
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getPreco() {
		return preco;
	}

	public void setPreco(JTextField preco) {
		this.preco = preco;
	}

	public JTextField getMarca() {
		return marca;
	}

	public void setMarca(JTextField marca) {
		this.marca = marca;
	}

	public JTextField getCod() {
		return cod;
	}

	public void setCod(JTextField cod) {
		this.cod = cod;
	}

	public JSpinner getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(JSpinner quantidade) {
		this.quantidade = quantidade;
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public ControleDados getDados() {
		return dados;
	}

	public JTextField getPeso() {
		return peso;
	}

	public void setPeso(JTextField peso) {
		this.peso = peso;
	}

	public JTextField getData() {
		return data;
	}

	public void setData(JTextField data) {
		this.data = data;
	}

	public JTextField getTaman() {
		return taman;
	}

	public void setTaman(JTextField taman) {
		this.taman = taman;
	}

	public JTextField getTec() {
		return tec;
	}

	public void setTec(JTextField tec) {
		this.tec = tec;
	}

	public JTextField getProc() {
		return proc;
	}

	public void setProc(JTextField proc) {
		this.proc = proc;
	}

	public JTextField getArmaze() {
		return armaze;
	}

	public void setArmaze(JTextField armaze) {
		this.armaze = armaze;
	}

	public JTextField getTam() {
		return tam;
	}

	public void setTam(JTextField tam) {
		this.tam = tam;
	}

	public JList<String> getGen() {
		return gen;
	}

	public void setGen(JList<String> gen) {
		this.gen = gen;
	}

	public JTextField getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(JTextField qtdPag) {
		this.qtdPag = qtdPag;
	}

	public JList<String> getDur() {
		return dur;
	}

	public void setDur(JList<String> dur) {
		this.dur = dur;
	}

	public JList<String> getQual() {
		return qual;
	}

	public void setQual(JList<String> qual) {
		this.qual = qual;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

	public List<JPanel> getCads() {
		return cads;
	}

	public void setCads(List<JPanel> cads) {
		this.cads = cads;
	}

	public JButton getAlimento() {
		return alimento;
	}

	public void setAlimento(JButton alimento) {
		this.alimento = alimento;
	}

	public JButton getVestuario() {
		return vestuario;
	}

	public void setVestuario(JButton vestuario) {
		this.vestuario = vestuario;
	}

	public JButton getInformatica() {
		return informatica;
	}

	public void setInformatica(JButton informatica) {
		this.informatica = informatica;
	}

	public JButton getLivro() {
		return livro;
	}

	public void setLivro(JButton livro) {
		this.livro = livro;
	}

	public JButton getMaquiagem() {
		return maquiagem;
	}

	public void setMaquiagem(JButton maquiagem) {
		this.maquiagem = maquiagem;
	}

}
