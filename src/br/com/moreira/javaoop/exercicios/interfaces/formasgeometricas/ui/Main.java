package br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.ui;

import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core.Circulo;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core.Cubo;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core.Paralelepipedo;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.core.Quadrado;
import br.com.moreira.javaoop.exercicios.interfaces.formasgeometricas.model.FormaGeometrica;

public class Main {
  public static void main(String[] args) {
    FormaGeometrica formas[] = new FormaGeometrica[4];

    formas[0] = new Circulo(4);
    formas[1] = new Cubo(6);
    formas[2] = new Paralelepipedo(3, 7, 2);
    formas[3] = new Quadrado(8);

    for(FormaGeometrica forma:formas) {
      System.out.println("...................................................................");
      System.out.println(forma.toString());
    }
  }
}
