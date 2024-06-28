package com.adr.springapp;

import com.adr.springgui.LoginGUI;
import com.adr.springgui.customdesign.ConfigDesignComponents;
import com.adr.springgui.customdesign.RoundJTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class AppMain {

    public static void main(String[] args) {
        LoginGUI login = new LoginGUI();
        ConfigDesignComponents.applyFrameStyles(login);  // Aplicar estilos al JFrame

        // Configurar RoundJTextField para username y password
        RoundJTextField usernameField = new RoundJTextField(15);
        ConfigDesignComponents.configureTextField(usernameField);
        RoundJTextField passwordField = new RoundJTextField(15);
        ConfigDesignComponents.configureTextField(passwordField);

        // Añadir componentes personalizados al panel existente
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.add(usernameField, BorderLayout.NORTH);
        contentPanel.add(passwordField, BorderLayout.CENTER);

        login.add(contentPanel);
        login.setVisible(true);
    }
}
