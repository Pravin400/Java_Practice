package _4_control_statements._7_continueDemo;

public class Demo2 {
    public static void main(String[] args) {
        for(int i = 1;i < 111 ; i++){
            if(i % 11 == 0){
//            System.out.println(i);
                continue;
            }
            System.out.println(i);
        }

    }
}
