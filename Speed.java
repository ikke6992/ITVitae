public class Speed {

    public static float milesPerHour(float meters, float seconds) {
        return meters/seconds*3.6f/1.609f;
    }

    public static float kilometersPerHour(float meters, float seconds) {
        return meters/seconds*3.6f;
    }

    public static float metersPerSecond(float meters, float seconds) {
        return meters/seconds;
    }

    public static float timeToSeconds(int hours, int minutes, int seconds) {
        return (float)(hours*3600 + minutes*60 + seconds);
    }
    
    public static void main(String[] args) {

        float meters = 2500f;
        float seconds = timeToSeconds(5, 56, 23);

        System.out.println(seconds);

        System.out.println("Uw snelheid in m/s is: " + metersPerSecond(meters, seconds));
        System.out.println("Uw snelheid in km/u is: " + kilometersPerHour(meters, seconds));
        System.out.println("Uw snelheid in mijl/u is: " + milesPerHour(meters, seconds));
    }
}
