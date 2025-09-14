package _4_control_statements._2_switchDemos;

public class Deom03 {
    public static void main(String[] args) {
        int value=12;
        String result = switch (value){
//need to write the default condition every time otherwise gives CTE
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            default -> "Invalid Number";
        };
        System.out.println(result);
    }
}
