package br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core;

import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.FormaGeometrica;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.IForma2D;

public class Quadrado extends FormaGeometrica implements IForma2D {
  private final double lado;

  public Quadrado(double lado) {
    this.lado = lado;
  }

  @Override
  public String toString() {
    return "Quadrado{" +
        "Lado: " + lado + " " +
        "Area: " + this.calcularArea() + " " +
        "Perimeto: " + this.calcularPerimetro() +
        '}';
  }

  @Override
  public double calcularArea() {
    return this.lado * this.lado;
  }

  @Override
  public double calcularPerimetro() {
    return this.lado * 4;
  }


}
