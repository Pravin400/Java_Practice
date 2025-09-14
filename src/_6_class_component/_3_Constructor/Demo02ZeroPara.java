package _6_class_component._3_Constructor;

class Students {
    int id;
    String name;

    // Zero-parameter constructor (custom values assigned)
    Students() {
        id = 100;       // Custom default value
        name = "Unknown"; // Custom default value
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Demo02ZeroPara {
    public static void main(String[] args) {
        Students s = new Students(); // Calls zero-parameter constructor
        s.show();
    }
}
