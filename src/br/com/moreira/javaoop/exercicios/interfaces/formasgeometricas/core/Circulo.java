package br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core;

import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.FormaGeometrica;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.IForma2D;

public class Circulo extends FormaGeometrica implements IForma2D {
  private final double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.pow(this.raio, 2) * Math.PI;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * Math.PI * this.raio;
  }

  @Override
  public String toString() {
    return "Circulo{" +
        "Raio: " + raio + " " +
        "Area: " + this.calcularArea() + " " +
        "Perimetro: " + this.calcularPerimetro() +
        '}';
  }
}
