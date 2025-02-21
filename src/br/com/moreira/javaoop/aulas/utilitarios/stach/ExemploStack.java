package br.com.moreira.javaoop.aulas.utilitarios.stach;

import java.util.Stack;

public class ExemploStack {
  public static void main(String[] args) {
    Stack<String> pilha = new Stack<>();

    // Adicionando elementos
    pilha.push("Maçã");
    pilha.push("Banana");
    pilha.push("Laranja");

    // Removendo elementos (o último adicionado é o primeiro a sair)
    while (!pilha.isEmpty()) {
      System.out.println(pilha.pop());
    }
  }
}