public class Exercise7_RecursionForecast{
 static double future(double value,double rate,int years){
  if(years==0) return value;
  return future(value*(1+rate),rate,years-1);
 }
 public static void main(String[] args){
  System.out.println(future(1000,0.1,3));
 }
}