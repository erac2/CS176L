// GeometricObject1.java: The GeometricObject1 class
// This class is meant to be a superclass.

package lab9.interfaces;

public class GeometricObject1 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**Default constructor*/
    public GeometricObject1() {
        dateCreated = new java.util.Date();
    }

    /**Non-default constructor*/
    public GeometricObject1(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**Getter method for color*/
    public String getColor() {
        return color;
    }

    /**Setter method for color*/
    public void setColor(String color) {
        this.color = color;
    }

    /**Getter method for filled. Since filled is boolean,
    so, the get method name is isFilled*/
    public boolean isFilled() {
        return filled;
    }

    /**Setter method for filled*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }
}
