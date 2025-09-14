package _4_control_statements._1_If_else;

public class Demo09 {
    public static void main(String[] args) {
        int [] array = {1000,20,30,40,166,35,165};
                int max = Integer.MIN_VALUE;//assume -1 for understanding
        System.out.println(max);
                int secondMax = Integer.MIN_VALUE;//assume -1 for understanding
        System.out.println(secondMax);
                for(int index = 0;index<array.length;index++){
                    if (max < array[index]) {
                        secondMax = max;
                        max = array[index];
                    }
                    if(secondMax < array[index] && array[index]<max){
                        secondMax = array[index];
                    }
                }
        System.out.println("max : "+max);
        System.out.println("second Max : "+secondMax);
    }
}
