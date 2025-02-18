package br.com.moreira.javaoop.exercicios.polimorfismo.universipi.core;

public class Questao {
  protected  String enunciado;
  protected  String resposta;

  public Questao(String enunciado, String resposta) {
    super();
    this.enunciado = enunciado;
    this.resposta = resposta;
  }

  public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
  }

  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  public String aplicarQuestao() {
    return "Q: "+ this.enunciado;
  }

  public boolean corrigir(String respostaAluno){
    return  this.resposta.equals(respostaAluno);
  }
}
