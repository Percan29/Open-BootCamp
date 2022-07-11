package Primer_Tarea;

public class Main {
  public static void main(String[] args) {
    Coche miCoche = new Coche();

    System.out.println("El Carro tiene: " + miCoche.puertas + " Puertas");

  }

  public static int suma(int a, int b){
    return a + b;
  }
}
class Coche {
  public int puertas = 4;

  public void IncrementarPuerta() {
    this.puertas++;
  }
}




