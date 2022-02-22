package se350.Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;

public final class FlightManager {

  private static FlightManager ourInstance;
  private Random rand = new Random();


  private List<Flight> flights = new ArrayList<Flight>() {
  };

  public static FlightManager getInstance() throws Exception {
    if (ourInstance == null) {
      ourInstance = new FlightManager();
    }
    return ourInstance;
  }

  private FlightManager() throws BadParameterException {

  }

  public String createFlight(String type) throws BadParameterException, NullParameterException {
    String flightID = String.valueOf(rand.nextInt(10000));
    if (type == "Commercial") {
      flights.add(FlightFactory.createFlight("Commercial", AirlineFactory.getAirline("Delta"), AirportFactory.getAirport("ORD"), AirportFactory.getAirport("MIA"),
        flightID, java.time.LocalDateTime.now()));
    }
    if (type == "Passenger") {
      flights.add(FlightFactory.createFlight("Passenger", AirlineFactory.getAirline("United"), AirportFactory.getAirport("LAX"), AirportFactory.getAirport("OHR")
          , flightID, java.time.LocalDateTime.now(), 200));
    }
    return flightID;
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



