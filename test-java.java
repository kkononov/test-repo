package Hello;

public class Main {

  public static void main(String[] args) {
    if ("1024".equals(Klass./*TEST 2*/getText(1025) + Klass.getText(300))) {
      System.out.print("true");
    } else {
      // NOP (another)
    }
  }

}
