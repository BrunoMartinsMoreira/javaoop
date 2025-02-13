package aulas;

public class Carro {

  String marca;
  String modelo;
  int ano;
  String cor;
  int km;
  double preco;

  public Carro(
      String marca,
      String modelo,
      int ano,
      String cor,
      int km,
      double preco) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
    this.km = km;
    this.preco = preco;
  }

  public void exibirAnuncio() {
    System.out.println("-------------------------------------------------");
    System.out.println("Anuncio do carro:");
    System.out.println(marca + "-" + modelo + " (" + ano + ")");
    System.out.println("Cor: " + cor + " |  KM: " + km + " | ANO: " + ano + " | PREÇO: R$ " + preco);
  }

  void simularSeguro(int perfil) {
    System.out.println("---------------------SEGURO---------------------");
    switch (perfil) {
      case 0:
        System.out.println("Perfil Idoso - 1.5%");
        System.out.println("R$ " + preco * 0.015);
        break;
      case 1:
        System.out.println("Perfil Pai de Familia - 2.5%");
        System.out.println("R$ " + preco * 0.025);
        break;
      case 2:
        System.out.println("Perfil Jovem e Burro - 15%");
        System.out.println("R$ " + preco * 0.15);
        break;
      default:
        System.out.println("Perfil Inválido!");
        break;
    }
  }

  double calcularIPVA() {
    System.out.println("---------------------IPVA---------------------");
    double valorIPVA = preco * 0.01;
    if (ano < 2015) {
      valorIPVA = preco * 0.005;
    } else if (ano < 2005) {
      valorIPVA = preco * 0.0005;
    } else if (ano <= 2000) {
      valorIPVA = 0;
    }

    return valorIPVA;
  }

}

