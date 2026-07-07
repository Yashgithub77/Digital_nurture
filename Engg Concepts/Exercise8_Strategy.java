interface Pay{void pay();}class Card implements Pay{public void pay(){System.out.println("Card");}}
class Context{Pay p;Context(Pay p){this.p=p;}void execute(){p.pay();}}
public class Exercise8_Strategy{public static void main(String[]a){new Context(new Card()).execute();}}