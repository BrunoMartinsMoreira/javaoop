package br.com.moreira.javaoop.aulas.interfaces.implementacoes;

import br.com.moreira.javaoop.aulas.interfaces.contrato.IBd;

public class PostgreSQL implements IBd {
  public void conectar(String usuario, String senha) {
    System.out.println("Conectando PostgreSQL" + "Usuario: " + usuario + " Senha: " + senha);
  }

  public void executar(String comando) {
    System.out.println("Comando PostgreSQL " + comando);
  }

  public void desconectar() {
    System.out.println("Desconectando PostgreSQL");
  }
}
