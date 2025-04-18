package br.com.moreira.javaoop.exercicios.cadastro.repositories;

import br.com.moreira.javaoop.exercicios.cadastro.data.ClienteDAO;
import br.com.moreira.javaoop.exercicios.cadastro.data.ConectionFactory;
import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;

import java.util.UUID;

public class CadastroPostgress implements Cadastro<Cliente>{
  @Override
  public void salvar(Cliente dadosCadastro) throws Exception {
    var connection = ConectionFactory.createConnection();
    try (connection) {
      ClienteDAO clienteDAO = new ClienteDAO(connection);
      clienteDAO.insert(dadosCadastro);
    } catch (RuntimeException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Cliente buscar(UUID codigo) {
    return null;
  }

  @Override
  public void deletar(UUID codigo) {

  }

  @Override
  public void atualizar(Cliente dadosCadastro) {

  }
}
