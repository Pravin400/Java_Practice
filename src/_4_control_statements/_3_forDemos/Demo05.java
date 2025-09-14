package _4_control_statements._3_forDemos;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println("Never execute this ");
        boolean flag = false;
//we not directly able to write the false inside the for loop so we store in the
        for(;flag; ){
            System.out.println("for body");
        }
        System.out.println("Alway's execute this ");
    }
}
