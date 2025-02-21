package br.com.moreira.javaoop.aulas.utilitarios.arrays;

import java.util.Arrays;

public class ExemploArrays {
  public static void main(String[] args) {
    int[] numeros = {5, 1, 9, 3};

    // Ordenando o array
    Arrays.sort(numeros);
    System.out.println("Array ordenado: " + Arrays.toString(numeros));

    // Buscando um elemento
    int indice = Arrays.binarySearch(numeros, 9);
    System.out.println("Índice do número 9: " + indice);

    // Convertendo array para lista
    String[] frutas = {"Maçã", "Banana", "Laranja"};
    System.out.println("Lista de frutas: " + Arrays.asList(frutas));
  }
}
