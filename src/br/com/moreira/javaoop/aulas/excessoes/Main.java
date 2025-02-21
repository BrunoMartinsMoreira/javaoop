package br.com.moreira.javaoop.aulas.excessoes;

import br.com.moreira.javaoop.aulas.excessoes.customizadas.core.Produto;
import br.com.moreira.javaoop.aulas.excessoes.customizadas.exceptions.ProdutoException;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try{
      Produto p = new Produto();
      p.setId(-10);
      p.setDescricao("");

      System.out.println(p);
    } catch (ProdutoException | RuntimeException  e) {
      System.out.println("Deu ruim! ");
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      // Igual no JS
      System.out.println("Sempre executa");
    }

    // try with resources
    try( Scanner input = new Scanner(System.in)) {
      int v1,v2,r;
      System.out.println("Digite v1: ");
      v1 = input.nextInt();

      System.out.println("Digite v2: ");
      v2 = input.nextInt();

      r = v1/v2;
      System.out.println("R: " + r);
    }catch (Exception e) {
      e.printStackTrace();
    }
  }
}
