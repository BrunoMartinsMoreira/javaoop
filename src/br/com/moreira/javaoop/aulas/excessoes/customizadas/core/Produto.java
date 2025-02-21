package br.com.moreira.javaoop.aulas.excessoes.customizadas.core;

import br.com.moreira.javaoop.aulas.excessoes.customizadas.exceptions.ProdutoException;

public class Produto {
  private String descricao;
  private int id;

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) throws ProdutoException{
    if(descricao.isBlank()) {
      throw  new ProdutoException("Descricao invalida");
    }
    this.descricao = descricao;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) throws ProdutoException {
    if(id <= 0) {
      throw new ProdutoException("Id invalido, deve ser >= 1");
    }
    this.id = id;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "descricao='" + descricao + '\'' +
        ", id=" + id +
        '}';
  }
}
