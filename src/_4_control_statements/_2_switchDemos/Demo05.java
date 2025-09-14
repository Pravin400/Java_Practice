package _4_control_statements._2_switchDemos;

public class Demo05 {
    public static void main(String[] args) {
        String fileType = "pdf";
        int x = 10;
        String logic = switch (fileType){
            case "pdf" -> "Pdf File";
            case "xml" -> "xml File";
            case "csv" -> "csv File";
            case "xls" -> "xls File";
            case "txt" -> "txt File";
            default -> "Invalid filetype";
        };
        System.out.println(logic);
    }
}
