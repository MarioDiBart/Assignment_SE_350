package se350.Assignment1;

import java.util.Date;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;

public class TravelManager {

   public static void main(String[] args) throws BadParameterException, NullParameterException {
    Airline airline = new Airline("Delta");

    Airport airport1 = new Airport("ORD");
    Airport airport2 = new Airport("MIA");

    Date date = new Date(2022,01,19,12,30);

    Flight flight = new Flight(airline, airport1,airport2, "1223", date);

    System.out.println(flight);
  }
}
