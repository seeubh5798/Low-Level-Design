package Main.Java.Org.Shubham.StructuralPatterns.CompositePattern;

public class Main {

    public static void main(String[] args) {
        Folder folder1 = new Folder("Folder 1");
        FileSystemApp file1 = new File("File 1,1");
        FileSystemApp file2 = new File("File 1,2");
        FileSystemApp file3 = new File("File 1,3");
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder1.addComponent(file3);

        FileSystemApp file4 = new File("File 2,1");
        FileSystemApp file5 = new File("File 2,2");
        Folder folder2 = new Folder("Folder 2");
        folder2.addComponent(file4);
        folder2.addComponent(file5);

        Folder main = new Folder("Main folder");
        main.addComponent(folder1);
        main.addComponent(folder2);

        main.print();



    }
}
