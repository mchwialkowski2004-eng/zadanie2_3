import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj liczbe a");
    int a = scanner.nextInt();
    System.out.println("podaj liczbe b");
    int b = scanner.nextInt();
    int wynik = a * a + b * b;
    System.out.println("wynik to " + wynik);
    scanner.close();
  }

}