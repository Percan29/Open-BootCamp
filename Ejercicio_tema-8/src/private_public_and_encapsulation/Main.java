package private_public_and_encapsulation;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setAge(45);
        persona.setName("Mauricio");
        persona.setPhone(587-456-67);

        System.out.println("Person's age: " + persona.getAge());
        System.out.println("The name: " + persona.getName());
        System.out.println("Person's phone: " + persona.getPhone());
    }
}

class Persona {
    private int age;
    private String name;
    private int phone;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getPhone() {
        return phone;
    }
}

// Ejercicios_Tema_8
