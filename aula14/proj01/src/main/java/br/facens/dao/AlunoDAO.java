package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import br.facens.model.Aluno;

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

    public static void criarTabela() {
        try (
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
        ) {
            String sql = "create table aluno (id int, nome varchar(140), email varchar(100));";
                        
            statement.executeUpdate(sql);
            System.out.println("Tabela criada!");
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static boolean inserir(Aluno aluno) {
        String sql = "insert into aluno (id, nome, email) values(?,?,?);";

        try (
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, aluno.getId());
            preparedStatement.setString(2, aluno.getNome());
            preparedStatement.setString(3, aluno.getEmail());

            preparedStatement.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
