package _4_control_statements._3_forDemos;

public class Demo07 {
    public static void main(String[] args) {
        boolean flag = true;
//this for loop executes n times
        for (System.out.println("init");flag; System.out.println("incr/decr") ) {
            System.out.println("for body");
//            flag = false; //when we comment off this shows the flow of for loop
        }
        //output
        //init
        // for body infinitely , incr/decr
    }
}
