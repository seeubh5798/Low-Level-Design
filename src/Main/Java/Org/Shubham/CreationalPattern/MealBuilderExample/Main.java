package Main.Java.Org.Shubham.CreationalPattern.MealBuilderExample;

// This file gathers meal components from user input and constructs full and simple meals using the Builder design pattern.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        run();

    }
    public static void run () {

        Scanner sc = new Scanner(System.in);

        // Get full meal components from user
        String fullMainDish = sc.nextLine();

        String fullSideDish = sc.nextLine();

        String fullDrink = sc.nextLine();

        String fullDessert = sc.nextLine();

        String fullAppetizer = sc.nextLine();

        // TODO: Construct a full meal using MealBuilder with the provided components.


        System.out.println("Full Meal Summary:");

        // TODO: Print the summary of the constructed full meal.
        MealBuilder mb1 = new MealBuilder(fullMainDish, fullSideDish, fullDrink).setDessert(fullDessert).setAppetizer(fullAppetizer);

        Meal m1 = Meal.getInstance(mb1);

        m1.printMealSummary();
        // Get simple meal components from user
        String simpleMainDish = sc.nextLine();

        String simpleSideDish = sc.nextLine();

        String simpleDrink = sc.nextLine();

        // TODO: Construct a simple meal using MealBuilder with the provided components.
        MealBuilder mb2 = new MealBuilder(simpleMainDish, simpleSideDish, simpleDrink);

        Meal m2 = Meal.getInstance(mb2);

        // m2.printMealSummary();

        System.out.println("Simple Meal Summary:");

        // TODO: Print the summary of the constructed simple meal.
        m2.printMealSummary();


        sc.close();
    }
}
