package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import control.ControleDados;
import enums.GenLiterario;
import enums.QualidadeMaterial;
import model.Alimento;
import model.Informatica;
import model.Livro;
import model.Maquiagem;
import model.Produto;
import model.Vestuario;

public class PanelUpdate extends JPanel {
	private JLabel read = new JLabel();
	private ControleDados dados;
	private JList<String> lista;
	private JPanel panelLista;
	private JButton update = new JButton("Update");
	private DefaultListModel<String> nomesProduto = new DefaultListModel<>();

	PanelUpdate(ControleDados dados) {
		this.dados = dados;
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(new BorderLayout());
		read.setText("Atualização de dados");
		read.setHorizontalAlignment(JLabel.CENTER);
		read.setVerticalAlignment(JLabel.NORTH);
		read.setFont(new Font("Impact", Font.BOLD, 50));
		read.setHorizontalTextPosition(JLabel.RIGHT);
		add(read);
		// Panel que mostra a lista de produtos cadastrados
		panelLista = new JPanel();
		panelLista.setBounds(30, 100, 500, 675);
		panelLista.setBackground(new Color(255, 222, 173));
		panelLista.setLayout(null);
		lista = new JList<>(nomesProduto);
		JScrollPane scrollPane = new JScrollPane(lista);
		scrollPane.setBounds(0, 0, 500, 657);
		lista.setBackground(new Color(222, 184, 135));
		lista.setFont(new Font("Impact", Font.BOLD, 30));
		panelLista.add(scrollPane);
		read.add(panelLista);

		// Panel que mostra os dados do produto
		JPanel panelDados = new JPanel();
		panelDados.setLayout(null);
		panelDados.setBounds(550, 100, 500, 657);
		panelDados.setBackground(new Color(148, 103, 97));
		JLabel titulo = new JLabel();
		titulo.setText("Dados: ");
		titulo.setBounds(200, 0, 100, 50);
		titulo.setFont(new Font("Impact", Font.BOLD, 30));
		panelDados.add(titulo);

		// Dados básicos de cada produto
		JLabel nome = new JLabel();
		nome.setText("Nome: ");
		nome.setFont(new Font("Impact", Font.BOLD, 30));
		nome.setBounds(50, 50, 300, 50);
		panelDados.add(nome);

		JLabel preco = new JLabel();
		preco.setText("Preço: ");
		preco.setFont(new Font("Impact", Font.BOLD, 30));
		preco.setBounds(50, 90, 300, 50);
		panelDados.add(preco);

		JTextField uppreco = new JTextField();
		uppreco.setFont(new Font("Impact", Font.BOLD, 30));
		uppreco.setBounds(150, 100, 300, 30);
		uppreco.setVisible(false);
		panelDados.add(uppreco);

		JLabel quantidade = new JLabel();
		quantidade.setText("Quantidade: ");
		quantidade.setFont(new Font("Impact", Font.BOLD, 30));
		quantidade.setBounds(50, 130, 300, 50);
		panelDados.add(quantidade);

		JTextField upquantidade = new JTextField();
		upquantidade.setFont(new Font("Impact", Font.BOLD, 30));
		upquantidade.setBounds(220, 140, 230, 30);
		upquantidade.setVisible(false);
		panelDados.add(upquantidade);

		JLabel cod = new JLabel();
		cod.setText("Código: ");
		cod.setFont(new Font("Impact", Font.BOLD, 30));
		cod.setBounds(50, 170, 300, 50);
		panelDados.add(cod);

		JTextField upcod = new JTextField();
		upcod.setFont(new Font("Impact", Font.BOLD, 30));
		upcod.setBounds(155, 180, 295, 30);
		upcod.setVisible(false);
		panelDados.add(upcod);

		JLabel marca = new JLabel();
		marca.setText("Marca: ");
		marca.setFont(new Font("Impact", Font.BOLD, 30));
		marca.setBounds(50, 210, 500, 50);
		panelDados.add(marca);

		JTextField upmarca = new JTextField();
		upmarca.setFont(new Font("Impact", Font.BOLD, 30));
		upmarca.setVisible(false);
		upmarca.setBounds(155, 220, 295, 30);
		panelDados.add(upmarca);
		// Labels especificas de cada tipo de produto
		// Alimento
		JLabel data = new JLabel();
		data.setText("Data: ");
		data.setFont(new Font("Impact", Font.BOLD, 30));
		data.setBounds(50, 250, 500, 50);
		data.setVisible(false);
		panelDados.add(data);

		JTextField updata = new JTextField();
		updata.setFont(new Font("Impact", Font.BOLD, 30));
		updata.setBounds(155, 260, 300, 30);
		panelDados.add(updata);
		updata.setVisible(false);

		JLabel peso = new JLabel();
		peso.setText("Peso: ");
		peso.setFont(new Font("Impact", Font.BOLD, 30));
		peso.setBounds(50, 290, 500, 50);
		peso.setVisible(false);
		panelDados.add(peso);

		JTextField uppeso = new JTextField();
		uppeso.setFont(new Font("Impact", Font.BOLD, 30));
		uppeso.setBounds(155, 300, 300, 30);
		uppeso.setVisible(false);
		panelDados.add(uppeso);

		// Informatica
		JLabel tamanhoTela = new JLabel();
		tamanhoTela.setText("Tamanho da tela: ");
		tamanhoTela.setFont(new Font("Impact", Font.BOLD, 30));
		tamanhoTela.setBounds(50, 250, 500, 50);
		tamanhoTela.setVisible(false);
		panelDados.add(tamanhoTela);

		JTextField uptamanhoTela = new JTextField();
		uptamanhoTela.setFont(new Font("Impact", Font.BOLD, 30));
		uptamanhoTela.setBounds(280, 260, 170, 30);
		uptamanhoTela.setVisible(false);
		panelDados.add(uptamanhoTela);

		JLabel armazenamento = new JLabel();
		armazenamento.setText("Armazenamento: ");
		armazenamento.setFont(new Font("Impact", Font.BOLD, 30));
		armazenamento.setBounds(50, 290, 500, 50);
		armazenamento.setVisible(false);
		panelDados.add(armazenamento);

		JTextField uparmazenamento = new JTextField();
		uparmazenamento.setFont(new Font("Impact", Font.BOLD, 30));
		uparmazenamento.setBounds(280, 300, 170, 30);
		uparmazenamento.setVisible(false);
		panelDados.add(uparmazenamento);

		JLabel processador = new JLabel();
		processador.setText("Processador: ");
		processador.setFont(new Font("Impact", Font.BOLD, 30));
		processador.setBounds(50, 330, 500, 50);
		processador.setVisible(false);
		panelDados.add(processador);

		JTextField upprocessador = new JTextField();
		upprocessador.setFont(new Font("Impact", Font.BOLD, 30));
		upprocessador.setBounds(230, 340, 220, 30);
		upprocessador.setVisible(false);
		panelDados.add(upprocessador);

		// Maquiagem
		JLabel durabilidade = new JLabel();
		durabilidade.setText("Durabilidade: ");
		durabilidade.setFont(new Font("Impact", Font.BOLD, 30));
		durabilidade.setBounds(50, 250, 500, 50);
		durabilidade.setVisible(false);
		panelDados.add(durabilidade);

		JTextField updurabilidade = new JTextField();
		updurabilidade.setFont(new Font("Impact", Font.BOLD, 30));
		updurabilidade.setBounds(250, 260, 200, 30);
		updurabilidade.setVisible(false);
		panelDados.add(updurabilidade);

		JLabel pigmentacao = new JLabel();
		pigmentacao.setText("Pigmentação: ");
		pigmentacao.setFont(new Font("Impact", Font.BOLD, 30));
		pigmentacao.setBounds(50, 290, 500, 50);
		pigmentacao.setVisible(false);
		panelDados.add(pigmentacao);

		JTextField uppigmentacao = new JTextField();
		uppigmentacao.setFont(new Font("Impact", Font.BOLD, 30));
		uppigmentacao.setBounds(250, 300, 200, 30);
		uppigmentacao.setVisible(false);
		panelDados.add(uppigmentacao);

		// Vestuário
		JLabel tecido = new JLabel();
		tecido.setText("Tecido/Material: ");
		tecido.setFont(new Font("Impact", Font.BOLD, 30));
		tecido.setBounds(50, 250, 500, 50);
		tecido.setVisible(false);
		panelDados.add(tecido);

		JTextField uptecido = new JTextField();
		uptecido.setFont(new Font("Impact", Font.BOLD, 30));
		uptecido.setBounds(280, 260, 170, 30);
		uptecido.setVisible(false);
		panelDados.add(uptecido);

		JLabel tamanho = new JLabel();
		tamanho.setText("Tamanho: ");
		tamanho.setFont(new Font("Impact", Font.BOLD, 30));
		tamanho.setBounds(50, 290, 500, 50);
		tamanho.setVisible(false);
		panelDados.add(tamanho);

		JTextField uptamanho = new JTextField();
		uptamanho.setFont(new Font("Impact", Font.BOLD, 30));
		uptamanho.setBounds(190, 300, 260, 30);
		uptamanho.setVisible(false);
		panelDados.add(uptamanho);

		// Livro
		JLabel genero = new JLabel();
		genero.setText("Gênero Literário: ");
		genero.setFont(new Font("Impact", Font.BOLD, 30));
		genero.setBounds(50, 250, 500, 50);
		genero.setVisible(false);
		panelDados.add(genero);

		JTextField upgenero = new JTextField();
		upgenero.setFont(new Font("Impact", Font.BOLD, 30));
		upgenero.setBounds(280, 260, 170, 30);
		upgenero.setVisible(false);
		panelDados.add(upgenero);

		JLabel qtdPag = new JLabel();
		qtdPag.setText("Quantidade de páginas: ");
		qtdPag.setFont(new Font("Impact", Font.BOLD, 30));
		qtdPag.setBounds(50, 290, 500, 50);
		qtdPag.setVisible(false);
		panelDados.add(qtdPag);

		JTextField upqtdPag = new JTextField();
		upqtdPag.setText("Quantidade de páginas: ");
		upqtdPag.setFont(new Font("Impact", Font.BOLD, 30));
		upqtdPag.setBounds(370, 300, 80, 30);
		upqtdPag.setVisible(false);
		panelDados.add(upqtdPag);

		/*
		 * Criação de uma lista que junta todos os atributos especificos para que assim
		 * eu consiga mudar a visibilidade de todos para que não haja conflito entre
		 * várias JLabels
		 */
		List<JLabel> atributos = new ArrayList<>();
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
		 * Da mesma forma sendo feito com as TextFields que os acompanham
		 */
		List<JTextField> upatributos = new ArrayList<>();
		upatributos.add(updata);
		upatributos.add(uppeso);
		// Atributos de Informatica
		upatributos.add(uptamanhoTela);
		upatributos.add(upprocessador);
		upatributos.add(uparmazenamento);
		// Atributos de Maquiagem
		upatributos.add(uppigmentacao);
		upatributos.add(updurabilidade);
		// Atributs de Vestuário
		upatributos.add(uptecido);
		upatributos.add(uptamanho);
		// Atributos de Livro
		upatributos.add(upgenero);
		upatributos.add(upqtdPag);

		// Botão do update de dados
		update.setBackground(new Color(222, 184, 135));
		update.setFont(new Font("Impact", Font.BOLD, 30));
		update.setBounds(100, 500, 300, 50);
		panelDados.add(update);
		// Açao do click na lista
		lista.addListSelectionListener(e -> {
			Object index = lista.getSelectedValue();
			for (Produto p : dados.getEstoque().getProdutos()) {
				if (p.getNome() == index) {
					nome.setText("Nome: " + p.getNome());
					uppreco.setText("" + p.getPreco());
					upquantidade.setText("" + p.getQtd());
					upmarca.setText(p.getMarca());
					upcod.setText("" + p.getCod());
					if (p instanceof Alimento) {
						Alimento c = (Alimento) p;
						uppeso.setText("" + c.getPeso());
						updata.setText(c.getSdf().format(c.getDataDeValidade()));
						atributosOff(atributos);
						upatributosOff(upatributos);

						upmarca.setVisible(true);
						uppreco.setVisible(true);
						upcod.setVisible(true);
						upquantidade.setVisible(true);
						data.setVisible(true);
						updata.setVisible(true);
						peso.setVisible(true);
						uppeso.setVisible(true);
					}
					if (p instanceof Informatica) {
						Informatica c = (Informatica) p;
						uparmazenamento.setText("" + c.getArmazenamento());
						upprocessador.setText(c.getProcessador());
						uptamanhoTela.setText("" + c.getTamanhoDaTela());
						atributosOff(atributos);
						upatributosOff(upatributos);
						upmarca.setVisible(true);
						uppreco.setVisible(true);
						upcod.setVisible(true);
						upquantidade.setVisible(true);
						armazenamento.setVisible(true);
						uparmazenamento.setVisible(true);
						processador.setVisible(true);
						upprocessador.setVisible(true);
						tamanhoTela.setVisible(true);
						uptamanhoTela.setVisible(true);

					}
					if (p instanceof Vestuario) {
						Vestuario c = (Vestuario) p;
						uptecido.setText(c.getMaterial());
						uptamanho.setText("" + c.getTamanho());
						atributosOff(atributos);
						upatributosOff(upatributos);
						upmarca.setVisible(true);
						uppreco.setVisible(true);
						upcod.setVisible(true);
						upquantidade.setVisible(true);
						tecido.setVisible(true);
						uptecido.setVisible(true);
						uptamanho.setVisible(true);
						tamanho.setVisible(true);

					}
					if (p instanceof Maquiagem) {
						Maquiagem c = (Maquiagem) p;
						updurabilidade.setText("" + c.getDurabilidade());
						uppigmentacao.setText("" + c.getPigmentacao());
						atributosOff(atributos);
						upatributosOff(upatributos);
						upmarca.setVisible(true);
						uppreco.setVisible(true);
						upcod.setVisible(true);
						upquantidade.setVisible(true);
						updurabilidade.setVisible(true);
						durabilidade.setVisible(true);
						pigmentacao.setVisible(true);
						uppigmentacao.setVisible(true);

					}
					if (p instanceof Livro) {
						Livro c = (Livro) p;
						upqtdPag.setText("" + c.getQtdPag());
						upgenero.setText("" + c.getGenero());
						atributosOff(atributos);
						upatributosOff(upatributos);
						upmarca.setVisible(true);
						uppreco.setVisible(true);
						upcod.setVisible(true);
						upquantidade.setVisible(true);
						upqtdPag.setVisible(true);
						qtdPag.setVisible(true);
						upgenero.setVisible(true);
						genero.setVisible(true);
					}
					/*
					 * há 5 casos possíveis para este botão, um para cada conjunto de dados
					 * especificos se obtendo sua visibilidade sabe-se qual está ativa e qual o user
					 * está interagindo
					 */
					update.addActionListener(f -> {
						if (upmarca.getText().isBlank() || uppreco.getText().isBlank() || upcod.getText().isBlank()
								|| upquantidade.getText().isBlank()) {
							JOptionPane.showMessageDialog(null, "Não pode haver campos vazios");
						} else
							// Caso de verificação onde os dados básicos foram alterados
							for (Produto x : dados.getEstoque().getProdutos()) {
								if (x.getNome().equalsIgnoreCase(nome.getText().substring(6))) {
									if (upmarca.getText() != x.getMarca()) {
										x.setMarca(upmarca.getText());
									}
									if (Integer.parseInt(upcod.getText()) != x.getCod()) {
										x.setCod(Integer.parseInt(upcod.getText()));
									}
									if (Integer.parseInt(upquantidade.getText()) != x.getQtd()) {
										x.setQtd(Integer.parseInt(upquantidade.getText()));
									}
									if (Double.parseDouble(uppreco.getText()) != x.getPreco()) {
										x.setPreco(Double.parseDouble(uppreco.getText()));
									}
								}
							}
						if (data.isVisible() && peso.isVisible()) {
							// Verificação se os campos estão vazios
							if (updata.getText().isBlank() || uppeso.getText().isBlank() || updata.getText().isEmpty()
									|| uppeso.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Não pode haver campos vazios");
							} else
								/*
								 * for que percorre todos os produtos comparando o nome do produto atual e o do
								 * for quando encontra se passa uma instancia para uma variavel de controle que
								 * pertence ao tipo alimento, para que assim seja possível edital as informações
								 * do produto;
								 */
								for (Produto x : dados.getEstoque().getProdutos()) {
									if (x.getNome().equalsIgnoreCase(nome.getText().substring(6))) {
										Alimento a = (Alimento) x;
										/*
										 * caso a informação no textField seja diferente da cadastrada é feito um set
										 * com o valor disponibilizado pela field
										 */
										if (Double.parseDouble(uppeso.getText()) != a.getPeso()) {
											a.setPeso(Double.parseDouble(uppeso.getText()));
										}
										try {
											if (a.getSdf().parse(updata.getText()) != a.getDataDeValidade()) {
												a.setDataDeValidade(a.getSdf().parse(updata.getText()));
											}
										} catch (ParseException e1) {
											JOptionPane.showMessageDialog(null, "Formato de data inválido");
										}
									}

								}

						}
						if (processador.isVisible() && armazenamento.isVisible() && tamanhoTela.isVisible()) {
							if (upprocessador.getText().isBlank() || upprocessador.getText().isEmpty()
									|| uparmazenamento.getText().isBlank() || uparmazenamento.getText().isEmpty()
									|| uptamanhoTela.getText().isBlank() || uptamanhoTela.getText().isBlank()) {
								JOptionPane.showMessageDialog(null, "Não pode haver campos vazios");
							} else
								for (Produto x : dados.getEstoque().getProdutos()) {
									if (x.getNome().equalsIgnoreCase(nome.getText().substring(6))) {
										Informatica a = (Informatica) x;
										/*
										 * caso a informação no textField seja diferente da cadastrada é feito um set
										 * com o valor disponibilizado pela field
										 */
										if (Double.parseDouble(uptamanhoTela.getText()) != a.getTamanhoDaTela()) {
											a.setTamanhoDaTela(Double.parseDouble(uppeso.getText()));
										}
										if (upprocessador.getText() != a.getProcessador()) {
											a.setProcessador(upprocessador.getText());
										}
										if (Integer.parseInt(uparmazenamento.getText()) != a.getArmazenamento()) {
											a.setArmazenamento(Integer.parseInt(uparmazenamento.getText()));
										}
									}

								}
						}
						if (uptecido.isVisible() && uptamanho.isVisible()) {
							if (uptecido.getText().isBlank() || uptecido.getText().isEmpty()
									|| uptamanho.getText().isBlank() || uptamanho.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Não pode haver campos vazios");
							} else
								for (Produto x : dados.getEstoque().getProdutos()) {
									if (x.getNome().equalsIgnoreCase(nome.getText().substring(6))) {
										Vestuario a = (Vestuario) x;
										/*
										 * caso a informação no textField seja diferente da cadastrada é feito um set
										 * com o valor disponibilizado pela field
										 */
										if (uptecido.getText() != a.getMaterial()) {
											a.setMaterial(uptecido.getText());
										}
										if (Integer.parseInt(uptamanho.getText()) != a.getTamanho()) {
											a.setTamanho(Integer.parseInt(uptamanho.getText()));
										}
									}
								}
						}
						if (upgenero.isVisible() && upqtdPag.isVisible()) {
							if (upgenero.getText().isBlank() || upgenero.getText().isEmpty()
									|| upqtdPag.getText().isBlank() || upqtdPag.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Não pode haver campos vazios");
							} else
								for (Produto x : dados.getEstoque().getProdutos()) {
									if (x.getNome().equalsIgnoreCase(nome.getText().substring(6))) {
										Livro a = (Livro) x;
										/*
										 * caso a informação no textField seja diferente da cadastrada é feito um set
										 * com o valor disponibilizado pela field
										 */
										if (GenLiterario.valueOf(upgenero.getText()) != a.getGenero()) {
											a.setGenero(GenLiterario.valueOf(upgenero.getText()));
										}
										if (Integer.parseInt(upqtdPag.getText()) != a.getQtdPag()) {
											a.setQtdPag(Integer.parseInt(upqtdPag.getText()));
										}
									}
								}
						}
						if (durabilidade.isVisible() && pigmentacao.isVisible()) {
							if (updurabilidade.getText().isBlank() || updurabilidade.getText().isEmpty()
									|| uppigmentacao.getText().isBlank() || uppigmentacao.getText().isEmpty()) {
								JOptionPane.showMessageDialog(null, "Não pode haver campos vazios");
							} else
								for (Produto x : dados.getEstoque().getProdutos()) {
									if (x.getNome().equalsIgnoreCase(nome.getText().substring(6))) {
										Maquiagem a = (Maquiagem) x;
										/*
										 * caso a informação no textField seja diferente da cadastrada é feito um set
										 * com o valor disponibilizado pela field
										 */
										if (QualidadeMaterial.valueOf(updurabilidade.getText()) != a
												.getDurabilidade()) {
											a.setDurabilidade(QualidadeMaterial.valueOf(updurabilidade.getText()));
										}
										if (QualidadeMaterial.valueOf(uppigmentacao.getText()) != a.getPigmentacao()) {
											a.setPigmentacao(QualidadeMaterial.valueOf(uppigmentacao.getText()));
										}
									}
								}
						}
						
					});
				}
			}
		});

		read.add(panelDados);
	}

	public ControleDados getDados() {
		return dados;
	}

	public void atributosOff(List<JLabel> x) {
		for (JLabel c : x) {
			c.setVisible(false);
		}
	}

	public void upatributosOff(List<JTextField> x) {
		for (JTextField c : x) {
			c.setVisible(false);
		}
	}

	public void passagemDados(ControleDados x) {
		nomesProduto.clear();
		for (Produto p : x.getEstoque().getProdutos()) {
			nomesProduto.addElement(p.getNome());
		}

	}

}