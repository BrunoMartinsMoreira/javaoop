package br.com.moreira.javaoop.aulas.utilitarios.optional;

import java.util.Optional;

public class ExemploOptional {
  public static void main(String[] args) {
    Optional<String> nome = Optional.ofNullable(null);

    // Verificando se o valor está presente
    if (nome.isPresent()) {
      System.out.println("Nome: " + nome.get());
    } else {
      System.out.println("Nome não encontrado.");
    }

    // Usando um valor padrão
    String nomePadrao = nome.orElse("Visitante");
    System.out.println("Nome: " + nomePadrao);
  }
}
