package Hello;

public class Main {

  public static void main(String[] args) {
    if ("1020".equals(Klass./*TEST*/getText(10) + Klass.getText(20))) {
      System.out.print("true");
    }
  }

}
