package br.com.moreira.javaoop.aulas.pacotes;

import br.com.moreira.javaoop.aulas.pacotes.produto.Produto;

public class Index {
  public static void main(String[] args) {
    System.out.println("Testando pacotes");

    Produto p;
    p = new Produto(11, 45.55, "Produto teste");
  }
}
