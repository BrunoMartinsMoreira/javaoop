package br.com.moreira.javaoop.aulas.utilitarios.linkedlist;

import java.util.LinkedList;

public class ExemploLinkedList {
  public static void main(String[] args) {
    LinkedList<String> lista = new LinkedList<>();

    // Adicionando elementos
    lista.add("Maçã");
    lista.addFirst("Banana"); // Adiciona no início
    lista.addLast("Laranja"); // Adiciona no fim

    System.out.println("Lista: " + lista);

    // Removendo o primeiro e o último elemento
    lista.removeFirst();
    lista.removeLast();

    System.out.println("Lista após remoção: " + lista);
  }
}
