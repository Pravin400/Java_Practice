package _8_Java_8_Features;


//Anonymous class
public class Demo1 {
    public static void main(String[] args) {

        abstract class MessageService{
            public abstract void send(String message);
        }

        class Whatsapp extends  MessageService {

            @Override
            public void send(String message) {
                System.out.println("Hello boys how are you : " + message);

            }
        }

        MessageService service = new Whatsapp();
        service.send("Fine");
    }
}
