package _7_oops.inheritance;

public class Demo2 {
    public static void main(String[] args) {
        A1 a = new  A1();
    }
}

class x{
    x(){
        System.out.println("X class Constructor");
    }
}
class y extends x{
    y(){
        System.out.println("Y class Constructor");
    }
}
class z extends y{
    z(){
        System.out.println("Z class Constructor");
    }
}
class A1 extends  z{
    A1(){
        System.out.println("A1 class Constructor");
    }
}