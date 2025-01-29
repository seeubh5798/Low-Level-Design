package Main.Java.Org.Shubham.StructuralPatterns.AdapterPattern;

public class NewWeatherServiceAdapter implements WeatherService {

    private NewWeatherService newWeatherService;

    public NewWeatherServiceAdapter(NewWeatherService newWeatherService) {
        this.newWeatherService = newWeatherService;
    }

    @Override
    public String getWeatherData() {
        // TODO: Fetch weather data from the new weather service and return the formatted data
        return this.newWeatherService.fetchWeather();

    }
}
