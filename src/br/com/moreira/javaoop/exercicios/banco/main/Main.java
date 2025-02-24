package br.com.moreira.javaoop.exercicios.banco.main;

import br.com.moreira.javaoop.exercicios.banco.core.Banco;
import br.com.moreira.javaoop.exercicios.banco.core.Cliente;
import br.com.moreira.javaoop.exercicios.banco.core.Conta;

public class Main {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("111.222.333.44", "Jose");
    Cliente cliente2 = new Cliente("444.333.222-11", "Maria");

    Conta conta1 = new Conta(cliente1, 111, 0.0);
    Conta conta2 = new Conta(cliente2, 222, 0.0);

    Banco banco = new Banco();

    banco.depositar(conta1, 1250.33);
    System.out.println("Saldo conta1: R$"+conta1.getSaldo());

    banco.sacar(conta1, 525.80);
    System.out.println("Saldo conta1: R$"+conta1.getSaldo());

    banco.transferir(conta1, conta2, 450.63);
    System.out.println("Saldo conta1: R$"+conta1.getSaldo());
    System.out.println("Saldo conta2: R$"+conta2.getSaldo());
  }
}
