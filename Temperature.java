public class Temperature {
    
    public static float celsiusToFahrenheit(float celsius) {
        return (float)(celsius*1.8+32);
    }

    public static float fahrenheitToCelsius(float fahrenheit) {
        return (float)((fahrenheit-32)/1.8);
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(32f));
        System.out.println(fahrenheitToCelsius(0f));
    }
}
