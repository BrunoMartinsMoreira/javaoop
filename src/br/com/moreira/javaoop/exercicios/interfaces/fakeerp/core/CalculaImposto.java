package br.com.moreira.javaoop.exercicios.interfaces.fakeerp.core;

public class   CalculaImposto implements IOracleERP, IMsERP, ISapERP {
  public void calcular(String documento) {
    System.out.println("Documento recebido: " + documento);
  }

  @Override
  public void sumarizeBill(String doc) {
    this.calcular(doc);
  }

  @Override
  public void calculateTaxes(String doc) {
    this.calcular(doc);
  }

  @Override
  public void calculateTaxesAndSumarizeBill(String doc) {
    this.calcular(doc);
  }
}
