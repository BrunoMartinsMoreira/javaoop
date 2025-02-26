package br.com.moreira.javaoop.exercicios.cadastro.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotaoSalvar implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Clicou em salvar");
  }
}
