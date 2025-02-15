package br.com.moreira.javaoop.aulas.pacotes.ecommerce.core;

public class Pedido {
  private int numPed;
  private String data;
  private double total;
  private String client;
  private  Status status;

  public Pedido(int numPed, String data, double total, String client, Status status) {
    this.numPed = numPed;
    this.data = data;
    this.total = total;
    this.client = client;
    this.status = status;
  }

  public int getNumPed() {
    return numPed;
  }

  public void setNumPed(int numPed) {
    this.numPed = numPed;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String exibir(){
    return this.numPed+" - "+
            this.data + " R$ " +
            this.total +
            " (" + this.client+") "+
            "STATUS = "+ this.status ;
  }
}
