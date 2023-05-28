package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelUpdate extends JPanel {
	private JLabel upt = new JLabel();
	PanelUpdate(){
		setBackground(new Color(255, 222, 173));
		setLayout(new BorderLayout());
		setBounds(410, 10, 1065, 793);
		upt.setText("Atualização de dados");
		upt.setHorizontalAlignment(JLabel.CENTER);
		upt.setVerticalAlignment(JLabel.NORTH);
		upt.setFont(new Font("Impact", Font.BOLD, 50));
		upt.setHorizontalTextPosition(JLabel.RIGHT);
		add(upt);
	}
}
