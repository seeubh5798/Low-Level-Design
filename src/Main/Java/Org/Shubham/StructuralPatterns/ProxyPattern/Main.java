package Main.Java.Org.Shubham.StructuralPatterns.ProxyPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        NetworkService networkService = new NetworkServiceProxy();
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        // TODO: Fetch data using the networkService and print the result
        String firstFetch = networkService.fetchData(userInput);
        System.out.println(firstFetch);

        // Second call: should retrieve from the cache
        String secondFetch = networkService.fetchData(userInput);
        System.out.println(secondFetch);

        sc.close();
    }
}
