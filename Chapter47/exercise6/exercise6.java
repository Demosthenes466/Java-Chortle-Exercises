import java.util.Scanner;

class DataTweaker
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner( System.in );
		float[] line = new float[13];

		for (int count = 0; count <=12; count ++) 
		{
			line[count] = scan.nextFloat();
			System.out.println("data[" + count + "] = " + line[count] );
		}

		float average = 0;
		float sum =0;
		for (int j=0; j < line.length; j++)
		{
			sum += line[j];
		}

		average = sum / line.length;
		System.out.println("Average: " + average);
		float farthest = 10;
		for (int j=0; j < line.length; j++)
		{
			if (Math.abs(average - line[j]) > Math.abs(farthest - line[j])) {
				farthest = line[j];

			}
		}

		System.out.println("Most distant value: " + farthest);
		float newAverage = (sum - farthest)/(line.length -1);
		System.out.println("New Average: " + newAverage);

	}
}