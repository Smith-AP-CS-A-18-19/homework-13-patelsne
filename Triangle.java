import java.awt.geom.Rectangle2D;

public class Triangle implements SmithShape{

  private int xCord;
  private int yCord;
  private int w;
  private int h;
  private double theta;


  public Triangle(int x, int y, int width, int height, double angle){
    xCord = x;
    yCord = y;
    w = width;
    h = height;
    theta = angle;

  }

  public double getAngle(){
    return theta;
  }

  public int getX(){
    return xCord;
  }

  public int getY(){
    return yCord;
  }

  public int getWidth(){
    return w;
  }

  public int getHeight(){
    return h;
  }

  public double getArea(){
    double area = (((double) w) * h)/2;
    return area;
  }


/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */

/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
// public Triangle(int x, int y, int width, int height, double angle)

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

 public Rectangle2D toSquare(){
   double length = Math.pow(getArea(), 0.5);
   Rectangle2D rect = new Rectangle2D.Double(xCord, yCord, length, length);
   return rect;
 }
/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
@Override
public String toString(){
  String wid = "Width: " + getWidth();
  String hei = "Height: " + getHeight();
  String ang = "Angle: " + getAngle();
  String answer = wid + "\n" + hei + "\n" + ang;
  return answer;
}


}
