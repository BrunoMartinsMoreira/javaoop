package br.com.moreira.javaoop.exercicios.cadastro.repositories;

import br.com.moreira.javaoop.exercicios.cadastro.data.ClienteDAO;
import br.com.moreira.javaoop.exercicios.cadastro.data.ConectionFactory;
import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class CadastroPostgress implements Cadastro<Cliente>{
  @Override
  public void salvar(Cliente dadosCadastro)  {
    var connection = ConectionFactory.createConnection();
    try {
      ClienteDAO clienteDAO = new ClienteDAO(connection);
      clienteDAO.insert(dadosCadastro);
    } catch (RuntimeException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

  }

  @Override
  public List<Cliente> buscar(UUID codigo)  {
    var connection = ConectionFactory.createConnection();
    try {
      ClienteDAO clienteDAO = new ClienteDAO(connection);
      return clienteDAO.listar();
    } catch (RuntimeException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void deletar(UUID codigo)  {
    var connection = ConectionFactory.createConnection();
    try {
      ClienteDAO clienteDAO = new ClienteDAO(connection);
      clienteDAO.delete(codigo);
    } catch (RuntimeException | SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void atualizar(Cliente dadosCadastro)  {
    var connection = ConectionFactory.createConnection();
    try {
      ClienteDAO clienteDAO = new ClienteDAO(connection);
      clienteDAO.update(dadosCadastro);
    } catch (RuntimeException | SQLException e) {
      throw new RuntimeException(e);
    }

  }
}
