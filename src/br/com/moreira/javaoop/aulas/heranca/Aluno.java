package br.com.moreira.javaoop.aulas.heranca;

public class Aluno extends  Pessoa {
  private String curso;
  private  String numeroMatricula;

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getNumeroMatricula() {
    return numeroMatricula;
  }

  public void setNumeroMatricula(String numeroMatricula) {
    this.numeroMatricula = numeroMatricula;
  }

  @Override
  public String exibir() {
    return super.exibir() +
           " | Curso: " + this.curso +
           " | Matricula: " + this.numeroMatricula;
  }

  public  String exibirDnv() {
    return "Nome: " + super.nome +
           " | Email: " + super.email +
           " | Fone: " + super.fone +
           " | Curso: " + this.curso +
           " | Matricula: " + this.numeroMatricula;
  }
}
