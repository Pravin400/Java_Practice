package _2_typecasting;

public class ExplicitTypeCasting {
//Explicit Type Casting Means Converting Bigger Data type to Smaller DAta type
//IN Explicit May Have Chances to Data Loss
public static void main(String[] args) {
    long numvalue = 10029;
    int bytevalue = (int)numvalue;
    System.out.println("Converted Int Value to Byte :"+bytevalue);
}

}
// -127 128
