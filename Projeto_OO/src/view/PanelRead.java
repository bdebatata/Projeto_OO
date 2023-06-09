package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.ControleDados;
import model.Alimento;
import model.Informatica;
import model.Livro;
import model.Maquiagem;
import model.Produto;
import model.Vestuario;
/**
 * 
 * Classe que herda de JPanel, e utilizada na classe TelaInicial como um JPanel
 * e fica responsavel pela funcionalidade de mostrar os dados de Produtos
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * 
 * @see Produto
 * @see TelaInicial
 *
 */
public class PanelRead extends JPanel {
	private JLabel read = new JLabel();
	private ControleDados dados;
	private JList<String> lista;
	private DefaultListModel<String> nomesProduto = new DefaultListModel<>();
	private JLabel nome;
	private JLabel preco;
	private JLabel marca;
	private JLabel cod;
	private JLabel quantidade;
	private JLabel peso;
	private JLabel data;
	private JLabel tamanhoTela;
	private JLabel armazenamento;
	private JLabel processador;
	private JLabel durabilidade;
	private JLabel pigmentacao;
	private JLabel tecido;
	private JLabel tamanho;
	private JLabel genero;
	private JLabel qtdPag;
	/**
	 * Construtor da classe, adiciona todos os componentes ao JPanel e implementa
	 * a logica de mostrar todos os dados de um selecionado Produto, onde e utilizado um JList
	 * com todos os nomes de Produtos cadastrados.
	 * @param dados Dados que serao passados pela TelaInicial
	 */
	public PanelRead(ControleDados dados){
		this.dados = dados;
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(new BorderLayout());
		read.setText("Produtos Cadastrados");
		read.setHorizontalAlignment(JLabel.CENTER);
		read.setVerticalAlignment(JLabel.NORTH);
		read.setFont(new Font("Impact", Font.BOLD, 50));
		read.setHorizontalTextPosition(JLabel.RIGHT);
		add(read);
		// Panel que mostra a lista de produtos cadastrados
				JPanel panelLista = new JPanel();
		        panelLista.setBounds(30, 100, 500, 675);
		        panelLista.setBackground(new Color(255,222, 173));
		        panelLista.setLayout(null);
		        lista = new JList<>(nomesProduto);
				JScrollPane scrollPane = new JScrollPane(lista);
		        scrollPane.setBounds(0,0,500,657);
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
				titulo.setBounds(200,0,100,50);
				titulo.setFont(new Font("Impact", Font.BOLD, 30));
				panelDados.add(titulo);
				// Dados básicos de cada produto
				nome = new JLabel();
				nome.setText("Nome: ");
				nome.setFont(new Font("Impact", Font.BOLD, 30));
				nome.setBounds(50,50,400,50);
				panelDados.add(nome);
				
				preco = new JLabel();
				preco.setText("Preço: ");
				preco.setFont(new Font("Impact", Font.BOLD, 30));
				preco.setBounds(50,90,300,50);
				panelDados.add(preco);
				
				quantidade = new JLabel();
				quantidade.setText("Quantidade: ");
				quantidade.setFont(new Font("Impact", Font.BOLD, 30));
				quantidade.setBounds(50,130,300,50);
				panelDados.add(quantidade);
				
				cod = new JLabel();
				cod.setText("Código: ");
				cod.setFont(new Font("Impact", Font.BOLD, 30));
				cod.setBounds(50,170,300,50);
				panelDados.add(cod);
				
				marca = new JLabel();
				marca.setText("Marca: ");
				marca.setFont(new Font("Impact", Font.BOLD, 30));
				marca.setBounds(50,210,500,50);
				panelDados.add(marca);
				// Labels especificas de cada tipo de produto
				// Alimento
				data = new JLabel();
				data.setText("Data: ");
				data.setFont(new Font("Impact", Font.BOLD, 30));
				data.setBounds(50,250,500,50);
				data.setVisible(false);
				panelDados.add(data);
				
				peso = new JLabel();
				peso.setText("Peso: ");
				peso.setFont(new Font("Impact", Font.BOLD, 30));
				peso.setBounds(50,290,500,50);
				peso.setVisible(false);
				panelDados.add(peso);
				
				// Informatica
				tamanhoTela = new JLabel();
				tamanhoTela.setText("Tamanho da tela: ");
				tamanhoTela.setFont(new Font("Impact", Font.BOLD, 30));
				tamanhoTela.setBounds(50,250,500,50);
				tamanhoTela.setVisible(false);
				panelDados.add(tamanhoTela);
				
				armazenamento = new JLabel();
				armazenamento.setText("Armazenamento: ");
				armazenamento.setFont(new Font("Impact", Font.BOLD, 30));
				armazenamento.setBounds(50,290,500,50);
				armazenamento.setVisible(false);
				panelDados.add(armazenamento);
				
				processador = new JLabel();
				processador.setText("processador: ");
				processador.setFont(new Font("Impact", Font.BOLD, 30));
				processador.setBounds(50,330,500,50);
				processador.setVisible(false);
				panelDados.add(processador);
				
				// Maquiagem
				durabilidade = new JLabel();
				durabilidade.setText("Durabilidade: ");
				durabilidade.setFont(new Font("Impact", Font.BOLD, 30));
				durabilidade.setBounds(50,250,500,50);
				durabilidade.setVisible(false);
				panelDados.add(durabilidade);
				
				pigmentacao = new JLabel();
				pigmentacao.setText("Pigmentação: ");
				pigmentacao.setFont(new Font("Impact", Font.BOLD, 30));
				pigmentacao.setBounds(50,290,500,50);
				pigmentacao.setVisible(false);
				panelDados.add(pigmentacao);
				
				// Vestuário
				tecido = new JLabel();
				tecido.setText("Tecido/Material: ");
				tecido.setFont(new Font("Impact", Font.BOLD, 30));
				tecido.setBounds(50,250,500,50);
				tecido.setVisible(false);
				panelDados.add(tecido);
				
				tamanho = new JLabel();
				tamanho.setText("Tamanho: ");
				tamanho.setFont(new Font("Impact", Font.BOLD, 30));
				tamanho.setBounds(50,290,500,50);
				tamanho.setVisible(false);
				panelDados.add(tamanho);
				
				// Livro 
				genero = new JLabel();
				genero.setText("Gênero Literário: ");
				genero.setFont(new Font("Impact", Font.BOLD, 30));
				genero.setBounds(50,250,500,50);
				genero.setVisible(false);
				panelDados.add(genero);
				
				qtdPag = new JLabel();
				qtdPag.setText("Quantidade de páginas: ");
				qtdPag.setFont(new Font("Impact", Font.BOLD, 30));
				qtdPag.setBounds(50,290,500,50);
				qtdPag.setVisible(false);
				panelDados.add(qtdPag);
				
				/* Criação de uma lista que junta todos
					os atributos especificos para que assim
					eu consiga mudar a visibilidade de todos
					para que não haja conflito entre várias JLabels
				*/
				List<JLabel> atributos = new ArrayList<>(); 
				// Atributos de Alimento
				atributos.add(data);
				atributos.add(peso);
				//Atributos de Informatica
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
				
				lista.addListSelectionListener(
						e->{
							Object index = lista.getSelectedValue();
							for(Produto p : dados.getEstoque().getProdutos()) {
								if(p.getNome()==index) {
									nome.setText("Nome: "+ p.getNome());
									preco.setText("Preco: R$"+String.format("%.2f", p.getPreco()));
									quantidade.setText("Quantidade: "+p.getQtd());
									marca.setText("Marca: "+p.getMarca());
									cod.setText("Código: "+p.getCod());
									if(p instanceof Alimento) {
										Alimento c = (Alimento) p;
										peso.setText("Peso: "+c.getPeso()+"g");
										data.setText("Data de validade: "+ c.getSdf().format(c.getDataDeValidade()));
										atributosOff(atributos);
										data.setVisible(true);
										peso.setVisible(true);
										
									}
									if(p instanceof Informatica) {
										Informatica c = (Informatica) p;
										armazenamento.setText("Armazenamento: "+c.getArmazenamento()+"GB");
										processador.setText("Processador: "+c.getProcessador());
										tamanhoTela.setText("Tamanho da Tela: "+c.getTamanhoDaTela()+" polegadas");
										atributosOff(atributos);
										armazenamento.setVisible(true);
										processador.setVisible(true);
										tamanhoTela.setVisible(true);
									}
									if(p instanceof Vestuario) {
										Vestuario c = (Vestuario) p;
										tecido.setText("Tecido/Material: "+ c.getMaterial());
										tamanho.setText("Tamanho: "+c.getTamanho());
										atributosOff(atributos);
										tecido.setVisible(true);
										tamanho.setVisible(true);
									}
									if(p instanceof Maquiagem) {
										Maquiagem c = (Maquiagem) p;
										durabilidade.setText("Durabilidade: "+ c.getDurabilidade());
										pigmentacao.setText("Pigmentação: "+c.getPigmentacao());
										atributosOff(atributos);
										durabilidade.setVisible(true);
										pigmentacao.setVisible(true);
									}
									if(p instanceof Livro) {
										Livro c = (Livro) p;
										qtdPag.setText("Quantidade de páginas: "+ c.getQtdPag());
										genero.setText("Gênero literário: "+c.getGenero());
										atributosOff(atributos);
										qtdPag.setVisible(true);
										genero.setVisible(true);
									}
								}
								
							}
						}
				
						);
				read.add(panelDados);
	}
	
