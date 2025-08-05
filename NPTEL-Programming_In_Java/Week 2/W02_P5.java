import java.util.Scanner;

public class W02_P5 {
  // Declare a separate class named Circle
  static class Circle {
    int radius;

    // TASK: Write a constructor that takes radius as parameter
    // Use the 'this' keyword to assign the value to the member variable
		Circle(int radius) {
      this.radius = radius;
    }

    /*
      Hint:
      The constructor name should be Circle
      Use: this.radius = radius;
     */

  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read radius value from user
    int r = sc.nextInt();

    // Create an object of Circle class using constructor
    Circle c = new Circle(r);

    // Print the radius using object member
    System.out.println("Radius of the circle is: " + c.radius);

    sc.close();
  }
}

