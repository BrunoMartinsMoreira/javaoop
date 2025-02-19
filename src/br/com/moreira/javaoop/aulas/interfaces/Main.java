package br.com.moreira.javaoop.aulas.interfaces;

import br.com.moreira.javaoop.aulas.interfaces.contrato.IBd;
import br.com.moreira.javaoop.aulas.interfaces.implementacoes.*;

public class Main {
  public static void main(String[] args) {
    IBd mySql = new MySQLDB();
    mySql.conectar("mySQL user", "mySQL password");
    mySql.executar("DELETE FROM users");
    mySql.desconectar();

    IBd postgres = new PostgreSQL();
    postgres.conectar("PostgreSQL user", "PostgreSQL password");
    postgres.executar("DELETE FROM users WHERE id IS NOT NULL");
    postgres.desconectar();
  }
}
