package br.com.moreira.javaoop.exercicios.folhadepagamento.ui;

import br.com.moreira.javaoop.exercicios.folhadepagamento.core.*;

public class Main {
  public static void main(String[] args) {
    Funcionario funcionarios[] = new Funcionario[5];

    funcionarios[0] = new Chefe(
        1001,
        "Paula Tejano",
        18589.45F,
        1254.28F,
        954.65F
    );

    funcionarios[1] = new Comissionado(
        1002,
        "Tomas Turbano",
        8589.45F,
        554.28F
    );

    funcionarios[2] = new Horista(
        1003,
        "Cuca Beludo",
        80.45F,
        168

    );

    funcionarios[3] = new Horista(
        1004,
        "Oscar Alho",
        85.5F,
        160
    );

    funcionarios[4] = new Empreiteiro(
        1005,
        "Giuseppe Cadura",
        54644.22F
    );

    for(Funcionario f: funcionarios) {
      System.out.println(String.format("| O | REG: %5d - NOME: %-30s | O |", f.getNumRegistro(), f.getNome()));
      System.out.println(String.format("| O | SALARIO LIQUIDO: R$ %.2f                      | O |", f.calcularSalario()));
      System.out.println("| O |---------------------------------------------------| O |");
    }
  }
}
