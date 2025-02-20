package br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core;

import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.FormaGeometrica;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.IForma2D;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.IForma3D;

public class Cubo extends FormaGeometrica implements IForma3D, IForma2D {
  private final double lado;

  public Cubo(double lado) {
    this.lado = lado;
  }

  @Override
  public String toString() {
    return "Cubo{" +
        "Lado: " + lado + " " +
        "Volume: " + this.calcularVolume() + " " +
        "Area: " + this.calcularArea() + " " +
        "Perimetro: " + this.calcularPerimetro() +
        '}';
  }

  @Override
  public double calcularVolume() {
    return Math.pow(this.lado, 3);
  }

  @Override
  public double calcularArea() {
    return Math.pow(this.lado, 3);
  }

  @Override
  public double calcularPerimetro() {
    return this.lado * 4;
  }
}
