package br.com.moreira.javaoop.exercicios.cadastro.repositories;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.UUID;

public class CadastroEmMemoria implements Cadastro<Cliente> {
  ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  @Override
  public void salvar(Cliente cliente) {
    Cliente clienteExistente = this.buscar(cliente.getCodigo());
    if(clienteExistente != null) {
      JOptionPane.showMessageDialog(null, cliente);
      return;
    }

    this.clientes.add(cliente);
    JOptionPane.showMessageDialog(null, cliente);
  }

  @Override
  public Cliente buscar(UUID codigo) {
    return this.clientes
            .stream()
            .filter((cliente)-> cliente.getCodigo().equals(codigo))
            .findFirst()
            .orElse(null);
  }

  @Override
  public void deletar(UUID codigo) {
    this.clientes.removeIf((c) -> !c.getCodigo().equals(codigo));
  }

  @Override
  public void atualizar(Cliente c) {
    Cliente cliente = this.buscar(c.getCodigo());

    if(cliente != null) {
      cliente.setCpf(c.getCpf());
      cliente.setNome(c.getNome());
      cliente.setSexo(c.getSexo());
      cliente.setFoto(c.getFoto());
    }
  }
}
