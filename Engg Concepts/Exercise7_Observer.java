import java.util.*;interface Observer{void update();}class User implements Observer{public void update(){System.out.println("Updated");}}
class Stock{List<Observer> l=new ArrayList<>();void add(Observer o){l.add(o);}void notifyAllObs(){for(Observer o:l)o.update();}}
public class Exercise7_Observer{public static void main(String[]a){Stock s=new Stock();s.add(new User());s.notifyAllObs();}}