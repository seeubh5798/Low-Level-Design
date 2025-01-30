package Main.Java.Org.Shubham.StructuralPatterns.ProxyPattern;

public class RealNetworkService implements NetworkService{
    /**
     * @param input
     * @return
     */
    @Override
    public String fetchData(String input) {
        String data = "Data fetched from remote server for input: " + input;
        return data;
    }
}
