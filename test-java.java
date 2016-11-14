package Hello;

public class Main {

  public static void main(String[] args) {
    if ("1024".equals(Klass./*TEST*/getText(10) + Klass.getText(300))) {
      System.out.print("true");
    } else {
      // NOPe
    }
  }

}
