
package br.com.formulariodoencas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConfiguracaoBancoDeDados {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    private static final String DB_NAME = "sosrs";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); Statement stmt = conn.createStatement()) {

            // Criar o banco de dados
            String criarBancoDeDados = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
            stmt.executeUpdate(criarBancoDeDados);

            // Usar o banco de dados
            String usarBancoDeDados = "USE " + DB_NAME;
            stmt.executeUpdate(usarBancoDeDados);

            // Criar a tabela doencas
            String criarTabelaDoencas = "CREATE TABLE IF NOT EXISTS doencas ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(255) NOT NULL,"
                    + "descricao TEXT"
                    + ")";
            stmt.executeUpdate(criarTabelaDoencas);

            // Criar a tabela sintomas
            String criarTabelaSintomas = "CREATE TABLE IF NOT EXISTS sintomas ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(255) NOT NULL,"
                    + "descricao TEXT"
                    + ")";
            stmt.executeUpdate(criarTabelaSintomas);

            // Criar a tabela doenca_sintoma
            String criarTabelaDoencaSintoma = "CREATE TABLE IF NOT EXISTS doenca_sintoma ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "doenca_id INT NOT NULL,"
                    + "sintoma_id INT NOT NULL,"
                    + "FOREIGN KEY (doenca_id) REFERENCES doencas(id),"
                    + "FOREIGN KEY (sintoma_id) REFERENCES sintomas(id)"
                    + ")";
            stmt.executeUpdate(criarTabelaDoencaSintoma);

            System.out.println("Banco de dados e tabelas criados com sucesso.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
