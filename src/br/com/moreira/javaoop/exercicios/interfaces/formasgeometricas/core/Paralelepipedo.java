package br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core;

import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.FormaGeometrica;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.IForma3D;

public class Paralelepipedo extends FormaGeometrica implements IForma3D {
  private final double altura;
  private final double largura;
  private final double profundidade;

  public Paralelepipedo(double altura, double largura, double profundidade) {
    this.altura = altura;
    this.largura = largura;
    this.profundidade = profundidade;
  }

  @Override
  public String toString() {
    return "Paralelepipedo{" +
        "Altura: " + altura + " " +
        "Largura: " + largura + " " +
        "Profundidade: " + profundidade + " " +
        "Volume: " + this.calcularVolume() + " " +
        '}';
  }

  @Override
  public double calcularVolume() {
    return this.altura * this.largura * this.profundidade;
  }
}
