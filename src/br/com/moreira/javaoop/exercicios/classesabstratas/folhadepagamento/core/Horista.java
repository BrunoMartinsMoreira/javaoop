package br.com.moreira.javaoop.exercicios.classesabstratas.folhadepagamento.core;

public class Horista extends Funcionario {
  private float valorHora;
  private int horasTrabalhadas;

  public Horista(int numRegistro, String nome, float valorHora, int horasTrabalhadas) {
    super(numRegistro, nome);
    this.valorHora = valorHora;
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public float getValorHora() {
    return valorHora;
  }

  public void setValorHora(float valorHora) {
    this.valorHora = valorHora;
  }

  public int getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(int horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  @Override
  public String toString() {
    return "Horista{" +
        "valorHora=" + valorHora +
        ", horasTrabalhadas=" + horasTrabalhadas +
        ", numRegistro=" + numRegistro +
        ", nome='" + nome + '\'' +
        '}';
  }

  @Override
  public float calcularSalario() {
    return this.valorHora * this.horasTrabalhadas;
  }
}
