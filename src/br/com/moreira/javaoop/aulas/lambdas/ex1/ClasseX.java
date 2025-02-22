package br.com.moreira.javaoop.aulas.lambdas.ex1;

public class ClasseX {
  public static void main(String[] args) {
    InterfaceX obj = new InterfaceX() {
      @Override
      public int metod(int valor) {
        return valor*2;
      }
    };

    System.out.println("Retorno obj: " +obj.metod(5));

    InterfaceX obj2 = new InterfaceX() {
      @Override
      public int metod(int valor) {
        return valor*valor;
      }
    };

    System.out.println("Retorno obj2: " +obj2.metod(5));

    InterfaceX objLambda = (valor) -> valor * 3;
    System.out.println("Retorno objLambda: " +objLambda.metod(5));
  }
}
