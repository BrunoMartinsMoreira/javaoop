package br.com.moreira.javaoop.exercicios.polimorfismo.universipi.core;

public class QuestaoComDica extends Questao{
  private String dica;
  public QuestaoComDica(String enunciado, String resposta, String dica) {
    super(enunciado, resposta);
    this.dica = dica;
  }

  public String getDica() {
    return dica;
  }

  public void setDica(String dica) {
    this.dica = dica;
  }

  @Override
  public String aplicarQuestao(){
    return super.aplicarQuestao() + "\n" +
           "(Dica: "+this.dica+")";
  }
}
