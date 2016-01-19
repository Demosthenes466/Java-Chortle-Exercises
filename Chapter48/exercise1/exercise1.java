import java.io.* ;

class Weight
{
  int[] data;
  
  // Constructor
  Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j=0; j < data.length; j++)
    {
      data[j] = init[j];
    }
  }

  float average() {
    float sum = 0;
    for (int j=0; j < data.length; j++)
    {
      sum += data[j];
    }
    float avg = sum/data.length;
    return avg;
  }
  
  //Print
  void String() {
  {
    for(int j=0; j < data.length; j++)
    {
      System.out.println("Data[" + j +"] = " + data[j]);
    }
  }
}
}

