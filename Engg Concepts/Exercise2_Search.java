import java.util.*;
public class Exercise2_Search{
 static int linear(int[] a,int x){for(int i=0;i<a.length;i++) if(a[i]==x) return i; return -1;}
 static int binary(int[] a,int x){
  int l=0,r=a.length-1;
  while(l<=r){int m=(l+r)/2; if(a[m]==x)return m; if(a[m]<x)l=m+1; else r=m-1;}
  return -1;
 }
 public static void main(String[] args){
  int[] a={10,20,30,40,50};
  System.out.println(linear(a,30));
  System.out.println(binary(a,30));
 }
}