package br.com.moreira.javaoop.exercicios.cadastro.clientes;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;
import br.com.moreira.javaoop.exercicios.cadastro.presentation.TelaCadastro;
import br.com.moreira.javaoop.exercicios.cadastro.repositories.Cadastro;
import br.com.moreira.javaoop.exercicios.cadastro.repositories.CadastroEmMemoria;

public class Main {
  public static void main(String[] args) {
    Cadastro<Cliente> cadastroEmMemoria = new CadastroEmMemoria();
    TelaCadastro telaCadastro = new TelaCadastro(cadastroEmMemoria);
    telaCadastro.setVisible(true);
  }
}
