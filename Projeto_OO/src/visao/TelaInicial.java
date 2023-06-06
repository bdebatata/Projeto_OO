package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControleDados;


public class TelaInicial extends JFrame{
	private ControleDados dados;
	//Componentes do Menu
	private JPanel panelMenu = new JPanel();
	private JLabel labelMenu = new JLabel();
	private JButton cadButton = new JButton("Cadastro de Produtos");
	private JButton delButton = new JButton("Deletar um produto");
	private JButton readButton = new JButton("Produtos Cadastrados");
	private JButton upButton = new JButton("Atualizar dados de um produto");
	private JTextField searchBar = new JTextField();
	private JButton searchButton = new JButton("Pesquisar");
	// Componentes da Lateral
	private JPanel panelLateral = new JPanel();
	private JLabel labelLateral = new JLabel();
	private ImageIcon iconLateral;
	// Telas 
	private JPanel cadPanel;
	private JPanel delPanel;
	private JPanel readPanel;
	private JPanel upPanel = new PanelUpdate();
	private List<JPanel> telas = new ArrayList<>();

	public TelaInicial(ControleDados dados) {
		//Definições básicas da tela 
		this.dados = dados;
		cadPanel = new PanelCadastro(dados);
		delPanel = new PanelDelete(dados);
		readPanel = new PanelRead(dados);
		
		// teste
		
		delPanel = new PanelDelete(dados);
		this.setSize(1500, 850);
		this.setTitle("Gerência De Estoque");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(222, 184, 135));
		// Adições das telas
		telas.add(panelLateral);
		telas.add(cadPanel);
		telas.add(delPanel);
		telas.add(readPanel);
		telas.add(upPanel);
		
		// Componente Label do Menu
		labelMenu.setText("Menu");
		labelMenu.setFont(new Font("Impact", Font.BOLD, 70));
		labelMenu.setVerticalTextPosition(JLabel.TOP);
		labelMenu.setAlignmentX(CENTER_ALIGNMENT);
		labelMenu.setHorizontalTextPosition(JLabel.CENTER);

		// Panel de controle do Menu
		panelMenu.setBackground(new Color(148, 103, 97));
		panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));
		panelMenu.setBounds(0, 0, 400, 850);
		
		// Adição dos botões e espaçamento entre eles
        panelMenu.add(labelMenu);
        panelMenu.add(Box.createVerticalStrut(10)); 
        panelMenu.add(searchBar);
        panelMenu.add(Box.createVerticalStrut(5));
        panelMenu.add(searchButton);
        panelMenu.add(Box.createVerticalStrut(5));
        panelMenu.add(cadButton);
        panelMenu.add(Box.createVerticalStrut(5));
        panelMenu.add(delButton);
        panelMenu.add(Box.createVerticalStrut(5));
        panelMenu.add(readButton);
        panelMenu.add(Box.createVerticalStrut(5));
        panelMenu.add(upButton);
        panelMenu.add(Box.createVerticalGlue());
        
		// centralização dos botões
		cadButton.setAlignmentX(0.5f);
		delButton.setAlignmentX(0.5f);
		readButton.setAlignmentX(0.5f);
		upButton.setAlignmentX(0.5f);
		searchButton.setAlignmentX(0.5f);
		// Alterando a cor dos botões
		cadButton.setBackground(new Color(255, 222, 173));
		cadButton.setMaximumSize(new Dimension(200, 150));
		delButton.setBackground(new Color(255, 222, 173));
		delButton.setMaximumSize(new Dimension(200, 150));
		readButton.setBackground(new Color(255, 222, 173));
		readButton.setMaximumSize(new Dimension(200, 150));
		upButton.setBackground(new Color(255, 222, 173));
		upButton.setMaximumSize(new Dimension(200, 150));
		searchButton.setBackground(new Color(255, 222, 173));
		searchButton.setMaximumSize(new Dimension(200, 150));
		searchBar.setMaximumSize(new Dimension(200, 150));
		this.add(panelMenu);
		
		// Componente Label da Lateral
		labelLateral.setText("Gerência De Estoque");
		iconLateral = new ImageIcon(getClass().getResource("/visao/resources/estoque.png"));
		labelLateral.setIcon(iconLateral);
		labelLateral.setHorizontalAlignment(JLabel.LEFT);
		labelLateral.setVerticalAlignment(JLabel.CENTER);
		labelLateral.setIconTextGap(-270);
		labelLateral.setFont(new Font("Impact", Font.BOLD, 50));
		labelLateral.setHorizontalTextPosition(JLabel.RIGHT);
		
		// Panel de Controle da Lateral
		panelLateral.setBackground(new Color(255, 222, 173));
		panelLateral.setBounds(410, 10, 1065, 793);
		panelLateral.setLayout(new BorderLayout());
		panelLateral.add(labelLateral);
		panelLateral.setVisible(true);
		// Ativação das telas
		AtivaTelas();
		// Ações dos botões
		cadButton.addActionListener(
				e->{
				for(JPanel c : telas ) {
					if(c instanceof PanelCadastro) {
						c.setVisible(true);
					}else
						c.setVisible(false);
					
				};});
		delButton.addActionListener(
				e->{
					for(JPanel c : telas ) {
						if(c instanceof PanelDelete) {
							c.setVisible(true);
						}else
							c.setVisible(false);
				}});
		readButton.addActionListener(
				e->{
					for(JPanel c: telas) {
						if(c instanceof PanelRead) {
							c.setVisible(true);
						} else
							c.setVisible(false);
					}
				}
				);
		upButton.addActionListener(
				e->{
					for(JPanel c : telas ) {
						if(c instanceof PanelUpdate) {
							c.setVisible(true);
						}else
							c.setVisible(false);
					}
				}
				);
		
		this.setVisible(true);
	}
	
	
	private void AtivaTelas() {
		for(JPanel c : telas ) {
			this.add(c);
			c.setVisible(false);
		}
		panelLateral.setVisible(true);
	}
}
