package Main.Java.Org.Shubham.StructuralPatterns.FlyWeightPattern;

public class Main {
    public static void main(String[] args) {
        BulletFactory.getBullettype("red");
       BulletType p =  BulletFactory.getBullettype("pink");

        for(int i=0;i<5;i++){
            Bullet b = new Bullet(10+i, 2*i, 3*i, "red");
            b.print();
        }


            Bullet b1 = new Bullet(10, 2, 3, "pink");
            b1.print();
            Bullet b2 = new Bullet(10, 2, 3, "pink");
            b2.print();
            Bullet b3 = new Bullet(10, 2, 3, "pink");
            b3.print();
            Bullet b4 = new Bullet(10, 2, 3, "pink");
            b4.print();
            Bullet b5 = new Bullet(10, 5, 5, "pink");
            b5.print();



            Bullet b = new Bullet(10, 2, 3, "pink");
            BulletFactory.changecolor("pink" , "blue");
            b.print();
            b5.print();
            b4.print();

            System.out.println("-------------");

        System.out.println(BulletFactory.getBullettype("pink").getColor());



    }
}
