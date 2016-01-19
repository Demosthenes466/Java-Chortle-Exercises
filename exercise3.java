import java.io.* ; 

class NearlyZero
{
	public static void main ( String[] args )
	{
		int[] data = {3, 1, 5, 6, 4, 12, -3, 8, -2};

		//declare and initialize variables
		int largest = 100;
		int smallest = 0;
		//find the element neartest to zero
		for (int index = 0; index < data.length; index ++)
		{
			if (Math.abs(0 - Math.abs(data[index])) <=  Math.abs(largest - Math.abs(data[index]))) {
				smallest = data[index];
				largest = data[index];
			}
		}
		// write out the element nearest to zero
		System.out.println(smallest);



	}
}