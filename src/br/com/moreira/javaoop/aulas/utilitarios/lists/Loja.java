package br.com.moreira.javaoop.aulas.utilitarios.lists;

import java.util.List;

public class Loja {
  public static void main(String[] args) {
    List<Produto> produtoList = List.of(
        new Produto(1, "Sapato", 45.56),
        new Produto(2, "Bota", 450.56),
        new Produto(3, "Chinelo", 5.56),
        new Produto(4, "Tenis", 245.56)
    );
  }
}
