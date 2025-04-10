package br.com.moreira.javaoop.exercicios.cadastro.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
  public static final String path = "/home/brunomoreira/Dev/Java";

  public static void persistir(String nome, byte[] bytes) {
    try{
      Path filePath = Paths.get(path + nome);
      Files.write(filePath, bytes);
    }catch (IOException e) {
      System.out.println("Mamou "+ e.getMessage());
    }
  }
}
