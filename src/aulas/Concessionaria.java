package aulas;

public class Concessionaria {
  public void vender() {
    Carro carro1, carro2;
    double ipva;

    carro1 = new Carro("Fiat", "Uno", 2012, "Preto", 15000, 25000);
    carro2 = new Carro("Totoya", "Corolla", 2011, "Preto", 139000, 65000);

    carro1.exibirAnuncio();
    carro1.simularSeguro(0);
    carro1.simularSeguro(1);
    carro1.simularSeguro(2);

    ipva = carro1.calcularIPVA();
    System.out.println("Valor do IPVA R$: " + ipva);
    System.out.println("######################################################################");

    carro2.exibirAnuncio();
    carro2.simularSeguro(0);
    carro2.simularSeguro(1);
    carro2.simularSeguro(2);

    ipva = carro2.calcularIPVA();
    System.out.println("Valor do IPVA R$: " + ipva);
  }
}
