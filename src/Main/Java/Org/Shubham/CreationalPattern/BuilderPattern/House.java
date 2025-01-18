package Main.Java.Org.Shubham.CreationalPattern.BuilderPattern;

public class House {
    private String type;
    private  String structure;

//    optional params below
    boolean hasgarage;
    boolean hasgarden;
    boolean haspool;

    private House(HouseBuilder builder){
        this.type = builder.type;
        this.structure = builder.structure;
        this.hasgarage = builder.hasgarage;
        this.hasgarden = builder.hasgarden;
        this.haspool = builder.haspool;
    }

    public void tostring(){
        System.out.println("House has: "+ this.type + " " + this.structure +" pool is: "+this.haspool + " garden is :"
                           + this.hasgarden + " has garage: " + this.hasgarage
        );
    }



    public static class HouseBuilder{
        private String type;
        private  String structure;

        //    optional params below
        boolean hasgarage;
        boolean hasgarden;
        boolean haspool;

        HouseBuilder(String type, String structure){
            this.type = type;
            this.structure = structure;
        }

        HouseBuilder setGarden(boolean setgarden){
            this.hasgarden = setgarden;
            return this;
        }

        HouseBuilder setGarage(boolean hasgarage){
            this.hasgarage = hasgarage;
            return this;
        }

        HouseBuilder setPool(boolean haspool){
            this.haspool = haspool;
            return this;
        }

        House build(){
            return new House(this);
        }



    }
}
