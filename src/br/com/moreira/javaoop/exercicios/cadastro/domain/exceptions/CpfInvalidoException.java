package br.com.moreira.javaoop.exercicios.cadastro.domain.exceptions;

public class CpfInvalidoException extends Exception{
  public CpfInvalidoException(String message) {
    super(message);
  }
}
