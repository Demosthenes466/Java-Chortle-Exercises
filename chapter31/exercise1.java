// File Car.java
//
import java.io.*;
import java.util.Scanner;

class Car
{
  // instance variables
  double startMiles;   // Stating odometer reading
  double endMiles;     // Ending odometer reading
  double gallons;      // Gallons of gas used between the readings

  // constructor
  Car( double first, double last, double gals )
  {
    startMiles = first ;
    endMiles   = last ;
    gallons    = gals ;
  }

  // methods
  double calculateMPG()
  {
    return (endMiles - startMiles)/gallons ;
  }

  boolean gasHog() {
    double mpg = calculateMPG();

    if (mpg < 15) {
      return true;
    } else {
      return false;
    }
  }

  boolean economyCar() {
    double mpg = calculateMPG();

    if (mpg > 15) {
      return true;
    } else {
      return false;
    }
  }


}


