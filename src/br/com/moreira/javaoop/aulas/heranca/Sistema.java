package br.com.moreira.javaoop.aulas.heranca;

public class Sistema {
  public static void main(String[] args) {
    Pessoa p = new Pessoa();

    p.setNome("Bruno");
    p.setEmail("bruno@moreira.com"); ;
    p.setFone("38999887766");

    System.out.println("PESSOA: " + p.exibir());
    System.out.println("--------------------------------------------------------------");

    Aluno aluno = new Aluno();

    aluno.setNome("Bruno Aluno");
    aluno.setEmail("bruno.aluno@moreira.com"); ;
    aluno.setFone("38999887654");
    aluno.setCurso("Javinha Maroto");
    aluno.setNumeroMatricula("987A45BC64");


    System.out.println("ALUNO: " +  aluno.exibir());
    System.out.println("--------------------------------------------------------------");
    System.out.println("ALUNO DNV: " +  aluno.exibirDnv());
  }
}
