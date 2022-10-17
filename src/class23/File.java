package class23;

public abstract class File {
    /*Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented
     method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
     implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
     to open .doc file we need Microsoft Word to be installed etc
     */

    abstract void open();

    void edit(){
        System.out.println("User can edit this file");
    }
    void close(){
        System.out.println("User can close this file");
    }
}

class JavaFile extends File{
    void open(){
        System.out.println("To open .java file we need Notepad");
    }
}

class WordFile extends File{
    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft Word");
    }
}

class PdfFile extends File{
    void open(){
        System.out.println("to open .pdf file we need Adobe Acrobat");
    }
}