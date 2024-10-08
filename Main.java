import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
  Circle c1 = new Circle(10.1);
  Circle c2 = new Circle(14);
  Circle c3 = new Circle(20.5);

  System.out.println(c1.toString());
  System.out.println(c2.toString());
  System.out.println(c3.toString());

  Scanner sc = new Scanner(System.in);
  System.out.println("Type a number for length and width: ");
  double len1 = sc.nextDouble();
  System.out.println("Type a number for length: ");
  double len2 = sc.nextDouble();
  System.out.println("Type a number for width: ");
  double len3 = sc.nextDouble();

  threeRectangles(len2, len3, len1);

  System.out.println("Type a side length: ");
  double length = sc.nextDouble();
  RegularPolygon triangle = new RegularPolygon(3, length);
  RegularPolygon square = new RegularPolygon(4, length);
  System.out.println(triangle.toString());
  System.out.println(square.toString());



  }
  public static void threeRectangles(double firstLength, double secondLength, double thirdLength) {
    Rectangle r1 = new Rectangle(firstLength, secondLength);
    Rectangle r2 = new Rectangle(thirdLength);

    System.out.println(r1.toString());
    System.out.println(r2.toString());
  }

  }


