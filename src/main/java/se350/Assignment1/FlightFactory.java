package se350.Assignment1;

import java.time.LocalDateTime;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;


public class FlightFactory {

  private FlightFactory(){

  }
  public static Flight createFlight(String type, Airline airline, Airport from, Airport to, String flightNum, LocalDateTime time)
      throws BadParameterException, NullParameterException {
    if (type.equals("Commercial")){
      return new CommercialFlight(airline, from, to, flightNum, time);
    }
    else {
      return null;
    }
  }
  public static Flight createFlight(String type, Airline airline, Airport from, Airport to, String flightNum, LocalDateTime time, int capacity)
      throws BadParameterException, NullParameterException {
    if (type.equals("Passenger") && capacity > 0) {
      return new PassengerFlight(airline, from, to, flightNum, time,capacity);
    }
    else {
      return null;
    }
  }
}
