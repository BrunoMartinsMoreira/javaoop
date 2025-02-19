package br.com.moreira.javaoop.aulas.interfaces.implementacoes;

import br.com.moreira.javaoop.aulas.interfaces.contrato.IBd;

public class MySQLDB implements IBd {
  public void conectar(String usuario, String senha) {
    System.out.println("Conectando mySQL" + "Usuario: " + usuario + " Senha: " + senha);
  }

  public void executar(String comando) {
    System.out.println("Comando mySQL " + comando);
  }

  public void desconectar() {
    System.out.println("Desconectando mySQL");
  }
}
