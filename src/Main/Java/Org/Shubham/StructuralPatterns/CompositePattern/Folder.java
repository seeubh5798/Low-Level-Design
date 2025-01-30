package Main.Java.Org.Shubham.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemApp{

    private String name ;
    List<FileSystemApp> components ;
    Folder(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    void addComponent(FileSystemApp component){
        this.components.add(component);
    }
    /**
     *
     */
    @Override
    public void print() {
        System.out.println("Folder name: " + this.name +" and files inside it are");
        for(FileSystemApp component : this.components){
            component.print();;
        }
        if(this.components.isEmpty()){
            System.out.println("End of file");
        }

    }
}
