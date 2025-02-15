package br.com.moreira.javaoop.aulas.pacotes.ecommerce.ui;

import br.com.moreira.javaoop.aulas.pacotes.ecommerce.core.Pedido;
import br.com.moreira.javaoop.aulas.pacotes.ecommerce.core.Status;

public class Loja {
  public static void main(String[] args) {
    Pedido p = new Pedido(
        102,
        "14/02/2025",
        2565,
        "Moreira",
        Status.NOVO
    );
    System.out.println(p.exibir());

    p.setStatus(Status.FATURADO);
    System.out.println(p.exibir());

    p.setStatus(Status.ENTREGUE);
    System.out.println(p.exibir());

  }
}
