public class Address {
    public static String createAddress(String country){
        return String.format("Country: %s", country);
    }
    public static String createAddress(String country, String city){
        return String.format("Country: %s, City: %s", country, city);
    }
    public static String createAddress(String country, String city, String postal_number){
        return String.format("Country: %s, City: %s, Postal number: %s", country, city, postal_number);
    }
    public static String createAddress(String country, String city, String postal_number, String street){
        return String.format("Country: %s, City: %s, Postal number: %s, Street name: %s", country, city, postal_number, street);
    }
    public static String createAddress(String country, String city, String postal_number, String street, int house_num){
        return String.format("Country: %s, City: %s, Postal number: %s, Street name: %s, House number: %d", country, city, postal_number, street, house_num);
    }
}
