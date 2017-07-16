public class ComplexUpdateFor {
  public static void main(String [] args) {
    for(int i = 2; i < 1000; i = i * i) {
      System.out.println("i = " + i);
    }
  } 
}
