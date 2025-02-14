package aulas.statics;

public class MainClass {
  public static void main(String[] args) {
    int soma = Utils.soma(45,65);
    soma*=(Utils.VAR*Utils.CONST);

    System.out.println("Valor da soma: "+ soma);
  }
}
