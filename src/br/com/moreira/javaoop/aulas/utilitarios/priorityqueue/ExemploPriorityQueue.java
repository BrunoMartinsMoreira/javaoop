package br.com.moreira.javaoop.aulas.utilitarios.priorityqueue;

import java.util.PriorityQueue;

public class ExemploPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();

    // Adicionando elementos
    filaPrioridade.add(10);
    filaPrioridade.add(5);
    filaPrioridade.add(20);

    // Removendo elementos (sempre o menor primeiro)
    while (!filaPrioridade.isEmpty()) {
      System.out.println(filaPrioridade.poll());
    }
  }
}
