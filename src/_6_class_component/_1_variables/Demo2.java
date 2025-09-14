package _6_class_component._1_variables;

public class Demo2 {
    public static void main(String[] args) {
        String message = "good morning";
        System.out.println(message);
        print();
    }

    public static void print() {

        //message is defined in other method so cannot access it
        String message = "Message";
         System.out.println(message);
    }
}
