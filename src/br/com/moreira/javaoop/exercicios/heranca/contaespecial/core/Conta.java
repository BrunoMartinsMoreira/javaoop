package br.com.moreira.javaoop.exercicios.heranca.contaespecial.core;

public class Conta {
  protected String nomeTitular;
  protected String cpf;
  protected int numeroConta;
  protected  double saldo;

  public double getSaldo() {
    return saldo;
  }

  public Conta(String nomeTitular, String cpf, int numeroConta, double saldo) {
    super();
    this.nomeTitular = nomeTitular;
    this.cpf = cpf;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }

  public String toString(){
    return "Conta: " + this.numeroConta +
           " SALDO: R$" + String.format("%.2f", this.saldo) +
           " Titular: " + this.nomeTitular +
           "(" + this.cpf + ")";
  }

  public double creditar(double valor) {
    if(valor < 0){
      return this.saldo;
    }

    this.saldo+=valor;

    return this.saldo;
  }

  public boolean debitar(double valor) {
    if(valor < 0){
      return false;
    }

    if(valor > this.saldo){
      return false;
    }

    this.saldo-=valor;

    return true;
  }

}
