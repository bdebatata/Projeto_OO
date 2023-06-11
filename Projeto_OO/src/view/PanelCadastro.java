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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import control.ControleDados;
import enums.GenLiterario;
import enums.QualidadeMaterial;

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
	private JLabel rotNome = new JLabel("Nome: ");
	private JTextField nome = new JTextField();
	private JLabel rotPreco = new JLabel("Preço: ");
	private JTextField preco = new JTextField();
	private JLabel rotMarca = new JLabel("Marca: ");
	private JTextField marca = new JTextField();
	private JLabel rotCod = new JLabel("Código: ");
	private JTextField cod = new JTextField();
	private JLabel rotPeso = new JLabel("Peso: ");
	private JTextField peso = new JTextField();
	private JLabel rotData = new JLabel("Data de Validade: ");
	private JTextField data = new JTextField();
	private JLabel rotQuantidade = new JLabel("Quantidade: ");
	private JSpinner quantidade = new JSpinner();
	// Controle de dados
	private ControleDados dados;

	PanelCadastro(ControleDados dados) {
		this.dados = dados;
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
		// Panel de Alimento
		JPanel panelAlimento = new JPanel();
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
		JPanel panelVestuario = new JPanel();
		panelVestuario.setBackground(new Color(255, 222, 173));
		panelVestuario.setLayout(null);
		panelVestuario.setBounds(150, 330, 800, 300);
		JLabel rotTamam = new JLabel("Tamanho: ");
		rotTamam.setFont(new Font("Impact", Font.BOLD, 30));
		rotTamam.setBounds(30, 0, 250, 40);
		JTextField taman = new JTextField();
		taman.setFont(new Font("Impact", Font.PLAIN, 20));
		taman.setBounds(30, 40, 250, 40);
		panelVestuario.add(rotTamam);
		panelVestuario.add(taman);
		JLabel rotTec = new JLabel("Tecido/Material: ");
		rotTec.setFont(new Font("Impact", Font.BOLD, 30));
		rotTec.setBounds(300, 0, 250, 40);
		JTextField tec = new JTextField();
		tec.setFont(new Font("Impact", Font.PLAIN, 20));
		tec.setBounds(300, 40, 250, 40);
		panelVestuario.add(rotTec);
		panelVestuario.add(tec);

		// Panel de informatica
		JPanel panelInformatica = new JPanel();
		panelInformatica.setBackground(new Color(255, 222, 173));
		panelInformatica.setLayout(null);
		panelInformatica.setBounds(150, 330, 800, 300);
		JLabel rotProc = new JLabel("Processador: ");
		rotProc.setFont(new Font("Impact", Font.BOLD, 30));
		rotProc.setBounds(30, 0, 250, 40);
		JTextField proc = new JTextField();
		proc.setFont(new Font("Impact", Font.PLAIN, 20));
		proc.setBounds(30, 40, 250, 40);
		panelInformatica.add(rotProc);
		panelInformatica.add(proc);
		JLabel rotArma = new JLabel("Armazenamento: ");
		rotArma.setFont(new Font("Impact", Font.BOLD, 30));
		rotArma.setBounds(300, 0, 250, 40);
		JTextField armaze = new JTextField();
		armaze.setFont(new Font("Impact", Font.PLAIN, 20));
		armaze.setBounds(300, 40, 250, 40);
		panelInformatica.add(rotArma);
		panelInformatica.add(armaze);
		JLabel rotTam = new JLabel("Tamanho da Tela: ");
		rotTam.setFont(new Font("Impact", Font.BOLD, 30));
		rotTam.setBounds(30, 100, 250, 40);
		JTextField tam = new JTextField();
		tam.setFont(new Font("Impact", Font.PLAIN, 20));
		tam.setBounds(30, 140, 250, 40);
		panelInformatica.add(rotTam);
		panelInformatica.add(tam);

		// Panel de Livro
		JPanel panelLivro = new JPanel();
		panelLivro.setBackground(new Color(255, 222, 173));
		panelLivro.setLayout(null);
		panelLivro.setBounds(150, 330, 800, 300);
		JLabel rotGen = new JLabel("Gênero: ");
		rotGen.setFont(new Font("Impact", Font.BOLD, 30));
		rotGen.setBounds(30, 0, 250, 40);
		JTextField gen = new JTextField();
		gen.setFont(new Font("Impact", Font.PLAIN, 20));
		gen.setBounds(30, 40, 400, 40);
		panelLivro.add(rotGen);
		panelLivro.add(gen);
		JLabel rotPag = new JLabel("Quantidade de Páginas: ");
		rotPag.setFont(new Font("Impact", Font.BOLD, 30));
		rotPag.setBounds(30, 100, 400, 40);
		JTextField qtdPag = new JTextField();
		qtdPag.setFont(new Font("Impact", Font.PLAIN, 20));
		qtdPag.setBounds(30, 140, 400, 40);
		panelLivro.add(rotPag);
		panelLivro.add(qtdPag);

		// Panel de maquiagem
		JPanel panelMaq = new JPanel();
		panelMaq.setBackground(new Color(255, 222, 173));
		panelMaq.setLayout(null);
		panelMaq.setBounds(150, 330, 800, 300);
		JLabel rotQual = new JLabel("Qualidade da pigmentação: ");
		rotQual.setBounds(30, 0, 400, 40);
		rotQual.setFont(new Font("Impact", Font.BOLD, 30));
		JTextField qual = new JTextField();
		qual.setFont(new Font("Impact", Font.PLAIN, 20));
		qual.setBounds(30, 40, 400, 40);
		panelMaq.add(rotQual);
		panelMaq.add(qual);
		JLabel rotDur = new JLabel("Durabilidade: ");
		rotDur.setFont(new Font("Impact", Font.BOLD, 30));
		rotDur.setBounds(30, 100, 400, 40);
		JTextField dur = new JTextField();
		dur.setFont(new Font("Impact", Font.PLAIN, 20));
		dur.setBounds(30, 140, 400, 40);
		panelMaq.add(rotDur);
		panelMaq.add(dur);

		List<JPanel> cads = new ArrayList<>();
		cads.add(panelMaq);
		cads.add(panelLivro);
		cads.add(panelInformatica);
		cads.add(panelVestuario);
		cads.add(panelAlimento);

		alimento.addActionListener(e -> {
			for (JPanel c : cads) {
				cadPanel.remove(c);
			}
			// botão que permite o cadastro
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			// Adição do panel que permite a visualização das boxes de cadastro especifico
			cadPanel.add(panelAlimento);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});

		vestuario.addActionListener(e -> {
			for (JPanel c : cads) {
				cadPanel.remove(c);
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
				cadPanel.remove(c);
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
				cadPanel.remove(c);
			}
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			cadPanel.add(panelLivro);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});
		maquiagem.addActionListener(e -> {
			for (JPanel c : cads) {
				cadPanel.remove(c);
			}
			add(cadastrar, BorderLayout.SOUTH);
			cadastrar.setFont(new Font("Impact", Font.PLAIN, 20));
			cadastrar.setBackground(new Color(148, 103, 97));
			cadPanel.add(panelMaq);
			cadPanel.setVisible(false);
			cadPanel.setVisible(true);
		});
		// Ação de cadastrar
		cadastrar.addActionListener(e -> {

			if (nome.getText().isBlank() || preco.getText().isBlank() || (int) quantidade.getValue() == 0
					|| Integer.parseInt(cod.getText()) == 0 || cod.getText().isBlank() || marca.getText().isBlank()) {
			} else if (peso.isVisible() == true && data.isVisible()) {
				/*
				 * Para saber que a tela de cadastro de alimento está ativa foi pego a
				 * visibilidade dos campos de cadastro necessárias para seu cadastro
				 *
				 * Caso haja algum campo vazio na tela de cadastro de alimento não deve ser
				 * possível cadastrar, logo há um pop-up solicitando a escrita nos campos vazios
				 */
				if (data.getText().isBlank() || peso.getText().isBlank() || data.getText().isEmpty()
						|| peso.getText().isEmpty()) {
				} else {
					/*
					 * Cadastro efetivo de um alimento no estoque, além disso é "apagado" dos
					 * JTextFields as informações escritas
					 */
					try {
						dados.cadAlimento(nome.getText(), Double.parseDouble(preco.getText()),
								(int) quantidade.getValue(), Integer.parseInt(cod.getText()), marca.getText(),
								sdf.parse(data.getText()), Double.parseDouble(peso.getText()));
					} catch (NumberFormatException | ParseException e1) {
						JOptionPane.showMessageDialog(null, "Formato de data inválido");
					}
				}
			}
			/*
			 * Checando a visibilidade dos campos que caracterizam o vestuario
			 */
			if (taman.isVisible() && tec.isVisible()) {
				if (taman.getText().isBlank() || tec.getText().isBlank() || tec.getText().isEmpty()
						|| taman.getText().isEmpty()) {

				} else
					// Cadastro de um Vestuario no estoque
					dados.cadVestuario(nome.getText(), Double.parseDouble(preco.getText()), (int) quantidade.getValue(),
							Integer.parseInt(cod.getText()), marca.getText(), tec.getText(),
							Integer.parseInt(taman.getText()));
			}
			if (qtdPag.isVisible() == true && gen.isVisible() == true) {
				if (gen.getText().isBlank() || qtdPag.getText().isBlank() || gen.getText().isEmpty()
						|| qtdPag.getText().isEmpty()) {

				} else
					dados.cadLivro(nome.getText(), Double.parseDouble(preco.getText()), (int) quantidade.getValue(),
							Integer.parseInt(cod.getText()), marca.getText(), GenLiterario.valueOf(gen.getText()),
							Integer.parseInt(qtdPag.getText()));
			}
			if (dur.isVisible() == true && qual.isVisible() == true) {
				if (qual.getText().isBlank() || dur.getText().isBlank() || dur.getText().isEmpty()
						|| dur.getText().isEmpty()) {

				} else
					dados.cadMaquiagem(nome.getText(), Double.parseDouble(preco.getText()), (int) quantidade.getValue(),
							Integer.parseInt(cod.getText()), marca.getText(), QualidadeMaterial.valueOf(dur.getText()),
							QualidadeMaterial.valueOf(qual.getText()));
			}
			if (proc.isVisible() == true && tam.isVisible() == true && armaze.isVisible() == true) {
				if (tam.getText().isBlank() || proc.getText().isBlank() || armaze.getText().isBlank()
						|| tam.getText().isEmpty() || proc.getText().isEmpty() || armaze.getText().isEmpty()) {

				} else
					dados.cadInformatica(nome.getText(), Double.parseDouble(preco.getText()),
							(int) quantidade.getValue(), Integer.parseInt(cod.getText()), marca.getText(),
							Double.parseDouble(tam.getText()), Integer.parseInt(armaze.getText()), proc.getText());
			}

			// Limpando os campos
			nome.setText("");
			preco.setText("");
			cod.setText("");
			quantidade.setValue(0);

			marca.setText("");
			peso.setText("");
			data.setText("");

			qual.setText("");
			dur.setText("");

			gen.setText("");
			qtdPag.setText("");

			tec.setText("");
			taman.setText("");

			armaze.setText("");
			proc.setText("");
			tam.setText("");
		}

		);
	}

	public ControleDados getDados() {
		return dados;
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public JTextField getNome() {
		return nome;
	}

	public JTextField getPreco() {
		return preco;
	}

	public JSpinner getQtd() {
		return quantidade;
	}

	public JTextField getCod() {
		return cod;
	}

	public JTextField getMarca() {
		return marca;
	}

	public JTextField getPeso() {
		return peso;
	}

	public JTextField getData() {
		return data;
	}
}
