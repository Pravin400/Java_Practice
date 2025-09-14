package _4_control_statements._1_If_else;

public class Demo06 {
    public static void main(String[] args) {
        String file = "txt";
//        if("pdf" == "txt"){
//            System.out.println("pdf file");
//        }
//        else{
//            System.out.println("pdf file");
//        }
        if(true) {
            if (file.equals("pdf")) {
                System.out.println("1. pdf files reading logic");
            }
            if (file.equals("txt")) {
                System.out.println("2. txt files reading logic");
            }
            if (file.equals("xml")) {
                System.out.println("3. xml files reading logic");
            }
            if (file.equals("excel")) {
                System.out.println("4. excel files reading logic");
            }
            if (file.equals("json")) {
                System.out.println("5. json files reading logic");
            }
            if (file.equals("image")) {
                System.out.println("6. image files reading logic");
            }
            if (file.equals("video")) {
                System.out.println("7. video files reading logic");
            }
        }
        else{
            System.out.println("!!invalid File Format");
        }

    }
}
