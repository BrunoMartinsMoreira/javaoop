package br.com.moreira.javaoop.aulas.classesabstratas;

public class PagamentoCartao extends Pagamento {
  public PagamentoCartao(String formaPagamento, int numeroParcelas, double valor) {
    super(formaPagamento, numeroParcelas, valor);
  }

  @Override
  public void pagar(double total) {

  }
}
