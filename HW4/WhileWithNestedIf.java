public class WhileWithNestedIf {
  public static void main(String [] args) {
    int x = 1;
    while(x < 100) {
      System.out.println("x = " + x);
      if(x % 2 == 0) {
        x++;
      } else {
        x *= 2;
      }
    }
  }
}
