package Without_Main_method;

public class noMain {
/*    static {
        System.out.println("Hello");
        System.exit(0);
    }*/
static {
    System.out.println(new noMain());
    System.exit(0);
}

@Override
public String toString() {
    return "Hello, World!";

}
}
