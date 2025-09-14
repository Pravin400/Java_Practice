package _8_Java_8_Features;

//anonymous class is a class that don't have the name
public class Demo1_non_AnonymousClass {
    public static void main(String[] args) {
        abstract class MessageService{
            public void showMessage(String msg){

            }
        }
        class WhatsappService extends MessageService{
            public void showMessage(String msg){
                System.out.println("this is subclass/childclass :- "+msg);
            }

        }
//create whatsappservice object but store in the messageservice reference
//creating the child object but storing it in a parent reference
        MessageService m = new WhatsappService();
        m.showMessage("Hello World from anonymous class");
    }
}
