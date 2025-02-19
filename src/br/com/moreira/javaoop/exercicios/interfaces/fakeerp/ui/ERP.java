package br.com.moreira.javaoop.exercicios.interfaces.fakeerp.ui;

import br.com.moreira.javaoop.exercicios.interfaces.fakeerp.core.*;
import br.com.moreira.javaoop.exercicios.interfaces.fakeerp.core.IMsERP;
import br.com.moreira.javaoop.exercicios.interfaces.fakeerp.core.IOracleERP;

public class ERP {
  public static void main(String[] args) {
    IOracleERP oracleERP = new CalculaImposto();
    IMsERP msERP = new CalculaImposto();
    ISapERP sapERP = new CalculaImposto();

    oracleERP.calculateTaxes("oracle doc");
    msERP.sumarizeBill("ms doc");
    sapERP.calculateTaxesAndSumarizeBill("sap doc");
  }
}
