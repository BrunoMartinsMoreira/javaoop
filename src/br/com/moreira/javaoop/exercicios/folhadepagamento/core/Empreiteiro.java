package br.com.moreira.javaoop.exercicios.folhadepagamento.core;

public class Empreiteiro extends Funcionario {
  private float valorEmpreita;

  public Empreiteiro(int numRegistro, String nome, float valorEmpreita) {
    super(numRegistro, nome);
    this.valorEmpreita = valorEmpreita;
  }

  public float getValorEmpreita() {
    return valorEmpreita;
  }

  public void setValorEmpreita(float valorEmpreita) {
    this.valorEmpreita = valorEmpreita;
  }

  @Override
  public String toString() {
    return "Empreiteiro{" +
        "valorEmpreita=" + valorEmpreita +
        ", numRegistro=" + numRegistro +
        ", nome='" + nome + '\'' +
        '}';
  }

  @Override
  public float calcularSalario() {
    return this.valorEmpreita;
  }
}
