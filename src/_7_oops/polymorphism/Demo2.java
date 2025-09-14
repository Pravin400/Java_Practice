package _7_oops.polymorphism;

public class Demo2 {
    public static void main(String[] args) {
        //
        class MessageService {
            void sendMessage(String message) {
                System.out.println("sending message using email : " + message);
            }
        }

        class WhatsApp extends MessageService {
            //method overriding
            public void sendMessage(String message) {
                System.out.println("sending  through whatsApp: " + message);
            }
        }

        MessageService messageService1 = new WhatsApp();
        MessageService messageService2 = new MessageService();
        WhatsApp messageService = new WhatsApp();
//         WhatsApp message = new MessageService();
        messageService1.sendMessage("Parent ref and child obj");
        messageService2.sendMessage("parent ref and parent obj");
        messageService.sendMessage("child ref and child obj");
    }
}
