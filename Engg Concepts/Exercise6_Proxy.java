interface Image{void display();}class RealImage implements Image{public void display(){System.out.println("Image");}}
class ProxyImage implements Image{RealImage r;public void display(){if(r==null)r=new RealImage();r.display();}}
public class Exercise6_Proxy{public static void main(String[]a){new ProxyImage().display();}}