	/**
	 * Metodo que altera para falso a visibilidade de todos os JLabels contidos na
	 * lista
	 * 
	 * @param listJPanel Lista que contem JLabels
	 */
	public void atributosOff(List<JLabel> listJLabel) {
		for (JLabel c : listJLabel) {
			c.setVisible(false);
		}
	}
	/**
	 * Metodo de passagem de dados, limpa a JList e adiciona todos os nomes de
	 * produtos contidos na lista que se obtem a partir do ControleDados
	 * 
	 * @param dados ControleDados que se obteve com o construtor da classe
	 * @see ControleDados
	 */
	public void passagemDados(ControleDados dados) {
		nomesProduto.clear();
		for (Produto p : dados.getEstoque().getProdutos()) {
            nomesProduto.addElement(p.getNome());
        }
	}
	
	public JLabel getRead() {
		return read;
	}

	public void setRead(JLabel read) {
		this.read = read;
	}

	public ControleDados getDados() {
		return dados;
	}

	public void setDados(ControleDados dados) {
		this.dados = dados;
	}

	public JList<String> getLista() {
		return lista;
	}

	public void setLista(JList<String> lista) {
		this.lista = lista;
	}

	public DefaultListModel<String> getNomesProduto() {
		return nomesProduto;
	}

	public void setNomesProduto(DefaultListModel<String> nomesProduto) {
		this.nomesProduto = nomesProduto;
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

	public JLabel getMarca() {
		return marca;
	}

	public void setMarca(JLabel marca) {
		this.marca = marca;
	}

	public JLabel getCod() {
		return cod;
	}

	public void setCod(JLabel cod) {
		this.cod = cod;
	}

	public JLabel getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(JLabel quantidade) {
		this.quantidade = quantidade;
	}

	public JLabel getPeso() {
		return peso;
	}

	public void setPeso(JLabel peso) {
		this.peso = peso;
	}

	public JLabel getData() {
		return data;
	}

	public void setData(JLabel data) {
		this.data = data;
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