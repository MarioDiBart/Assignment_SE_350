package se350.Assignment1;

import java.util.Objects;
import se350.Assignment1.exception.BadParameterException;

public class Airport {

    private String airportName;

    public Airport(String name) throws BadParameterException {
      setAirportName(name);
    }

    public String getAirportName() {
      return airportName;
    }
    public void setAirportName(String airportName) throws BadParameterException {
      if (airportName.length() != 3){               // if the length of AirportName is not 3 throw BP Exception
        throw new BadParameterException( "Bad Value passed to setAirportName");
      }
      if (!isUpperCase(airportName)){       //if all letters are not uppercase throw BP exception
        throw new BadParameterException( "Bad Value Passed to setAirportName");
      }
      this.airportName = airportName;
    }
    public static boolean isUpperCase(String s)   //tests if the input string is all upperCase Letters.
    {
      for (int i=0; i<s.length(); i++)
      {
        if (!Character.isUpperCase(s.charAt(i)))
        {
          return false;
        }
      }
      return true;
    }

    @Override
    public String toString() {
      return getAirportName();
    }
    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Airport)) {
        return false;
      }
      Airport that = (Airport) o;
      return Objects.equals(getAirportName(), that.getAirportName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(getAirportName());
    }
  }


