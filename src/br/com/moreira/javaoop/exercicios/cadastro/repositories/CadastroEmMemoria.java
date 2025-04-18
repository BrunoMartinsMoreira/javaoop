package br.com.moreira.javaoop.exercicios.cadastro.repositories;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;
import br.com.moreira.javaoop.exercicios.cadastro.domain.exceptions.CpfInvalidoException;
import br.com.moreira.javaoop.exercicios.cadastro.domain.validators.ClienteValidator;
import br.com.moreira.javaoop.exercicios.cadastro.utils.FileManager;

import javax.swing.JOptionPane;
import java.util.*;

public class CadastroEmMemoria implements Cadastro<Cliente> {
  ArrayList<Cliente> clientes = new ArrayList<Cliente>();
  Set<Cliente> setClientes = new HashSet<Cliente>();

  @Override
  public void salvar(Cliente cliente) {
    Cliente clienteExistente = (Cliente) this.buscar(cliente.getCodigo());
    if(clienteExistente != null) {
      JOptionPane.showMessageDialog(null, cliente);
      return;
    }

    try {
      ClienteValidator.validarCpf(cliente);
    } catch (CpfInvalidoException e) {
      throw new RuntimeException(e);
    }
    this.clientes.add(cliente);
    FileManager.persistir(cliente.getNome() + ".jpg", cliente.getFoto());
    if(!this.setClientes.contains(cliente)) {
      this.setClientes.add(cliente);
    }
    clientes.sort(Cliente::compareTo);
    JOptionPane.showMessageDialog(null, cliente);
  }

  @Override
  public List<Cliente> buscar(UUID codigo) {
    this.setClientes
        .stream()
        .filter(c -> c.getCodigo().equals(codigo))
        .findFirst()
        .orElse(null);

    return Collections.singletonList(this.clientes
        .stream()
        .filter((cliente) -> cliente.getCodigo().equals(codigo))
        .findFirst()
        .orElse(null));
  }

  @Override
  public void deletar(UUID codigo) {
    this.clientes.removeIf((c) -> !c.getCodigo().equals(codigo));
  }

  @Override
  public void atualizar(Cliente c) {
    Cliente cliente = (Cliente) this.buscar(c.getCodigo());

    if(cliente != null) {
      cliente.setCpf(c.getCpf());
      cliente.setNome(c.getNome());
      cliente.setSexo(c.getSexo());
      cliente.setFoto(c.getFoto());
    }
  }
}
