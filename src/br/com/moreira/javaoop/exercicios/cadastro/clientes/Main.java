package br.com.moreira.javaoop.exercicios.cadastro.clientes;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;
import br.com.moreira.javaoop.exercicios.cadastro.presentation.TelaCadastro;
import br.com.moreira.javaoop.exercicios.cadastro.repositories.Cadastro;
import br.com.moreira.javaoop.exercicios.cadastro.repositories.CadastroEmMemoria;
import br.com.moreira.javaoop.exercicios.cadastro.repositories.CadastroPostgress;

public class Main {
  public static void main(String[] args) {
    Cadastro<Cliente> cadastroEmMemoria = new CadastroEmMemoria();
    Cadastro<Cliente> cadastroDb = new CadastroPostgress();
    TelaCadastro telaCadastro = new TelaCadastro(cadastroDb);
    telaCadastro.setVisible(true);
  }
}
