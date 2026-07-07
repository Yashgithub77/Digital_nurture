class Node{int id;Node next;Node(int i){id=i;}}
public class Exercise5_LinkedListTask{
 static Node head;
 static void add(int x){Node n=new Node(x);n.next=head;head=n;}
 static void display(){for(Node t=head;t!=null;t=t.next)System.out.print(t.id+" ");}
 public static void main(String[] args){add(1);add(2);display();}
}