public class Car {
    private static String name;
    private static int maxXpeed;
    private static int price;
    private static boolean TÜV;
    private static int year;
    private static String country;

    public static int getMaxXpeed() {
        return maxXpeed;
    }

    public static void setPrice(int price) {
        Car.price = price;
    }

    public static String getName() {
        return name;


    }

    public static String getCountry() {
        return country;
    }

    public static int getYear() {
        return year;
    }
}
