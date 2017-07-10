public class RelationalExpressions {
  public static void main(String[] args) {
    int x = 3;
    double y = 4.7;
    boolean b = x <= y && y <= 2 * x;
    boolean c = 2 * x == x + 3;
    boolean d = b && x != 3;
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
