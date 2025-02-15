package br.com.moreira.javaoop.aulas.pacotes.produto;

public class Produto {

  private  int id;
  private double preco;
  private String descricao;


  public Produto(int id, double preco, String descricao) {
    this.id = id;
    this.preco = preco;
    this.descricao = descricao;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String exibirInfo(){
    return this.id+"-"+this.descricao+" - R$"+this.preco;
  }

}
