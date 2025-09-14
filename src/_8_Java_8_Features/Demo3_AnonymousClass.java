package _8_Java_8_Features;


//anonymous class is a class that don't have the name
public class Demo3_AnonymousClass {
    public static void main(String[] args) {
//sample definition of the anonymous class
        class A{};
        class B extends A{};

        A a  =new A();

        A a2 = new A(){};


        interface MessageService{
            public abstract void showMessage(String msg);
        }
        class WhatsappService implements MessageService{
            public void showMessage(String msg){
                System.out.println("this is subclass/childclass :- "+msg);
            }

        }

        MessageService m = new MessageService() {
        public void showMessage(String msg){
        System.out.println(msg);}
        };
        m.showMessage("Hello World from anonymous class");

        WhatsappService ws = new WhatsappService();
        ws.showMessage("Hello World");

    }
}
