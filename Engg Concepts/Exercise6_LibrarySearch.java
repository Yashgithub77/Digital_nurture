public class Exercise6_LibrarySearch{
 static int linear(String[] b,String x){
  for(int i=0;i<b.length;i++) if(b[i].equals(x)) return i;
  return -1;
 }
 public static void main(String[] args){
  String[] books={"C","Java","Python"};
  System.out.println(linear(books,"Java"));
 }
}