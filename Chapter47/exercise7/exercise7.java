import java.util.Scanner;

class FurtherTweaking
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner( System.in );
		float[] line = new float[14];

		for (int count = 0; count < 14; count ++) 
		{
			line[count] = scan.nextFloat();
			// System.out.println("data[" + count + "] = " + line[count] );
		}

		float a1 = 0;
		float sum =0;
		for (int j=0; j < line.length; j++)
		{
			sum += line[j];
		}

		a1 = sum / line.length;

		System.out.println("A1: " + a1);
		float farthest = 10;
		float secondFarthest = 5;
		float thirdFarthest = 6;
		int exclude = 0;
		int secondExclude = 0;
		int thirdExclude = 0;

		for (int j=0; j < line.length; j++)
		{
			if (Math.abs(a1 - line[j]) > Math.abs(a1 - farthest)) {
				farthest = line[j];
			} else if (Math.abs(a1 - line[j]) > Math.abs(a1 - secondFarthest)) {
				secondFarthest = line[j];
				exclude = j;
			} else if (Math.abs(a1 - line[j]) > Math.abs(a1 - thirdFarthest)) {
				thirdFarthest = line[j];
			}
		}
		float a2 = (sum - farthest)/(line.length -1);
		System.out.println("A2: " + a2);

		// for (int j=0; j < exclude; j++ )
		// {
		// 	if (Math.abs(a2 - line[j]) > Math.abs(secondFarthest - line[j])) {
		// 		secondFarthest = line[j];
		// 		secondExclude = j;
		// 	}
		// }
		float a3 = (sum - farthest - secondFarthest)/(line.length - 2);
		System.out.println("A3: " + a3);

		float a4 = (sum - farthest - secondFarthest - thirdFarthest)/(line.length - 3);
		System.out.println("A4: " + a4);
		System.out.println("Most distant value: " + farthest);
		System.out.println("Most second distant value: " + secondFarthest);
		System.out.println("Most third distant value: " + thirdFarthest);



	}
}