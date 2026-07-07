interface Notifier{void send();}class Email implements Notifier{public void send(){System.out.println("Email");}}
class SMS implements Notifier{Notifier n;SMS(Notifier n){this.n=n;}public void send(){n.send();System.out.println("SMS");}}
public class Exercise5_Decorator{public static void main(String[]a){new SMS(new Email()).send();}}