package br.com.moreira.javaoop.exercicios.cadastro.domain;

public enum TipoSexo {
  M("Masculino"),
  F("Feminino");

  private final String descricao;

  TipoSexo(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao(){
    return this.descricao;
  }
}
