package se350.Assignment1;

import java.util.HashMap;
import java.util.Map;
import se350.Assignment1.exception.BadParameterException;

public class AirportFactory {
  private static Map<String, Airport> airportCache = new HashMap<>();

  private AirportFactory() {}

  public static Airport getAirport(String airportName) throws BadParameterException {
    return airportCache.computeIfAbsent(airportName, newAirportName -> {
      try {
        return new Airport (airportName);
      } catch (BadParameterException e) {
        return null;
      }
    });
  }
}

