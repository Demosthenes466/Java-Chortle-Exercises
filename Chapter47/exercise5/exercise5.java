import java.io.* ;

class Smooth
{

  public static void main ( String[] args )  
  {
    int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
    int[] smooth = new int[12];
    

    smooth[0]  =  (signal[0] + signal[1])/2;
    smooth[ signal.length-1 ] = (signal[signal.length-1]+signal[signal.length-2])/2;
    for ( int j=1; j < signal.length-1; j++ )
    {
        smooth[j] = (signal[j-1] + signal[j] + signal[j+1])/3;
    }
      
    System.out.println("Input Values");
    // write out the input
    for ( int j=0; j < smooth.length; j++)
    {
        System.out.println(signal[j]);
    }
    System.out.println("Smoothed Values");
    // write out the result
    for ( int j=0; j < smooth.length; j++)
    {
        System.out.println(smooth[j]);
    }

  }
}      