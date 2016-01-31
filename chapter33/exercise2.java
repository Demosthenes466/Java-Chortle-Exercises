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
    return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
  }

  private double faceArea() {
    return length * height;
  }

  public double topArea() {
    return length * width;
  }

  private double sideArea() {
    return width * height;
  }
}

class BoxTester2 {
  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
     System.out.println( "topArea: "  + box.topArea() );

  }

}
