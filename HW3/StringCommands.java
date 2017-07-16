public class StringCommands {
  public static void main(String [] args) {
    String s = "Call me Ishmael.";
    int len = s.length();
    int ishPos = s.indexOf("Ish");
    int jackPos = s.indexOf("Jack");
    String ishSub = s.substring(ishPos, len);
    char c = s.charAt(len-1);
    System.out.println(ishPos);
    System.out.println(jackPos);
    System.out.println(ishSub);
    System.out.println(c);
    System.out.println(len);
    System.out.println(s);
  }
}
