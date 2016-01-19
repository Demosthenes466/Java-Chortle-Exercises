import java.io.* ;

class Weight
{
  private int[] data;
  
  // Constructor
  Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j=0; j < data.length; j++) {
      data[j] = init[j];
    }
  }

  public  float average() {
    float sum = 0;
    for (int j=0; j < data.length; j++)
    {
      sum += data[j];
    }
    float avg = sum/data.length;
    return avg;
  }

  public float subAverage( int start, int end) {
    float sum = 0;
    int length = 0;
    for (int j=start; j <= end; j ++) {
      sum += data[j];
      length += 1;
    }
    float subAvg = sum/length;
    return subAvg;
  }
  
  //Print
  public String toString() {
  {

    return Integer.toString(data[1]);
    // for(int j=0; j < data.length; j++)
    // {
    //   return data[j];
    // }
  }
}
}

