package aulas.strings;

public class Strings {
  public static void main(String[] args) {
    String s1,s2;
    s1 = new String("nova string");
    s2 = new String("nova string");

    if(s1 == s2){//compara o mesmo endereço de memoria
      System.out.println("Iguais");
    }else {
      System.out.println("Diferentes"); //vai cair aqui
    }

    if(s1.equals(s2)){//compara valor
      System.out.println("Iguais com equals"); //vai cair aqui
    }else {
      System.out.println("Diferentes com equals");
    }
  }
}
