package com.adr.springgui.customdesign;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ConfigDesignComponents {

    public static Color primaryColorAzul = new Color(63, 81, 181);  
    public static Color gradientStartColor = new Color(255, 193, 7);  
    public static Color gradientEndColor = new Color(255, 87, 34);  
    public static Color borderColor = Color.BLACK;  
    public static int borderRadius = 15;  // Ajustado para bordes redondeados más sutiles

    public static void applyFrameStyles(JFrame frame) {
        frame.getContentPane().setBackground(primaryColorAzul);  // Aplicar color de fondo
    }

    public static void configureButton(JButton button) {
        button.setBorder(new LineBorder(borderColor, 2));  // Configurar borde para JButton
        button.setOpaque(true);  // Asegurar que el fondo sea visible
        button.setBackground(primaryColorAzul);  // Color de fondo del botón
        button.setForeground(Color.WHITE);  // Color de texto del botón
    }

    public static void configureTextField(JTextField textField) {
        textField.setBorder(new LineBorder(borderColor, 1));  // Configurar borde para JTextField
        textField.setBackground(Color.WHITE);  // Color de fondo del JTextField
        textField.setForeground(borderColor);  // Color de texto del JTextField
    }
}
