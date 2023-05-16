package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCadastro extends JPanel {
	private JLabel cad = new JLabel();
	
	PanelCadastro(){
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(new BorderLayout());
		cad.setText("Cadastro ");
		cad.setHorizontalAlignment(JLabel.CENTER);
		cad.setVerticalAlignment(JLabel.NORTH);
		cad.setFont(new Font("Impact", Font.BOLD, 50));
		cad.setHorizontalTextPosition(JLabel.RIGHT);
		add(cad);
	}
	
}
