package br.com.moreira.javaoop.aulas.utilitarios.hashset;

import java.util.HashSet;

public class ExemploHashSet {
  public static void main(String[] args) {
    HashSet<String> frutas = new HashSet<>();

    // Adicionando elementos
    frutas.add("Maçã");
    frutas.add("Banana");
    frutas.add("Laranja");
    frutas.add("Maçã"); // Duplicado, não será adicionado

    System.out.println("Frutas: " + frutas);

    // Verificando se um elemento existe
    System.out.println("Contém Banana? " + frutas.contains("Banana"));
  }
}
