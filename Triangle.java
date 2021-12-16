/**
 * Triangle
 */

package lab9.interfaces;

public class Triangle extends GeometricObject1
{
    // Instance variables
    private double side1;
    private double side2;
    private double side3;

    /**
     * default Constructor that creates a default triangle
     */
    public Triangle()
    {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    /*
     * A second Constructor that uses input parameters
     * @param s1 to assign to side1
     * @param s2 to assign to side2
     * @param s3 to assign to side3
     */
    public Triangle(double s1, double s2, double s3)
    {
        if (!validTriangle(s1, s2, s3)) // "If not validTriangle"
        {
            System.err.println("Invalid values for triangle sides. Setting all sides to 1.0");
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
        }
        else
        {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        }
    }

    /**
     * Check for valid triangle, given sides s1, s2, s3
     * @param s1
     * @param s2
     * @param s3
     * @return validity status
     */
    private boolean validTriangle(double s1, double s2, double s3)
    {
        boolean valid = false;

        if ( ((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s3 + s1) > s2 ) )
        {
            valid = true;
        }

        return valid;
    }

    /*
     * Returns perimeter of triangle
     * @return perimeter
     */
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    
    /*
     * Returns the area of the triangle using Heron's formula
     * @return area
     */
    public double getArea()
    {
        double p = getPerimeter() / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3) );
        return area;
    }
    
    /*
     * Returns a String description of the triangle
     * 
     * @return String containing triangle data
     */
    public String toString()
    {
        String triangleString = "This triangle has: \n" +
                                "side1 = " + side1 + "\n" +
                                "side2 = " + side2 + "\n" +
                                "side3 = " + side3 + "\n" +
                                "perimeter = " + getPerimeter() + "\n" +
                                "area = " + getArea() + "\n" +
                                "color = " + super.getColor() + "\n"+
                                "filled = " + super.isFilled();
        
                                
        return triangleString;
    }
    
    public boolean lessThan(Triangle o)
    {
    	if(o.getArea()<getArea())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    public boolean greaterThan(Triangle o)
    {
    	if(o.getArea()>getArea())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    public boolean equals(Triangle o)
    {
    	if(o.getArea()==getArea())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }

} // end class
