package com.adr.springsecurity.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static void main(String[] args) {
        String password = "password123"; // La contraseña que deseas hashear

        // Generar el hash de la contraseña
        String hashedPassword = encode(password);

        // Imprimir el hash generado
        System.out.println("Contraseña original: " + password);
        System.out.println("Contraseña hasheada: " + hashedPassword);

        // Ejemplo de verificación de contraseña
        String rawPassword = "password123";
        String storedPasswordHash = hashedPassword; // Simula el hash almacenado en la base de datos

        boolean passwordMatches = checkPassword(rawPassword, storedPasswordHash);
        System.out.println("¿La contraseña coincide? " + passwordMatches);
    }

    // Método para generar el hash de la contraseña
    public static String encode(String password) {
        return passwordEncoder.encode(password);
    }

    // Método para verificar si la contraseña sin hashear coincide con el hash almacenado
    public static boolean checkPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
