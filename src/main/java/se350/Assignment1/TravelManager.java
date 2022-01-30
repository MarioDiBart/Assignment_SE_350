package se350.Assignment1;

import java.time.LocalDateTime;
import java.util.Date;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;

public class TravelManager {

   public static void main(String[] args) throws BadParameterException, NullParameterException {


  FlightManager manager = new FlightManager();
  manager.createFlight();

  System.out.println(manager.flights);
  System.out.println(manager.getFlightByNumber((manager.flights.get(0)).getFlightNumber()));

  manager.getFlightByNumber("1000000000");

  }
}
