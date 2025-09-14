package _8_Java_8_Features;

//anonymous class is a class that don't have the name
public class Demo2_AnonymousClass {
    public static void main(String[] args) {
        abstract class MessageService{
            public void showMessage(String msg){

            }
        }
//        class WhatsappService extends MessageService{
//            public void showMessage(String msg){
//                System.out.println("this is subclass/childclass :- "+msg);
//            }
//
//        }

        MessageService m = new MessageService() {
        public void showMessage(String msg){
        System.out.println(msg);}
        };

        m.showMessage("Hello World from anonymous class");
    }
}
