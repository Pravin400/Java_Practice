package _4_control_statements._1_If_else;

public class Demo07 {
    public static void main(String[] args) {
//        equals is moethod is use for only string
//        String number = "021";
//        if(number.equals("021")){
//
//        }
        double productPrise = 13000;
        double discount = 0.0;
        String bankOffer ="HDFC";
        if(bankOffer.equals("HDFC")){
            discount = productPrise * 0.05;;
        }
        else if(bankOffer.equals("ICIC")){
            discount = productPrise * 0.03;;
        }
        else if(bankOffer.equals("HSBC")){
            discount = productPrise * 0.01;;
        }
        else if(bankOffer.equals("BOB")){
            discount = productPrise * 0.06;;
        }
        else if(bankOffer.equals("Bank of Maharashtra")){
            discount = productPrise * 0.02;;
        }
        System.out.println(("Final prices "+(productPrise-discount)));


    }
}
