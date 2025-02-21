package br.com.moreira.javaoop.aulas.utilitarios.listIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Index {
  public static void main(String[] args) {
    ArrayList<String> frutas = new ArrayList<>();
    frutas.add("Maçã");
    frutas.add("Banana");
    frutas.add("Laranja");

    ListIterator<String> iterator = frutas.listIterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    while (iterator.hasPrevious()) {
      System.out.println(iterator.previous());
    }
  }
}
