package br.com.moreira.javaoop.aulas.utilitarios.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {
  public static void main(String[] args) {
    List<Integer> numeros = new ArrayList<>();
    numeros.add(5);
    numeros.add(1);
    numeros.add(9);
    numeros.add(3);

    // Ordenando a lista
    Collections.sort(numeros);
    System.out.println("Ordenada: " + numeros);

    // Invertendo a lista
    Collections.reverse(numeros);
    System.out.println("Invertida: " + numeros);

    // Buscando o índice de um elemento
    int indice = Collections.binarySearch(numeros, 5);
    System.out.println("Índice do número 5: " + indice);
  }
}
