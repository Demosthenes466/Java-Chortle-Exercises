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
		float farthest = line[0];



		for (int j=0; j < line.length; j++)
		{
			if (Math.abs(line[j] - a1) > Math.abs(farthest - a1)) {
				farthest = line[j];
			} 
		}

		float a2 = (sum - farthest)/(line.length -1);
		farthest = line[0];
		float secondFarthest = line[1];

		for (int j=0; j < line.length; j++)
		{
			if(Math.abs(line[j] - a2) > Math.abs(farthest - a2)) {
				farthest = line[j];
			} else if (Math.abs(line[j] - a2) > Math.abs(secondFarthest - a2)) {
				secondFarthest = line[j];
			}
		}

		float a3 = (sum - farthest - secondFarthest)/(line.length - 2);
		farthest = line[0];
		secondFarthest = line[1];
		float thirdFarthest = line[2];	

		for (int j=0; j < line.length; j++)
		{
			if(Math.abs(line[j] - a3) > Math.abs(farthest - a3)) {
				farthest = line[j];
			} else if (Math.abs(line[j] - a3) > Math.abs(secondFarthest - a3)) {
				secondFarthest = line[j];
			} else if (Math.abs(line[j] - a3) > Math.abs(thirdFarthest - a3)) {
				thirdFarthest = line[j];
			}
		}

		float a4 = (sum - farthest - secondFarthest - thirdFarthest)/(line.length - 3);
		System.out.println("A2: " + a2);


		System.out.println("A3: " + a3);

		
		System.out.println("A4: " + a4);
		System.out.println("Most distant value: " + farthest);
		System.out.println("Most second distant value: " + secondFarthest);
		System.out.println("Most third distant value: " + thirdFarthest);



	}
}