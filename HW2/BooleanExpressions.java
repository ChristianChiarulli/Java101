public class BooleanExpressions {
  public static void main(String [] args) {
      boolean b = true || false;
      boolean c = false && true;
      boolean d = !b || c;
      b = !b;
      d = !(b && (c || d));
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
    }
}
