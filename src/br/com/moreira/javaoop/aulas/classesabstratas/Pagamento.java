package br.com.moreira.javaoop.aulas.classesabstratas;

public abstract class Pagamento {
  protected String formaPagamento;
  protected int numeroParcelas;
  protected double valor;

  public Pagamento(String formaPagamento, int numeroParcelas, double valor) {
    this.formaPagamento = formaPagamento;
    this.numeroParcelas = numeroParcelas;
    this.valor = valor;
  }

  public String getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(String formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public int getNumeroParcelas() {
    return numeroParcelas;
  }

  public void setNumeroParcelas(int numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public abstract void pagar(double total);
}
