package br.com.moreira.javaoop.aulas.interfaces.contrato;

public interface IBd {
  public void conectar(String usuario, String senha);
  public void executar(String comando);
  public void desconectar();
}
