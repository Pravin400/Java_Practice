package _8_Java_8_Features;


//Anonymous class
public class Demo2 {
    public static void main(String[] args) {
        abstract class MessageService{
            public abstract void send(String message);
        }

        MessageService messageService = new MessageService() {
            @Override
            public void send(String message) {
                System.out.println("Welcome : "+message);
            }

        };
        messageService.send("How are you ");
    }
}
