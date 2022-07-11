package OpenBootcamp;

public class Main {
  public static void main(String[] args) {
    suma(2, 4, 7);
  }

  public static void suma(int a, int b, int c) {
    int resultado = a + b + c;

    System.out.println("La suma de: " + a + " + " + b + " + " + c + " = " + resultado);
  }
}