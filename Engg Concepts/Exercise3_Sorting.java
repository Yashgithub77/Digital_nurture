import java.util.*;
public class Exercise3_Sorting{
 static void bubble(int[] a){
  for(int i=0;i<a.length-1;i++)
   for(int j=0;j<a.length-i-1;j++)
    if(a[j]>a[j+1]){int t=a[j];a[j]=a[j+1];a[j+1]=t;}
 }
 static void quick(int[] a,int l,int h){
  if(l<h){int p=part(a,l,h);quick(a,l,p-1);quick(a,p+1,h);}
 }
 static int part(int[] a,int l,int h){
  int piv=a[h],i=l-1;
  for(int j=l;j<h;j++) if(a[j]<piv){i++;int t=a[i];a[i]=a[j];a[j]=t;}
  int t=a[i+1];a[i+1]=a[h];a[h]=t; return i+1;
 }
 public static void main(String[] args){
  int[] a={5,3,8,1,2}; quick(a,0,a.length-1); System.out.println(Arrays.toString(a));
 }
}