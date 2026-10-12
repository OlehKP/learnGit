public class Car {
    private static String name;
    private static int maxXpeed;
    private static int price;
    private static boolean TÜV;
    private static int year;
    private static String country;

    public  int getMaxXpeed() {
        return maxXpeed;
    }

    public static void setPrice(int price) {
        Car.price = price;
    }

    public String getName() {
        return name;


    }

    public static String getCountry() {
        return country;
    }

    public static int getYear() {
        return year;
    }

    public static void setTÜV(boolean TÜV) {
        Car.TÜV = TÜV;
    }

    public Car(String name, int maxXpeed, int price, boolean TÜV, int year, String country) {
        this.name = name;
        this.maxXpeed = maxXpeed;
        this.price = price;
        this.TÜV = TÜV;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
