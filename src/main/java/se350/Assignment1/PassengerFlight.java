package se350.Assignment1;

import java.time.LocalDateTime;
import java.util.Objects;
import se350.Assignment1.exception.BadParameterException;
import se350.Assignment1.exception.NullParameterException;

public class PassengerFlight implements Flight {

  private int passengerCapacity;
  private Airline airline;
  private Airport origin;
  private Airport destination;
  private String flightNumber;
  private LocalDateTime departureTime;

  public PassengerFlight(Airline airLine, Airport from, Airport to, String fltNum, LocalDateTime time, int capacity) throws BadParameterException, NullParameterException {
    setAirline(airLine);
    setOrigin(from);
    setDestination(to);
    setFlightNumber(fltNum);
    setDepartureTime(time);
    setPassengerCapacity(capacity);
  }
  public int getPassengerCapacity() {
    return passengerCapacity;
  }

  public void setPassengerCapacity(int passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
  }

  public Airline getAirline() {
    return airline;
  }

  public void setAirline(Airline airline) {
    this.airline = airline;
  }

  public Airport getOrigin() {
    return origin;
  }

  public void setOrigin(Airport origin) {
    this.origin = origin;
  }

  public Airport getDestination() {
    return destination;
  }

  public void setDestination(Airport destination) {
    this.destination = destination;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public LocalDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(LocalDateTime departureTime) {
    this.departureTime = departureTime;
  }

  public String type(){
    String Type = "Passenger";
    return Type;
  }
  public String getFlightNumber() {
    return flightNumber;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%-20s %s%n", "Flight Type:", type()));
    sb.append(String.format("%-20s %s%n", "Airline:",getAirline()));
    sb.append(String.format("%-20s %S%n", "Origin:", getOrigin()));
    sb.append(String.format("%-20s %s%n", "Destination:", getDestination()));
    sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
    sb.append(String.format("%-20s %s%n","Departure Time:",departureTime.toString()));
    sb.append(String.format("%-20s %d%n", "Passenger Capacity:",getPassengerCapacity()));
    return sb.toString();
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PassengerFlight)) {
      return false;
    }
    PassengerFlight that = (PassengerFlight) o;
    return getPassengerCapacity() == that.getPassengerCapacity() && Objects.equals(
        getAirline(), that.getAirline()) && Objects.equals(getOrigin(), that.getOrigin())
        && Objects.equals(getDestination(), that.getDestination())
        && Objects.equals(getFlightNumber(), that.getFlightNumber())
        && Objects.equals(getDepartureTime(), that.getDepartureTime());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPassengerCapacity(), getAirline(), getOrigin(), getDestination(),
        getFlightNumber(), getDepartureTime());
  }
}
