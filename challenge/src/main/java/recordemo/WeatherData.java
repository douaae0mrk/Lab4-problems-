package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {
    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*9/5+32;
    }
    // Instance method to get a formatted summary string
    public String getSummary() {
        return "Current weather: "+temperatureCelsius+ "°C(" + temperatureFahrenheit()+"°F) and "+conditions;
    }
    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempCelsius= (tempFahrenheit-32)*5/9;
       return new WeatherData(tempCelsius, conditions);
    }

    public static void main(String[] args) {
        WeatherData todaySWeather = new WeatherData(25 ,"Sunny ");
        WeatherData yesterdaySWeather = WeatherData.fromFahrenheit(50 , "Cloudy");
        System.out.println("Today's weather: " + todaySWeather.getSummary());
        System.out.println("Yesterday's weather: "+yesterdaySWeather.getSummary());
    }
}
