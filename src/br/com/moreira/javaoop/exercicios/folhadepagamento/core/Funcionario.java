package br.com.moreira.javaoop.exercicios.folhadepagamento.core;

public abstract class Funcionario {
  protected  int numRegistro;
  protected  String nome;

  public Funcionario(int numRegistro, String nome) {
    this.numRegistro = numRegistro;
    this.nome = nome;
  }

  public int getNumRegistro() {
    return numRegistro;
  }

  public void setNumRegistro(int numRegistro) {
    this.numRegistro = numRegistro;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Funcionario{" +
        "numRegistro=" + numRegistro +
        ", nome='" + nome + '\'' +
        '}';
  }

  public abstract float calcularSalario();
}
