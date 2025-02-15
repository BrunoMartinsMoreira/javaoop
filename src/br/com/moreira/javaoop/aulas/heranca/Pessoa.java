package br.com.moreira.javaoop.aulas.heranca;

public class Pessoa {
 protected String email;
 protected String  nome;
 protected String  fone;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getFone() {
    return fone;
  }

  public void setFone(String fone) {
    this.fone = fone;
  }

  public String exibir(){
    return "Nome: " + this.nome + " | Email: " + this.email + " | Fone: " + this.fone;
  }
}
