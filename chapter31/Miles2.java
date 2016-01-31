// File MilesPerGallon.java
//
import java.util.Scanner ;

class GasStop
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);

    double startMiles, gallons;
    int miles;

    System.out.println("New Car Odometer Reading: ");
    startMiles = scan.nextDouble();

    for( int j = 0; j < 2; j ++) {
      System.out.print("Odometer reading at station: " ); 
      miles = scan.nextInt();

      System.out.print("Gallons to fill tank: " ); 
      gallons = scan.nextDouble();

      Car car = new Car(startMiles, gallons  );
      car.fillUp(miles, gallons);

      System.out.println( "Miles per gallon is " + car.calculateMPG() );
      if (car.economyCar()) {
        System.out.println("Economy Car!");
      } else {
        System.out.println("Gas Hog!");
      }
      startMiles = miles;
    }
  }
}
