package Main.Java.Org.Shubham.StructuralPatterns.CompositePattern;

public class File implements FileSystemApp{
    private String name;

    File(String name){
        this.name = name;
    }

    /**
     *
     */
    @Override
    public void print() {
        System.out.println("File name is: "+ this.name);
    }
}
