package Main.Java.Org.Shubham.StructuralPatterns.AdapterPattern;

import java.util.Scanner;

public class Main {

    public static void run() {

        Scanner sc = new Scanner(System.in);

        String legacyTemperature = sc.nextLine();
        String legacyCondition = sc.nextLine();

        // Using the legacy weather service with user input
        WeatherService legacyService = new LegacyWeatherService(legacyTemperature, legacyCondition);
        System.out.println("Legacy Weather Service Data:");
        System.out.println(legacyService.getWeatherData());
        // TODO: Print the weather data retrieved from the Legacy weather service.


        String temperature = sc.nextLine();
        String condition = sc.nextLine();

        NewWeatherService newService = new NewWeatherService(temperature, condition);

        // TODO: Create an adapter for the new weather service.


        WeatherService adaptedService = new NewWeatherServiceAdapter(newService);
        System.out.println("New Weather Service Data:");
        System.out.println(adaptedService.getWeatherData());
        // TODO: Print the weather data retrieved from the new weather service.



        sc.close();
    }

    public static void main(String[] args) {
        run();
    }
}
