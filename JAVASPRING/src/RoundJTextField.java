package com.adr.springgui.customdesign;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class RoundJTextField extends JTextField {

    private int radius;

    public RoundJTextField(int radius) {
        super();
        this.radius = radius;
        setOpaque(false);  // Hacer el componente transparente
        setBorder(new EmptyBorder(5, 10, 5, 10));  // Ajustar el espacio interno del JTextField
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, radius, radius));
        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(ConfigDesignComponents.borderColor);
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, radius, radius));
        g2.dispose();
    }
}
