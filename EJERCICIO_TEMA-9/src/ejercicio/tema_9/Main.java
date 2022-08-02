package ejercicio.tema_9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Trabajador trabajador = new Trabajador();


        cliente.edad = 45;
        cliente.telefono = 670139640;
        cliente.nombre = "Mauricio P.";
        cliente.credito = 200.000;

        System.out.println("VIP Customer name: " + cliente.nombre);
        System.out.println("Customer phone number: " + cliente.telefono);
        System.out.println("client's age: " + cliente.edad);
        System.out.println("Customer credit is: " + cliente.credito);
        System.out.println("********************************************************");

        trabajador.edad = 63;
        trabajador.telefono = 83685047;
        trabajador.nombre = "Berny F.";
        trabajador.salario = 2100.00;

        System.out.println("Customer name: " + trabajador.nombre);
        System.out.println("Customer phone number: " + trabajador.telefono);
        System.out.println("Client's age: " + trabajador.edad);
        System.out.println("Customer salary: " + trabajador.salario);
        System.out.println("*********************************************************");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}