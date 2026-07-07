interface PaymentProcessor{void processPayment();}class Gateway{void pay(){System.out.println("Paid");}}
class Adapter implements PaymentProcessor{Gateway g=new Gateway();public void processPayment(){g.pay();}}
public class Exercise4_Adapter{public static void main(String[]a){new Adapter().processPayment();}}