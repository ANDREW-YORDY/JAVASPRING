package com.adr.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAdminConn {

    private String user = "rootDB";
    private String passw = "1611propio";
    private String DB = "DBTESTcanvas";
    private String pto = "1433";
    private String ip = "localhost";

    private Connection conn = null;

    public Connection DBGoToConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String StrDB = "jdbc:sqlserver://" + ip + ":" + pto + ";" + "databaseName=" + DB + ";" + "encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(StrDB, user, passw);

            System.out.println("Successful connection to the server");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Failed connection to the server");
        }
        return conn;
    }
}
