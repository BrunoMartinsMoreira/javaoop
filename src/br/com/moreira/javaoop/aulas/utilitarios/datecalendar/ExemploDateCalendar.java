package br.com.moreira.javaoop.aulas.utilitarios.datecalendar;

import java.util.Calendar;
import java.util.Date;

public class ExemploDateCalendar {
  public static void main(String[] args) {
    // Usando Date
    Date dataAtual = new Date();
    System.out.println("Data atual: " + dataAtual);

    // Usando Calendar
    Calendar calendario = Calendar.getInstance();
    calendario.add(Calendar.DAY_OF_MONTH, 5); // Adiciona 5 dias
    System.out.println("Data após 5 dias: " + calendario.getTime());
  }
}
