package br.com.moreira.javaoop.exercicios.cadastro.data;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;
import br.com.moreira.javaoop.exercicios.cadastro.domain.TipoSexo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClienteDAO {
  private final Connection connection;

  public ClienteDAO(Connection connection) {
    this.connection = connection;
  }

  public void insert(Cliente cliente) throws SQLException {
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
    }finally {
      this.connection.close();
    }
  }

  public void update(Cliente cliente) throws SQLException {
    try{
      String sql =
          """
            update clientes
            set
              nome  = ?,
              cpf   = ?,
              sexo  = ?,
              foto  = ?
            where codigo = ?
          """;

      PreparedStatement query = this.connection.prepareStatement(sql);

      query.setString(1, cliente.getNome());
      query.setString(2, cliente.getCpf());
      query.setString(3, cliente.getSexo().toString());
      query.setBytes(4, cliente.getFoto());
      query.setString(5, cliente.getCodigo().toString());

      query.execute();
    } catch (RuntimeException | SQLException e) {
      throw new RuntimeException(e);
    }finally {
      this.connection.close();
    }
  }

  public void delete(UUID codigo) throws SQLException {
    try {
      String sql =
          """
            delete from clientes where codigo = ?
          """;

      PreparedStatement query = this.connection.prepareStatement(sql);
      query.setString(1, codigo.toString());
      query.execute();
    } catch (RuntimeException | SQLException e) {
      throw new RuntimeException(e);
    }finally {
      this.connection.close();
    }
  }

  public List<Cliente> listar() throws SQLException {
    try {
      String sql =
          """
            select * from clientes;
          """;

      PreparedStatement query = this.connection.prepareStatement(sql);
      ResultSet data =  query.executeQuery();

      List<Cliente> clientes = new ArrayList<>();

      while (data.next()) {
        String codigo = data.getString("codigo");
        String nome = data.getString("nome");
        String cpf = data.getString("cpf");
        String sexo = data.getString("sexo");
        byte[] foto = data.getBytes("foto");

        Cliente cliente = new Cliente(
            UUID.fromString(codigo),
            nome,
            cpf,
            TipoSexo.valueOf(sexo),
            foto
        );
        clientes.add(cliente);
      }

      return clientes;
    } catch (RuntimeException | SQLException e) {
      throw new RuntimeException(e);
    } finally {
      this.connection.close();
    }
  }
}
