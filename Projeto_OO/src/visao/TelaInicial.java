package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class TelaInicial extends JFrame{
	
	private JLabel label = new JLabel();
	private ImageIcon iconLateral;
	private Border borda;
	//Componentes do Menu
	private JPanel panelMenu = new PanelArredondado(30);
	private JLabel labelMenu = new JLabel();
	
	// Componentes da Lateral
	private JPanel panelLateral = new PanelArredondado(30);
	private JLabel labelLateral = new JLabel();
	public TelaInicial() {
		//Definições básicas da tela 
		this.setLayout(null);
		this.setSize(1500, 850);
		this.setTitle("Gerência De Estoque");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(222, 184, 135));
		
		// Componente Label do Menu
		labelMenu.setText("Menu");
		labelMenu.setFont(new Font("Impact", Font.BOLD, 70));
		labelMenu.setVerticalTextPosition(JLabel.TOP);
		
		// Panel de controle do Menu
		panelMenu.setBackground(new Color(148, 103, 97));
		panelMenu.setBounds(40, 40, 400, 730);
		panelMenu.add(labelMenu);
		this.add(panelMenu);
		// Componente Label da Lateral
		labelLateral.setText("Gerência De Estoque");
		iconLateral = new ImageIcon(getClass().getResource("/visao/resources/estoque.png"));
		labelLateral.setIcon(iconLateral);
		labelLateral.setHorizontalAlignment(JLabel.CENTER);
		labelLateral.setVerticalAlignment(JLabel.CENTER);
		labelLateral.setIconTextGap(-270);
		labelLateral.setFont(new Font("Impact", Font.BOLD, 50));
		labelLateral.setHorizontalTextPosition(JLabel.RIGHT);
		
		// Panel de Controle da Lateral
		panelLateral.setBackground(new Color(255, 222, 173));
		panelLateral.setBounds(460, 40, 990, 730);
		panelLateral.setLayout(new BorderLayout());
		panelLateral.add(labelLateral);
		this.add(panelLateral);
		
		
		/*label.setText("Gerência de Estoque");
		logo = new ImageIcon(getClass().getResource("/visao/resources/estoque.png"));
		label.setIcon(logo);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setFont(new Font("", Font.BOLD, 70));
		label.setIconTextGap(-50);
		borda = BorderFactory.createLineBorder(new Color(222,184,135),40);
		label.setBorder(borda);
		this.add(label);*/
		
		this.setVisible(true);
	}
}
