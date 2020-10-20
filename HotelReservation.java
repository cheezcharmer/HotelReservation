import java.util.*;
public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system. Start by adding the first hotel");
        HashMap<String, String> hotels = addHotelRegular();

    }

    public static HashMap<String, String> addHotelRegular() {
        HashMap<String, String> hotelDetails = null;
        Scanner hotel = new Scanner(System.in);
        System.out.print("Enter Hotel Name: ");
        String hotelName = hotel.nextLine();
        hotelDetails.put("Name", hotelName);
        System.out.println("Enter the following details for Regular customers");
        System.out.print("Enter Weekday Rate");
        String weekdayRateRegular = hotel.nextLine();
        System.out.print("Enter Weekend Rate");
        String weekendRateRegular = hotel.nextLine();
        hotelDetails.put("Weekday", weekdayRateRegular);
        hotelDetails.put("Weekend", weekendRateRegular);
        return hotelDetails;

    }
}
