package br.com.moreira.javaoop.exercicios.heranca.contaespecial.core;

public class ContaEspecial extends  Conta{
  private double limiteDeCredito;

  public ContaEspecial(
      String nomeTitular,
      String cpf,
      int numeroConta,
      double saldo,
      double limiteDeCredito
  ) {
    super(nomeTitular, cpf, numeroConta, saldo);
    this.limiteDeCredito = limiteDeCredito;
  }

  public double getLimiteDeCredito() {
    return limiteDeCredito;
  }

  @Override
  public String toString() {
    return super.toString() +
           " Limite de crédito: R$" + this.limiteDeCredito;
  }

  @Override
  public boolean debitar(double valor) {
    if(valor < 0){
      return false;
    }

    if(valor > super.saldo + this.limiteDeCredito){
      return false;
    }

    super.saldo-=valor;
    return  true;
  }
}
