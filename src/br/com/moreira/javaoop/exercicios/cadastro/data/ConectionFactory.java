package br.com.moreira.javaoop.exercicios.cadastro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
  private static final String url = "jdbc:postgresql://localhost:5432/javadb";
  private static final String userName = "moreira";
  private static final String password = "moreira";

  public static Connection createConnection() {
    try {
      Class.forName("org.postgresql.Driver");
     return DriverManager.getConnection(url, userName, password);
    } catch (SQLException | ClassNotFoundException e) {
     throw new RuntimeException(e);
    }
  }
}
