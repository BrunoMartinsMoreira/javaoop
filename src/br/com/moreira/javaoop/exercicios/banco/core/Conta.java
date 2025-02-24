package br.com.moreira.javaoop.exercicios.banco.core;

public class Conta {
  private Cliente titular;
  private int numero;
  private double saldo;

  public Conta(Cliente titular, int numero, double saldo) {
    this.titular = titular;
    this.numero = numero;
    this.saldo = saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}
