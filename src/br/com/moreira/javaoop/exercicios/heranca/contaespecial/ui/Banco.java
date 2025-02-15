package br.com.moreira.javaoop.exercicios.heranca.contaespecial.ui;

import br.com.moreira.javaoop.exercicios.heranca.contaespecial.core.Conta;
import br.com.moreira.javaoop.exercicios.heranca.contaespecial.core.ContaEspecial;

public class Banco {
  public static void main(String[] args) {
    Conta c = new Conta(
        "Bruno M",
        "121.117.128-19",
        450,
        464.98
    );

    System.out.println("-----------------------------CONTA SIMPLES---------------------------------");

    c.creditar(956.98);
    c.debitar(500.00);
    System.out.println(c);

    boolean sucessoSacar = c.debitar(500.00);

    if(sucessoSacar) {
      System.out.printf("Você sacou R$ 500,00. Saldo Atual: %.2f", c.getSaldo());
    }else {
      System.out.printf("Saldo de R$ %.2f insuficiente!", c.getSaldo());
    }

    System.out.println("\n-----------------------------CONTA ESPECIAL---------------------------------");
    ContaEspecial ce = new ContaEspecial(
        "Bruno M E",
        "121.117.128-19",
        550,
        300,
        200
    );

    ce.creditar(100);
    System.out.println(ce);

    double valorSaqueCe = 610.00;
    boolean sucessoDebitoEspecial = ce.debitar(valorSaqueCe);
    if(sucessoDebitoEspecial) {
      if(ce.getSaldo() < 0) {
        System.out.printf(
            "Você sacou R$ %.2f usando seu limite de crédito de %.2f | Saldo Atual: %.2f",
            valorSaqueCe,
            ce.getLimiteDeCredito(),
            ce.getSaldo()
        );
      }else {
        System.out.printf("Você sacou R$ 550,00. Saldo Atual: %.2f", ce.getSaldo());
      }
    }else {
      double saldoMaisLimite = ce.getLimiteDeCredito() + ce.getSaldo();
      System.out.printf(
          "A soma do seu SALDO de R$ %.2f + seu LIMITE de %.2f (%.2f) insuficiente!",
          ce.getSaldo(),
          ce.getLimiteDeCredito(),
          saldoMaisLimite
      );
    }

  }
}
