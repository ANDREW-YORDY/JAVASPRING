package com.adr.app;

import com.adr.springgui.LoginGUI;
import com.adr.springgui.customdesign.ConfigDesignComponents;
import com.adr.persistence.DBAdminConn;
import com.adr.springsecurity.services.AuthService;

public class AppMain {

    public static void main(String[] args) {
        // Crear instancia de conexión a la base de datos
        DBAdminConn dbconn = new DBAdminConn();
        AuthService authService = new AuthService(dbconn.DBGoToConnection());

        // Crear instancia de LoginGUI pasándole authService
        LoginGUI login = new LoginGUI(authService);
        ConfigDesignComponents.applyFrameStyles(login); // Aplicar estilos al JFrame
        login.setLocationRelativeTo(null);
        login.setResizable(false);

        login.setVisible(true);
    }
}
