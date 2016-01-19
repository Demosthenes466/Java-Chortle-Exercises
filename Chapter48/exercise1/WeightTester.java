import java.util.Scanner;

public class WeightTester
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};

    Scanner scan = new Scanner(System.in);

    int userStart = scan.nextInt();
    int userEnd = scan.nextInt();

    Weight june = new Weight( values );
    float avg = june.average();
    float subAverage = june.subAverage(userStart, userEnd);
    System.out.println("average = " + avg);
    System.out.println("subAverage = " + subAverage);
  }
}      