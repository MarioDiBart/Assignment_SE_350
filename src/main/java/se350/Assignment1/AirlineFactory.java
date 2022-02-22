package se350.Assignment1;
import java.util.*;
import se350.Assignment1.exception.BadParameterException;

public class AirlineFactory {
    private static Map<String, Airline> airlineCache = new HashMap<>();

    private AirlineFactory() {}

    public static Airline getAirline(String airLineName) throws BadParameterException {
      return airlineCache.computeIfAbsent(airLineName, newAirLineName -> {
        try {
          return new Airline (airLineName);
        } catch (BadParameterException e) {
          return null;
        }
      });
    }
  }

