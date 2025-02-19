package br.com.moreira.javaoop.aulas.classesabstratas;

public class PagamentoCartao extends Pagamento {
  private final double taxaDeJuros;
  public PagamentoCartao(String formaPagamento, int numeroParcelas, double valor, double taxaDeJuros) {
    super(formaPagamento, numeroParcelas, valor);
    this.taxaDeJuros = taxaDeJuros;
  }

  @Override
  public void pagar(double total) {
    double jurosMensais = (super.valor / super.numeroParcelas) * this.taxaDeJuros;
    double parcelaComJuros = (super.valor / super.numeroParcelas) + jurosMensais;
    setValor(parcelaComJuros * this.numeroParcelas);
  }
}
