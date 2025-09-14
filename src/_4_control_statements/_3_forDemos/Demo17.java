package _4_control_statements._3_forDemos;

public class Demo17 {
    public static void main(String[] args) {
        int start=1;
        int end = 100;
        start = start % 2 == 0?start:start+1;
        for(int i = start;i<=end;i= i+2){
            System.out.println(i);
        }
    }
}
