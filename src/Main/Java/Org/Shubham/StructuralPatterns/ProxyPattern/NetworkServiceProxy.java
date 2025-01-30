package Main.Java.Org.Shubham.StructuralPatterns.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class NetworkServiceProxy implements NetworkService{
    private RealNetworkService realNetworkService;
    private Map<String, String> cache;

    public NetworkServiceProxy() {
        // TODO: Initialize the cache to store fetched data.
        cache = new HashMap<String, String>();


    }
    /**
     * @param input
     * @return
     */
    @Override
    public String fetchData(String input) {
        if(cache.containsKey(input)){
            System.out.println("Fetching data from cache");
            return cache.get(input);
        }

        if(realNetworkService == null){

            realNetworkService = new RealNetworkService();
        }

        // TODO: Fetch data from the real network service using the provided input.
        String data = realNetworkService.fetchData(input);
        cache.put(input ,data );

        // TODO: Cache the fetched data with the input as the key for future access.

        return cache.get(input);
        // TODO: Return the fetched data to the client.

    }
}
