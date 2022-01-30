package se350.Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Date;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;

public final class FlightManager {

  private static FlightManager ourInstance;
  private FlightFactory factory;
  private Random rand = new Random();
  private Airline airline = new Airline("Delta");

  private Airport airport1 = new Airport("ORD");
  private Airport airport2 = new Airport("MIA");

  public List<Flight> flights = new ArrayList<Flight>() {
  };

  public static FlightManager getInstance() throws Exception {
    if (ourInstance == null) {
      ourInstance = new FlightManager();
    }
    return ourInstance;
  }

  FlightManager() throws BadParameterException {

  }

  public void createFlight() throws BadParameterException, NullParameterException {
    flights.add(factory.createFlight("Commercial", airline, airport1, airport2,
        String.valueOf(rand.nextInt(10000)), java.time.LocalDateTime.now()));

  }

  public Flight getFlightByNumber(String flightNum) throws BadParameterException {
    for (int i = 0; i < flights.size(); i++) {
      if (flights.get(i).getFlightNumber() == flightNum) {
        return flights.get(i);
      }
    }
    throw new BadParameterException("The Flight number was not Found in the Flights List");
    }
  }



