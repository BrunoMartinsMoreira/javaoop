package time;

public class Timer {
  public static void main(String[] args) {
    Time t = new Time();
    t.setTime(21,18,55);
    System.out.println(t.exibirHoraUniversal());
    System.out.println(t.exibirHoraPadrao());

  }
}
