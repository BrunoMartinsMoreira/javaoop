package br.com.moreira.javaoop.exercicios.polimorfismo.universipi.main;

import br.com.moreira.javaoop.exercicios.polimorfismo.universipi.core.Questao;
import br.com.moreira.javaoop.exercicios.polimorfismo.universipi.core.QuestaoComDica;
import br.com.moreira.javaoop.exercicios.polimorfismo.universipi.core.QuestaoMultiplaEscolha;

import java.util.Scanner;

public class Simulado {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pontos = 0;
    String resposta;
    Questao questoes[] = new  Questao[7];

    questoes[0] = new QuestaoMultiplaEscolha(
        "Quanto é 1 + 1?",
        "2",
        "Batata",
        "Sacole",
        "2",
        "Sua mae aquela gorda"
    );
    questoes[1] = new Questao("Quanto é 2 + 1?", "3");
    questoes[2] = new Questao("Quanto é 3 + 1?", "4");
    questoes[3] = new Questao("Quanto é 4 + 1?", "5");
    questoes[4] = new Questao("Quanto é 5 + 1?", "6");

    questoes[5] = new QuestaoComDica("Quanto é 2 * 2?", "4", "Não é batata doce");
    questoes[6] = new QuestaoComDica("Quanto é 3 * 2?", "4", "Sabonete não se come!");

    for(Questao q: questoes) {
      System.out.println(q.aplicarQuestao());
      System.out.print("Resposta: ");
      resposta = input.nextLine();
      if(q.corrigir(resposta)){
        pontos++;
        System.out.println("Acertou miserávi! ");
      }else {
        System.out.println("Errou BURRO!");
      }
    }

    System.out.println("Total de acertos: "+pontos+" de "+questoes.length);
  }
}
