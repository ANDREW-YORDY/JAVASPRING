package com.adr.springsecurity.services;

import com.adr.springsecurity.utils.PasswordHasher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthService {

    private PasswordHasher passwordHasher; // Instancia de PasswordHasher para encriptar y verificar contraseñas
    private Connection dbconn; // Conexión a la base de datos

    /**
     * Constructor de AuthService.
     * @param dbconn Conexión a la base de datos utilizada para interactuar con la tabla de usuarios.
     */
    public AuthService(Connection dbconn) {
        this.dbconn = dbconn; // Asigna la conexión a la base de datos
        this.passwordHasher = new PasswordHasher(); // Inicializa el encriptador de contraseñas
    }

    /**
     * Valida si el nombre de usuario proporcionado no está vacío.
     * @param username Nombre de usuario a validar.
     * @return true si el nombre de usuario no está vacío; false de lo contrario.
     */
    public boolean validateUsername(String username) {
        return !username.trim().isEmpty();
    }

    /**
     * Valida si la contraseña proporcionada no está vacía y tiene al menos 6 caracteres.
     * @param password Contraseña a validar.
     * @return true si la contraseña no está vacía y tiene al menos 6 caracteres; false de lo contrario.
     */
    public boolean validatePassword(String password) {
        return !password.trim().isEmpty() && password.length() >= 6;
    }

    /**
     * Autentica al usuario comparando la contraseña proporcionada con la contraseña almacenada en la base de datos.
     * @param username Nombre de usuario del usuario que intenta autenticarse.
     * @param password Contraseña proporcionada por el usuario.
     * @return true si la autenticación es exitosa (las contraseñas coinciden); false de lo contrario.
     */
    public boolean authenticate(String username, String password) {
        String storedPasswordHash = getPasswordHashFromDatabase(username); // Obtener hash de la contraseña almacenada
        return storedPasswordHash != null && passwordHasher.checkPassword(password, storedPasswordHash); // Comparar contraseñas
    }

    /**
     * Obtiene el hash de la contraseña almacenada en la base de datos para el usuario especificado.
     * @param username Nombre de usuario del usuario cuya contraseña se quiere obtener.
     * @return Hash de la contraseña almacenada en la base de datos para el usuario especificado, o null si no se encuentra.
     */
    private String getPasswordHashFromDatabase(String username) {
        String sql = "SELECT password FROM users WHERE username = ?";
        try (PreparedStatement stmt = dbconn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("password"); // Devuelve el hash de la contraseña desde la base de datos
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones SQL
        }
        return null;
    }
}
