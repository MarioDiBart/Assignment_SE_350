package se350.Assignment1;

import java.time.LocalDateTime;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;
import java.util.*;

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
}
