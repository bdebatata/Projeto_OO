package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class PanelRead extends JPanel {
	private JLabel read = new JLabel();
	PanelRead(){
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(new BorderLayout());
		read.setText("Produtos Cadastrados");
		read.setHorizontalAlignment(JLabel.CENTER);
		read.setVerticalAlignment(JLabel.NORTH);
		read.setFont(new Font("Impact", Font.BOLD, 50));
		read.setHorizontalTextPosition(JLabel.RIGHT);
		add(read);
		// Uso do JList!!!!!!!!!
		JList lista = new JList();
		
	}
}