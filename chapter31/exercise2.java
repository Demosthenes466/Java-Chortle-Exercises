// File Car.java
//
import java.io.*;
import java.util.Scanner;

class Car
{
  // instance variables
  double startMiles;   // Stating odometer reading
  // double endMiles;     // Ending odometer reading
  double gallons;      // Gallons of gas used between the readings
  double instanceMiles;
  double instanceGallons;

  // constructor
  Car( double first, double gals )
  {
    startMiles = first ;
    gallons    = gals ;
  }

  void fillUp(int miles, double gallons) {
    instanceMiles = miles;
    instanceGallons = gallons;
  }

  double calculateMPG()
  {
    return (instanceMiles - startMiles)/instanceGallons;
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


