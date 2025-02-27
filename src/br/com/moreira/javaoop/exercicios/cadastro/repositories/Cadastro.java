package br.com.moreira.javaoop.exercicios.cadastro.repositories;

import java.util.UUID;

public interface Cadastro<T> {
  void salvar(T dadosCadastro);
  T buscar(UUID codigo);
  void deletar(UUID codigo);
  void atualizar(T dadosCadastro);
}
