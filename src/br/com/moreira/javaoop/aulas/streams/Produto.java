package br.com.moreira.javaoop.aulas.streams;

public class Produto {
  private int id;
  private String descricao;
  private double preco;
  private int qtde;

  public Produto(int id, String descricao, double preco, int qtde) {
    this.id = id;
    this.descricao = descricao;
    this.preco = preco;
    this.qtde = qtde;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQtde() {
    return qtde;
  }

  public void setQtde(int qtde) {
    this.qtde = qtde;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "id=" + id +
        ", descricao='" + descricao + '\'' +
        ", preco=" + preco +
        ", qtde=" + qtde +
        '}';
  }
}
