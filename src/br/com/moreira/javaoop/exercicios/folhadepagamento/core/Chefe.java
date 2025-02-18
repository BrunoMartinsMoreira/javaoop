package br.com.moreira.javaoop.exercicios.folhadepagamento.core;

import java.util.Objects;

public class Chefe extends Funcionario {
  private float salarioBase;
  private float adicionalFuncao;
  private float beneficioTerno;

  public Chefe(int numRegistro, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
    super(numRegistro, nome);
    this.salarioBase = salarioBase;
    this.adicionalFuncao = adicionalFuncao;
    this.beneficioTerno = beneficioTerno;
  }

  @Override
  public String toString() {
    return "Chefe{" +
        "salarioBase=" + salarioBase +
        ", adicionalFuncao=" + adicionalFuncao +
        ", beneficioTerno=" + beneficioTerno +
        ", numRegistro=" + numRegistro +
        ", nome='" + nome + '\'' +
        '}';
  }

  @Override
  public float calcularSalario() {
    return this.salarioBase +
        (this.salarioBase * this.adicionalFuncao / 100) +
        this.beneficioTerno;
  }
}
