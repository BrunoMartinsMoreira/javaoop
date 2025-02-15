package br.com.moreira.javaoop.time;

//Sobrecarga de metodos: mesmo nome de metodo com parametros diferentes
public class Time {
  private  int hora;
  private int min;
  private int seg;

  public Time(int hora, int min, int seg) {
    this.hora = hora;
    this.min = min;
    this.seg = seg;
  }



  public Time(int hora, int min) {
    super();
    this.hora = hora;
    this.min = min;
    this.seg = 0;
  }

  public Time(int hora) {
    super();
    this.hora = hora;
    this.min = 0;
    this.seg = 0;
  }

  public Time() {
    super();
  }

  public void setTime(int hora, int min, int seg){
    this.hora = hora;
    this.min = min;
    this.seg = seg;
  }

  public void setTime(int hora,int min){
    this.hora = hora;
    this.min = min;
    this.seg = 0;
  }
  public void setTime(int hora){
    this.hora = hora;
    this.min = 0;
    this.seg = 0;
  }

  public String exibirHoraUniversal(){
    return formataNumero(this.hora)+":"+formataNumero(this.min)+":"+formataNumero(this.seg);
  }

  public String exibirHoraPadrao(){
    String strHora, sufixo;

    if(this.hora == 12){
      strHora = "12";
      sufixo = "PM";
    } else if (this.hora == 0) {
      strHora = "12";
      sufixo = "AM";
    } else if (this.hora >= 1 && this.hora <= 11) {
      strHora =  formataNumero(this.hora);
      sufixo = "AM";
    }else{
      strHora = formataNumero(this.hora - 12);
      sufixo = "PM";
    }

    return strHora +":"+formataNumero(this.min)+":"+formataNumero(this.seg);
  }

  private String formataNumero(int numero){
    return numero < 10 ? ""+numero : String.valueOf(numero);
  }
}
