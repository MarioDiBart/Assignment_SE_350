package se350.Assignment1;

import java.util.Date;
import java.util.Objects;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Flight {
  private Airline airline;
  private Airport origin;
  private Airport destination;
  private String flightNumber;
  private Date departureTime;

  public Flight(Airline airLine, Airport from, Airport to, String fltNum, Date time) throws BadParameterException, NullParameterException {
      setAirline(airLine);
      setOrigin(from);
      setDestination(to);
      setFlightNumber(fltNum);
      setDepartureTime(time);
  }

  public Airline getAirline() {
    return airline;
  }

  public void setAirline(Airline airline) throws NullParameterException {
    if(airline == null){
      throw new NullParameterException("Airline Object cannot be Null");
    }
    this.airline = airline;
  }

  public Airport getOrigin() {
    return origin;
  }

  public void setOrigin(Airport origin) throws NullParameterException {
    if(origin == null){
      throw new NullParameterException("Origin airport object cannot be null");
    }
    this.origin = origin;
  }
  public Airport getDestination() {
    return destination;
  }

  public void setDestination(Airport destination) throws NullParameterException {
    if(destination == null){
      throw new NullParameterException("Destination airport object cannot be null");
    }
    this.destination = destination;
  }
  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }
  public Date getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Date departureTime) {
    this.departureTime = departureTime;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Flight)) {
      return false;
    }
    Flight flight = (Flight) o;
    return getAirline().equals(flight.getAirline()) && getOrigin().equals(flight.getOrigin())
        && getDestination().equals(flight.getDestination()) && Objects.equals(
        getFlightNumber(), flight.getFlightNumber()) && Objects.equals(getDepartureTime(),
        flight.getDepartureTime());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAirline(), getOrigin(), getDestination(), getFlightNumber(),
        getDepartureTime());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%-20s %s%n", "Airline:",getAirline()));
    sb.append(String.format("%-20s %S%n", "Origine:", getOrigin()));
    sb.append(String.format("%-20s %s%n", "Destination:", getDestination()));
    sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
    sb.append(String.format("%-20s %s%n","Departure Time:",departureTime.toString()));
    return sb.toString();
  }
}
