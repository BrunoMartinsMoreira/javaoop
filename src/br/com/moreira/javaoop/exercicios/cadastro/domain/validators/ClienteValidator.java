package br.com.moreira.javaoop.exercicios.cadastro.domain.validators;

import br.com.moreira.javaoop.exercicios.cadastro.domain.Cliente;
import br.com.moreira.javaoop.exercicios.cadastro.domain.exceptions.CpfInvalidoException;

public class ClienteValidator {
  public static void validarCpf(Cliente cliente) throws CpfInvalidoException {
    if(cliente.getCpf().length() != 11) {
      throw new CpfInvalidoException("CPF INVALIDO");
    }
  }
}
