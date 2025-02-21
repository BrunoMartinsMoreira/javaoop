package br.com.moreira.javaoop.aulas.utilitarios.arraylists;

import java.util.ArrayList;

public class Loja {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    produtos.add(new Produto(1, "Sapato", 45.56));
    produtos.add(new Produto(2, "Bota", 450.56));
    produtos.add(new Produto(3, "Chinelo", 5.56));
    produtos.add(new Produto(4, "Tenis", 245.56));

    Produto p = produtos.get(1);
    produtos.remove(2);
    produtos.remove(p);
    produtos.set(2,new Produto(3, "Chinelo", 5.56));
  }

  ArrayList<Integer> inteiros = new ArrayList<Integer>();
  ArrayList<Double> doubles = new ArrayList<Double>();
  ArrayList<Float> floats = new ArrayList<Float>();
}
