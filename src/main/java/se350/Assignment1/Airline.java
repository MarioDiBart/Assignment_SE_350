package se350.Assignment1;

import java.util.Objects;
import se350.Assignment1.exception.BadParameterException;

public class Airline {

  private String airlineName;

  public Airline(String name) throws BadParameterException {
          setAirlineName(name);
  }

  public String getAirlineName() {
    return airlineName;
  }

  public void setAirlineName(String airlineName) throws BadParameterException {
    if (airlineName.length() >= 8){
      throw new BadParameterException("Airline name must be less than 8 characters");
    }
    this.airlineName = airlineName;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Airline)) {
      return false;
    }
    Airline airline = (Airline) o;
    return Objects.equals(getAirlineName(), airline.getAirlineName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAirlineName());
  }

  @Override
  public String toString() {
    return getAirlineName();
  }
}
