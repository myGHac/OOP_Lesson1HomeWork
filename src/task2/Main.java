package task2;

import java.util.Scanner;

public class Main {

    public static   double areaCalculator (double side1, double side2) {
        double area = side1 * side2;
      return area;
    }

    public  static double  perimeterCalculator (double side1, double side2) {
        double perimeter = (side1 * 2) + (side2 * 2);
        return perimeter;
    }

    public static void main(String[] args) {

        System.out.println("Введите ширину прямоугольника: ");
        Scanner sc = new Scanner(System.in);
        double width  = sc.nextDouble();
        System.out.println("Введите высоту прямоугольника:");
        sc = new Scanner(System.in);
        double height = sc.nextDouble();

        Rectangle rectg = new Rectangle();
        rectg.setSide1(width);
        rectg.setSide2(height);

        double area = areaCalculator (rectg.getSide1(), rectg.getSide2());
        double perim = perimeterCalculator(rectg.getSide1(), rectg.getSide2());

        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perim);
    }
}
