import java.util.Scanner;
import java.lang.Math;

public class Shapes{
  public static float[] rectangle(float width, float length){
    float areaSquare, circumferenceSquare;
    areaSquare = width * length;
    circumferenceSquare = 2*width + 2*length;
    return new float[] {areaSquare, circumferenceSquare};
  }
public static float[] triangle(float base, float side2, float side3, float height){
    float areaTriangle, circumferenceTriangle;
    areaTriangle = 0.5f*base*height;
    circumferenceTriangle = base*side2*side3;
    return new float[] {areaTriangle, circumferenceTriangle};
  }
public static float[] circle(float radius){
    float areaCircle, circumferenceCircle;
    final float pi = 3.14f;
    areaCircle = pi*(float)Math.pow(radius,2);
    circumferenceCircle = 2f*pi*radius;
    return new float[] {areaCircle, circumferenceCircle};
  }

  public static void main(String[] args){
    String shape;
    float width, length, height, radius, base, side2, side3, area, circumference;
    float[] res = new float[2];
    Scanner myObj = new Scanner(System.in);
    System.out.print("Choose the shapes: ");
    shape = myObj.next();
    switch(shape){
      case "rectangle":
        System.out.print("Length: ");
        length = myObj.nextFloat();
        System.out.print("Width: ");
        width = myObj.nextFloat();
        res = rectangle(width, length);
        break;
      case "triangle":
        System.out.print("base: ");
        base = myObj.nextFloat();
        System.out.print("side2: ");
        side2 = myObj.nextFloat();
        System.out.print("side3: ");
        side3 = myObj.nextFloat();
        System.out.print("Height: ");
        height = myObj.nextFloat();
        res = triangle(base,side2, side3,height);
        break;
      case "circle":
        System.out.print("Radius: ");
        radius = myObj.nextFloat();
        res = circle(radius);
        break;
    }
    area = res[0];
    circumference = res[1];
    System.out.println("Area of " + shape + "= " + area);
    System.out.print("Circumference of " + shape + "= " + circumference);
    
  }
}