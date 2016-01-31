class Box
{
  // Instance Variables
  public double length ;
  public double width  ;
  public double height ;


  // Constructors
  Box ( double width, double height, double length )
  {
    this.width  = width ;
    this.height = height ;
    this.length = length ;
  }

  Box ( double side )
  {
    width  = side ;
    height = side ;
    length = side ;
  }

  // Methods
  public double volume() {
    return width * height * length ;
  }

  public double area() {
    return 4 * (length * width);
  }
}

class BoxTester {
  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println("Area: " + box.area() + " volume: " + box.volume());
     System.out.println("length: " + box.length + " height: " + box.height + " width:  " + box.width);

  }
}
