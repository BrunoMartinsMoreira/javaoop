package br.com.moreira.javaoop.exercicios.classesabstratas.folhadepagamento.core;

public class Comissionado extends Funcionario {
  private float salarioBase;
  private float comissao;

  public Comissionado(int numRegistro, String nome, float salarioBase, float comissao) {
    super(numRegistro, nome);
    this.salarioBase = salarioBase;
    this.comissao = comissao;
  }

  public float getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(float salarioBase) {
    this.salarioBase = salarioBase;
  }

  public float getComissao() {
    return comissao;
  }

  public void setComissao(float comissao) {
    this.comissao = comissao;
  }

  @Override
  public String toString() {
    return "Comissionado{" +
        "salarioBase=" + salarioBase +
        ", comissao=" + comissao +
        ", numRegistro=" + numRegistro +
        ", nome='" + nome + '\'' +
        '}';
  }

  @Override
  public float calcularSalario() {
    return this.salarioBase +
           this.salarioBase * this.comissao/100;
  }
}
