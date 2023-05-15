package visao;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PanelArredondado extends JPanel {

    private int cornerRadius;
    public PanelArredondado(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        // Habilitar antialiasing para obter bordas suaves
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Preencher o fundo do painel com a cor de fundo padrão
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, width, height, cornerRadius, cornerRadius);

        // Desenhar a borda do painel
        g2d.setColor(getForeground());
        g2d.drawRoundRect(0, 0, width, height, cornerRadius, cornerRadius);

        g2d.dispose();
    }

    @Override
    public boolean isOpaque() {
        return false;
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Não pintar a borda padrão do JPanel
    }
}
