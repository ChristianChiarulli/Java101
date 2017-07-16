public class StringInsertDelete {
  public static void main(String [] args) {
    String frozen = "It was a bright cold day in April, " + "and the clocks were striking thirteen.";

    System.out.println(frozen);

    int start = frozen.indexOf("thirteen");
    int end = start + "thirteen".length();
    frozen = frozen.substring(0, start)
            + "twenty-five"
            + frozen.substring(end, frozen.length());

    System.out.println(start);
    System.out.println(end);
    System.out.println(frozen);
  }
}
