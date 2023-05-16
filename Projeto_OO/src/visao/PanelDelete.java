package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDelete extends JPanel {
	private JLabel del = new JLabel();
	PanelDelete(){
		setBackground(new Color(255, 222, 173));
		setBounds(410, 10, 1065, 793);
		setLayout(new BorderLayout());
		del.setText("Deleção");
		del.setHorizontalAlignment(JLabel.CENTER);
		del.setVerticalAlignment(JLabel.NORTH);
		del.setFont(new Font("Impact", Font.BOLD, 50));
		del.setHorizontalTextPosition(JLabel.RIGHT);
		add(del);
	}
}