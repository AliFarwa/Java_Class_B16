package Class22;
//Create a class File that will have the following behaviors: open, edit, close.
// Edit and close are implemented method while open is an abstract.
// reate 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of
// open behaviour: Example: to open .java file we need notepad++ or sublime text,
// to open .doc file we need Microsoft word to be installed etc.

public abstract class File {
  private String name;
  private int sizeOfFile;
   abstract void open();
   abstract void close();
   abstract void edit();

   public File(String name, int sizeOfFile) {
      this.name = name;
      this.sizeOfFile = sizeOfFile;
   }
   void printInfo(){
      System.out.println(name+" "+sizeOfFile);
   }

}
class JavaFile extends File{
   public JavaFile(String name, int sizeOfFile) {
      super(name, sizeOfFile);
   }

   @Override
   void open(){
      System.out.println(" We need notepad");
   }

   @Override
   void close() {
      System.out.println(" JavaFile closed");
   }

   @Override
   void edit() {
      System.out.println("Java file can edit");
   }

}
class WordFile extends File{
   public WordFile(String name, int sizeOfFile) {
      super(name, sizeOfFile);
   }

   @Override
   void open(){
      System.out.println(" we need Microsoft word");
   }

   @Override
   void close() {
      System.out.println(" world-file closed");
   }

   @Override
   void edit() {
      System.out.println(" we can edit world-file");
   }
}
class pdfFile extends File{
   public pdfFile(String name, int sizeOfFile) {
      super(name, sizeOfFile);
   }

   @Override
   void open(){
      System.out.println(" We need notepad");
   }

   @Override
   void close() {
      System.out.println(" Closed---PDF file");
   }

   @Override
   void edit() {
      System.out.println("Edited PDF");
   }
}
class FileTester {
   public static void main(String[] args) {


      File[] file = {new JavaFile("Java",52), new pdfFile("pdf",50), new WordFile("Word",20)};
      for (File f: file) {
         f.edit();
         f.close();
         f.open();
         f.printInfo();
      }
   }
}