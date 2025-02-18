package br.com.moreira.javaoop.exercicios.polimorfismo.universipi.core;

public class QuestaoMultiplaEscolha extends Questao {
  private String altA;
  private String altB;
  private String altC;
  private String altD;

  public QuestaoMultiplaEscolha(
      String enunciado,
      String resposta,
      String altA,
      String altB,
      String altC,
      String altD
  ) {
    super(enunciado, resposta);
    this.altA = altA;
    this.altB = altB;
    this.altC = altC;
    this.altD = altD;
  }

  @Override
  public  String aplicarQuestao() {
    return super.aplicarQuestao()+"\n" +
           " a)" + this.altA + "\n"+
           " b)" + this.altB + "\n"+
           " c)" + this.altC + "\n"+
           " d)" + this.altD;
  }
}
