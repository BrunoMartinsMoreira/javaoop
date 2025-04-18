package br.com.moreira.javaoop.exercicios.cadastro.data;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
  private Connection connection;

  public ClienteDAO(Connection connection) {
    this.connection = connection;
  }

  public void insert(Cliente cliente){
    try {
      String sql =
        """
          insert into clientes (codigo, nome, cpf, sexo, foto)\s
          values(?, ?, ?, ?, ?)
        """;
      PreparedStatement query = this.connection.prepareStatement(sql);

      query.setString(1, cliente.getCodigo().toString());
      query.setString(2, cliente.getNome());
      query.setString(3, cliente.getCpf());
      query.setString(4, cliente.getSexo().toString());
      query.setBytes(5, cliente.getFoto());

      query.execute();
    } catch (RuntimeException | SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
