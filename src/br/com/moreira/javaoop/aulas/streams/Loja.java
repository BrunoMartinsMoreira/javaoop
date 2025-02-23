package br.com.moreira.javaoop.aulas.streams;

import java.util.ArrayList;
import java.util.Comparator;

public class Loja {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    produtos.add(new Produto(7, "Sapato", 45.56, 5));
    produtos.add(new Produto(1, "Bota", 450.56, 4));
    produtos.add(new Produto(6, "Chinelo", 5.56, 3));
    produtos.add(new Produto(5, "Tenis", 245.56, 2));
    produtos.add(new Produto(4, "Sandalia", 145.56, 2));
    produtos.add(new Produto(3, "Papete", 199.56, 2));
    produtos.add(new Produto(2, "Coturno", 1245.56, 2));

    produtos
        .stream()
        .forEach((Produto p)-> System.out.println("Lista desordenada: " + p));


    produtos
        .stream()
        .sorted(Comparator.comparingInt(Produto::getId))
        .forEach(p -> System.out.println("Lista ordernada: "+p));

    produtos
        .stream()
        .filter(p -> p.getPreco() <= 200)
        .forEach(p -> System.out.println("Filter-> " + p));

   int totalEstoque = produtos
        .stream()
        .map(produto -> produto.getQtde())
        .reduce(0, (q1,q2)-> q1 + q2 );

   System.out.println("Estoque: " + totalEstoque);

   double patrimonio  = produtos
        .stream()
        .map(produto -> produto.getQtde() * produto.getPreco())
        .reduce(0.0, (q1, q2)-> q1 + q2 );


   System.out.println("Patrimonio: R$ " + patrimonio);

  }
}
