public class Zadania {
    public static void main(String[] args) {
        /*
        7.	Prędkość światła wynosi 299 792 458 m/s. Ile to jest km na sekundę? A ile km na godzinę? Oraz ile metrów na godzinę?
        8.	Odległość słońce-ziemia wynosi około 150 000 000 km. Ile minut i sekund potrzeba, aby promienie dotarły do ziemi?
         */

        long speedOfLightMS = 299792458L;
        long speedOfLightKMS = speedOfLightMS / 1000L;
        long speedOfLightKMH = speedOfLightKMS * 60L * 60L;
        long speedOfLightMH = speedOfLightMS * 60L * 60L;

        System.out.println("m/s " + speedOfLightMS);
        System.out.println("km/s " + speedOfLightKMS);
        System.out.println("km/h " + speedOfLightKMH);
        System.out.println("m/h " + speedOfLightMH);

        long distanceEarthSun = 150000000L;
        long durationInS = distanceEarthSun / speedOfLightKMS;
        System.out.println("duration earth sun in seconds: " + durationInS);
        long minutes = durationInS / 60L;
        long seconds = durationInS % 60L;
        System.out.println("duration earth sun in minutes: " + minutes + " and seconds: " + seconds);

        for (int i = 1; i <= 100; i++) {
            boolean f = false;
            boolean b = false;
            if (i % 3 == 0) {
                f = true;
            }
            if (i % 5 == 0) {
                b = true;
            }

            String result = "" + i;
            if (f) {
                result = result + " Fizz";
            }
            if (b) {
                result = result + " Buzz";
            }

            System.out.println(result);
        }
    }
}
