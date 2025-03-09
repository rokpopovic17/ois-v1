import java.util.Scanner;

public class Gravitacija {
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double visina = sc.nextDouble();
    System.out.println(gravitacija(visina));
  }

  public static double gravitacija(double visina) {
    return ((6.674 * 0.00000000001 * 5.972 * 1000000000000000000000000.0) / ((6.371 * 1000000 + visina) * (6.371 * 1000000 + visina)));
  }
}
