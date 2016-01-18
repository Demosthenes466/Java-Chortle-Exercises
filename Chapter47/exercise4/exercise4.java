import java.io.* ;

// class ReverseVersion1
// {
// 	public static void main( String[] args )
// 	{
// 		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

// 		for ( int j=0; j < data.length/2; j++) 
// 		{
// 			int temp = data[j];
// 			data[j] = data[data.length - j - 1];
// 			data[data.length - j - 1] = temp;
// 		}

// 		for ( int j=0; j < data.length; j++)
// 		{
// 			System.out.println(data[j]);
// 		}
// 	}
// }

class ReverseVersion2
{
	public static void main( String[] args )
	{
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] result = data;

		for ( int j=0; j < data.length; j++)
		{
			result[j] = data[data.length - j - 1];
		}

		for ( int j=0; j < result.length; j++)
		{
			System.out.println(result[j]);
		}
	}

}