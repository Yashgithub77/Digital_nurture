interface Document{void open();}class Pdf implements Document{public void open(){System.out.println("PDF");}}
abstract class Factory{abstract Document create();}
class PdfFactory extends Factory{Document create(){return new Pdf();}}
public class Exercise2_Factory{public static void main(String[]a){new PdfFactory().create().open();}}