package prog2.exercise5.flight.booking.system;


import java.time.LocalDate;
import java.util.Random;

public class Main
{
    public static void main( String[] args )
    {        String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-14";
        LocalDate returnDate = LocalDate.parse(sreturn);
        Random random = new Random();
        int flightID = random.nextInt(9999 - 1000)+1000;
        String flightNumber = "FOF" + flightID;
        String SourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT ";
        String DestinationAirport = "OULU AIRPORT";
        int size = 3;
        FlightBooking fb = new FlightBooking(size);
        String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
        String [] gender = {"Male", "Female", "Other"};
        int [] age = {43, 32, 21};
        for(int i=0; i<size; ++i){
            fb.setPassengerFullName(i, fullName[i]);
            fb.setPassengerGender(i, gender[i]);
            fb.setPassengerAge(i, age[i]);
        }
        for(int j=0; j<size; ++j){
            if((fb.getPassengerFullName(j) == fullName[j]) && (fb.getPassengerGender(j) == gender[j])
                    && fb.getPassengerAge(j) == age[j]){
                fb.setPassengerFullName(1,"Matt Jive");
            }
            else{
                fb.setPassengerFullName(1,"Sally Fields");
            }
        }
        for (int j=0; j <size; ++j){
            fb.setTicketNumber(j);
        }

        /*FlightBooking.TripSource source = FlightBooking.TripSource.NANJING;
        FlightBooking.TripDestination destination = FlightBooking.TripDestination.BEIJING;
        FlightBooking.TripType type = FlightBooking.TripType.ONE_WAY;
        FlightBooking.BookingClass bookClass = FlightBooking.BookingClass.FIRST;
        fb.setTripSource("1");
        fb.setTripDestination("1", "2");
        fb.setTripType("1");
        fb.setBookingClass("1");
        String expectedTicketNumber = "11FASDFDOM";
        String expectedSubstring1 = expectedTicketNumber.substring(0,2);
        String expectedSubstring2 = expectedTicketNumber.substring(7, 9);*/

        String ticketNumber = fb.getTicketNumber(3);

        /*String returnedSubstring1 = ticketNumber.substring(0, 2);
        String returnedSubstring2 = ticketNumber.substring(7, 9);*/
        System.out.println(ticketNumber);
        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();
        fb.setPassengerFullName(1,"Joe Doe");
        //fb.setTicketNumber(1);
        //fb = new FlightBooking(null, null, null, 0, 0);
        fb.setTripSource("2") ;
        fb.setTripDestination("OULU"," Helsinki");
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setDepartureDate(depart);
        fb.setReturnDate(returnDate);


        System.out.println("Dear " + fb.getPassengerFullName(1) + ". Thank you for booking your flight with " +
                fb.getFlightCompany() + "." +" \n " +
                "Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber(1) + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Date of departure: " + fb.getDepartureDate() + "\n" +
                "Date of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + fb.getTotalTicketPrice());
    }
}
