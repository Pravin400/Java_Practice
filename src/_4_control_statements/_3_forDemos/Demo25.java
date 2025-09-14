package _4_control_statements._3_forDemos;

public class Demo25 {
    public static void main(String[] args) {
        int number = 55;
        boolean flag = true;
        for(int i = 2;i<=number/2;i++){
            System.out.println(number+" % "+ i + " is "+number%i);
            if(number%i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"It's a Prime Number":"It's Not a Prime Number");


    }
}
