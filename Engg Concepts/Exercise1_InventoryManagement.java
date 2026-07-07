import java.util.*;
class Product{
 int id,qty; String name; double price;
 Product(int i,String n,int q,double p){id=i;name=n;qty=q;price=p;}
}
public class Exercise1_InventoryManagement{
 public static void main(String[] args){
  HashMap<Integer,Product> inv=new HashMap<>();
  inv.put(1,new Product(1,"Pen",50,10));
  inv.put(2,new Product(2,"Book",20,50));
  inv.get(1).qty=100; // update
  inv.remove(2); // delete
  for(Product p:inv.values()) System.out.println(p.name+" "+p.qty);
 }
}