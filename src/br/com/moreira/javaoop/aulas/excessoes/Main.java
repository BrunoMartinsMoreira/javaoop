package br.com.moreira.javaoop.aulas.excessoes;

import br.com.moreira.javaoop.aulas.excessoes.customizadas.core.Produto;
import br.com.moreira.javaoop.aulas.excessoes.customizadas.exceptions.ProdutoException;

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
  }
}
