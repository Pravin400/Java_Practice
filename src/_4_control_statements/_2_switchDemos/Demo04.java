package _4_control_statements._2_switchDemos;

public class Demo04 {
    public static void main(String[] args) {
         int value = 66;
        String result = switch (value) {
// switch case converts the every character into integer as a ascii
//            case 65 -> "Two";//so because of that here give error
            case 66 -> "Sixty-Five";
            case 'A' -> "Sixty-Five";
//            case 'B' -> "Sixty-Six";
            case 4 -> "four";
            case 5 -> "Five";
            default -> "invalid number";
        };
        System.out.println(result);
    }
}
