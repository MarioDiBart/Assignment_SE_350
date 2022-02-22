package se350.Assignment1;

import java.time.LocalDateTime;
import java.util.Date;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;

public class TravelManager {

   public static void main(String[] args) throws Exception, NullParameterException {



  System.out.println(FlightManager.getInstance());
  System.out.println(FlightManager.getInstance());
  System.out.println(FlightManager.getInstance());
  System.out.println(FlightManager.getInstance());

  FlightManager manager = FlightManager.getInstance();

  String firstFlight = manager.createFlight("Commercial");
  System.out.println(manager.getInstance().getFlightByNumber(firstFlight)); //getElement is there for testing purposes only.

  String secondFlight =manager.createFlight("Passenger");
  System.out.println(manager.getInstance().getFlightByNumber(secondFlight)); //getElement is there for testing purposes only.

  //manager.getFlightByNumber("1000000000"); // Shows that Exception is thrown on a bad flight number search

  }
}
