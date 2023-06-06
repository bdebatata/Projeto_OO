package visao;

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

import controlador.ControleDados;
import modelo.Alimento;
import modelo.Informatica;
import modelo.Livro;
import modelo.Maquiagem;
import modelo.Produto;
import modelo.Vestuario;

public class PanelDelete extends JPanel {
	private JLabel del = new JLabel();
	private ControleDados dados;
	private JList lista;
	private JPanel panelLista = new JPanel();
	private DefaultListModel<String> nomesProduto = new DefaultListModel<>();
	PanelDelete(ControleDados dados){
		this.dados = dados;
		passagemDados(dados);
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(new BorderLayout());
		del.setText("Deleção");
		del.setHorizontalAlignment(JLabel.CENTER);
		del.setVerticalAlignment(JLabel.NORTH);
		del.setFont(new Font("Impact", Font.BOLD, 50));
		del.setHorizontalTextPosition(JLabel.RIGHT);
		add(del);
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
        del.add(panelLista);
        
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
		JLabel nome = new JLabel();
		nome.setText("Nome: ");
		nome.setFont(new Font("Impact", Font.BOLD, 30));
		nome.setBounds(50,50,300,50);
		panelDados.add(nome);
		
		JLabel preco = new JLabel();
		preco.setText("Preço: ");
		preco.setFont(new Font("Impact", Font.BOLD, 30));
		preco.setBounds(50,90,300,50);
		panelDados.add(preco);
		
		JLabel quantidade = new JLabel();
		quantidade.setText("Quantidade: ");
		quantidade.setFont(new Font("Impact", Font.BOLD, 30));
		quantidade.setBounds(50,130,300,50);
		panelDados.add(quantidade);
		
		JLabel cod = new JLabel();
		cod.setText("Código: ");
		cod.setFont(new Font("Impact", Font.BOLD, 30));
		cod.setBounds(50,170,300,50);
		panelDados.add(cod);
		
		JLabel marca = new JLabel();
		marca.setText("Marca: ");
		marca.setFont(new Font("Impact", Font.BOLD, 30));
		marca.setBounds(50,210,500,50);
		panelDados.add(marca);
		// Labels especificas de cada tipo de produto
		// Alimento
		JLabel data = new JLabel();
		data.setText("Data: ");
		data.setFont(new Font("Impact", Font.BOLD, 30));
		data.setBounds(50,250,500,50);
		data.setVisible(false);
		panelDados.add(data);
		
		JLabel peso = new JLabel();
		peso.setText("Peso: ");
		peso.setFont(new Font("Impact", Font.BOLD, 30));
		peso.setBounds(50,290,500,50);
		peso.setVisible(false);
		panelDados.add(peso);
		
		// Informatica
		JLabel tamanhoTela = new JLabel();
		tamanhoTela.setText("Tamanho da tela: ");
		tamanhoTela.setFont(new Font("Impact", Font.BOLD, 30));
		tamanhoTela.setBounds(50,250,500,50);
		tamanhoTela.setVisible(false);
		panelDados.add(tamanhoTela);
		
		JLabel armazenamento = new JLabel();
		armazenamento.setText("Armazenamento: ");
		armazenamento.setFont(new Font("Impact", Font.BOLD, 30));
		armazenamento.setBounds(50,290,500,50);
		armazenamento.setVisible(false);
		panelDados.add(armazenamento);
		
		JLabel processador = new JLabel();
		processador.setText("processador: ");
		processador.setFont(new Font("Impact", Font.BOLD, 30));
		processador.setBounds(50,330,500,50);
		processador.setVisible(false);
		panelDados.add(processador);
		
		// Maquiagem
		JLabel durabilidade = new JLabel();
		durabilidade.setText("Durabilidade: ");
		durabilidade.setFont(new Font("Impact", Font.BOLD, 30));
		durabilidade.setBounds(50,250,500,50);
		durabilidade.setVisible(false);
		panelDados.add(durabilidade);
		
		JLabel pigmentacao = new JLabel();
		pigmentacao.setText("Pigmentação: ");
		pigmentacao.setFont(new Font("Impact", Font.BOLD, 30));
		pigmentacao.setBounds(50,290,500,50);
		pigmentacao.setVisible(false);
		panelDados.add(pigmentacao);
		
		// Vestuário
		JLabel tecido = new JLabel();
		tecido.setText("Tecido/Material: ");
		tecido.setFont(new Font("Impact", Font.BOLD, 30));
		tecido.setBounds(50,250,500,50);
		tecido.setVisible(false);
		panelDados.add(tecido);
		
		JLabel tamanho = new JLabel();
		tamanho.setText("Tamanho: ");
		tamanho.setFont(new Font("Impact", Font.BOLD, 30));
		tamanho.setBounds(50,290,500,50);
		tamanho.setVisible(false);
		panelDados.add(tamanho);
		
		// Livro 
		JLabel genero = new JLabel();
		genero.setText("Gênero Literário: ");
		genero.setFont(new Font("Impact", Font.BOLD, 30));
		genero.setBounds(50,250,500,50);
		genero.setVisible(false);
		panelDados.add(genero);
		
		JLabel qtdPag = new JLabel();
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
							preco.setText("Preco: R$"+p.getPreco());
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
		del.add(panelDados);
	}
	public void atributosOff(List<JLabel> x) {
		for(JLabel c: x) {
			c.setVisible(false);
		}
	}
	public void passagemDados(ControleDados x) {
		for (Produto p : x.getEstoque().getProdutos()) {
            nomesProduto.addElement(p.getNome());
        }
	}
}