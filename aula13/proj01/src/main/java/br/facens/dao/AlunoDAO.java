package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class AlunoDAO {
    static String url = "jdbc:mysql://localhost:3306/poo_facens";
    static String username = "profFacens";//"root";
    static String password = "aula";


    public static void conectarBD() {
        Connection connection;

        try {
            System.out.println("Conectando ao BD...");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado com sucesso!");
            connection.close();
            System.out.println("Desconectado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
