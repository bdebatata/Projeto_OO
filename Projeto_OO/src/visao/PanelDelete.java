package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controlador.ControleDados;
import modelo.Produto;

public class PanelDelete extends JPanel {
	private JLabel del = new JLabel();
	private ControleDados dados;
	private JList lista;
	private JPanel panelLista = new JPanel();
	private DefaultListModel<String> nomesProduto = new DefaultListModel<>();
	PanelDelete(ControleDados dados){
		this.dados = dados;
		for (Produto p : dados.getEstoque().getProdutos()) {
            nomesProduto.addElement(p.getNome());
        }
		
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
		panelDados.setBounds(550, 100, 500, 675);
		panelDados.setBackground(new Color(255,0, 173));
		del.add(panelDados);
	}
}