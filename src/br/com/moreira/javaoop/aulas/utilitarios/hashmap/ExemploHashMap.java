package br.com.moreira.javaoop.aulas.utilitarios.hashmap;

import java.util.HashMap;

public class ExemploHashMap {
  public static void main(String[] args) {
    HashMap<String, Integer> mapa = new HashMap<>();

    // Adicionando elementos
    mapa.put("Maçã", 10);
    mapa.put("Banana", 5);
    mapa.put("Laranja", 8);

    // Acessando valores
    System.out.println("Quantidade de Maçãs: " + mapa.get("Maçã"));

    // Verificando se uma chave existe
    System.out.println("Contém Banana? " + mapa.containsKey("Banana"));

    // Iterando sobre o HashMap
    mapa.forEach((chave, valor) -> System.out.println(chave + " -> " + valor));
  }
}
