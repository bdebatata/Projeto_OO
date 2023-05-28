package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelCadastro extends JPanel {
	private JLabel cad = new JLabel();
	private JPanel cadPanel= new JPanel();
	private JButton alimento = new JButton("Alimento");
	private JButton vestuario = new JButton("Vestuário");
	private JButton informatica = new JButton("Informática");
	private JButton livro = new JButton("Livro");
	private JButton maquiagem = new JButton("Maquiagem");
	
	private JButton cadastrar = new JButton("Cadastrar");
	
	PanelCadastro(){
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
        cadPanel.setLayout(new FlowLayout());
        cadPanel.add(alimento);
        cadPanel.add(informatica);
        cadPanel.add(vestuario);
        cadPanel.add(maquiagem);
        cadPanel.add(livro);
        //Alteração das cores dos botões
        alimento.setBackground(new Color(148, 103, 97));
        alimento.setFont(new Font("Impact", Font.PLAIN, 20));
        informatica.setBackground(new Color(148, 103, 97));
        informatica.setFont(new Font("Impact", Font.PLAIN, 20));
        vestuario.setBackground(new Color(148, 103, 97));
        vestuario.setFont(new Font("Impact", Font.PLAIN, 20));
        maquiagem.setBackground(new Color(148, 103, 97));
        maquiagem.setFont(new Font("Impact", Font.PLAIN, 20));
        livro.setBackground(new Color(148, 103, 97));
        livro.setFont(new Font("Impact", Font.PLAIN, 20));
        // TextFields e seus rótulos
        
        JPanel infoPanel = new JPanel();
        infoPanel.setBorder(new EmptyBorder(30,0,0,0));
        infoPanel.setBackground(new Color(255, 222, 173));
        infoPanel.setLayout(new GridLayout(3,1));
        // Criar e configurar o rótulo e o campo de texto
        JLabel rotNome = new JLabel("Nome: ");
        rotNome.setFont(new Font("Impact", Font.BOLD, 30));
        JTextField nome = new JTextField();
        nome.setFont(new Font("Impact", Font.PLAIN, 20));
            
        
        JLabel rotPreco = new JLabel("Preço: ");
        rotPreco.setFont(new Font("Impact", Font.BOLD, 30));
        JTextField preco = new JTextField();
        preco.setFont(new Font("Impact", Font.PLAIN, 20));
     
       
        JLabel rotQuantidade = new JLabel("Quantidade: ");
        rotQuantidade.setFont(new Font("Impact", Font.BOLD, 30));
        JTextField quantidade = new JTextField();
        quantidade.setFont(new Font("Impact", Font.PLAIN, 20));
        
        
        
        JLabel rotMarca = new JLabel("Marca: ");
        rotMarca.setFont(new Font("Impact", Font.BOLD, 30));
        JTextField marca = new JTextField();
        marca.setFont(new Font("Impact", Font.PLAIN, 20));
        
       
        
        JLabel rotCod = new JLabel("Código: ");
        rotCod.setFont(new Font("Impact", Font.BOLD, 30));
        JTextField cod = new JTextField();
        cod.setFont(new Font("Impact", Font.PLAIN, 20));
        
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
        cadPanel.add(infoPanel);
        // Adição do painel de botões ao centro do BorderLayout
        add(cadPanel, BorderLayout.CENTER);
        // Adição do rótulo de cadastro ao topo do BorderLayout
        add(cad, BorderLayout.NORTH);
        // Panels de controle da tela de cadastro 
        JPanel panelAlimento = new JPanel();
        panelAlimento.setBorder(new EmptyBorder(30,0,0,0));
		panelAlimento.setBackground(new Color(255, 222, 173));
		panelAlimento.setLayout(new GridLayout(3,1));
		JLabel rotPeso = new JLabel("Peso: ");
        rotPeso.setFont(new Font("Impact", Font.BOLD, 30));
        JTextField peso = new JTextField();
        peso.setFont(new Font("Impact", Font.PLAIN, 20));
        panelAlimento.add(rotPeso);
        panelAlimento.add(peso);
		JLabel rotData = new JLabel("Data de Validade: ");
        rotData.setFont(new Font("Impact", Font.BOLD, 30));
        JTextField data = new JTextField();
        data.setFont(new Font("Impact", Font.PLAIN, 20));
        panelAlimento.add(rotData);
        panelAlimento.add(data);
        alimento.addActionListener(
        		e-> {
        			cadPanel.add(panelAlimento);
        			cadPanel.setVisible(false);
        			cadPanel.setVisible(true);
        		}
        		);
        // Controle da tela de livros
       
	}
	
}
