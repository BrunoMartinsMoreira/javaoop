package br.com.moreira.javaoop.aulas.lambdas.ex2;

import br.com.moreira.javaoop.aulas.utilitarios.arraylists.Produto;

import java.util.ArrayList;

public class Loja {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<br.com.moreira.javaoop.aulas.utilitarios.arraylists.Produto>();

    produtos.add(new Produto(1, "Sapato", 45.56));
    produtos.add(new Produto(2, "Bota", 450.56));
    produtos.add(new Produto(3, "Chinelo", 5.56));
    produtos.add(new Produto(4, "Tenis", 245.56));

    produtos.forEach((p) -> {
      p.setPreco(p.getPreco() * 1.25);
    });
  }
}

