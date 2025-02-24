package br.com.moreira.javaoop.exercicios.banco.core;

public class Banco {

  public void depositar(Conta conta, double valor) {
    conta.setSaldo(conta.getSaldo()+valor);
  }

  public boolean sacar (Conta conta, double valor) {
    if(conta.getSaldo() < valor) return false;

    conta.setSaldo(conta.getSaldo() - valor);
    return true;
  }

  public boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
    if(contaOrigem.getSaldo() < valor) return false;
    contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
    contaDestino.setSaldo(contaDestino.getSaldo()+valor);
    return true;
  }
}
