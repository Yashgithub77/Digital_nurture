interface Command{void execute();}class Light{void on(){System.out.println("ON");}}
class OnCommand implements Command{Light l=new Light();public void execute(){l.on();}}
public class Exercise9_Command{public static void main(String[]a){new OnCommand().execute();}}