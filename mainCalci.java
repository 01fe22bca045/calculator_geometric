// File: mainCalci.java
package calci.calculator_geometric;

public class mainCalci extends geometric {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        mainCalci calci = new mainCalci();
        double rectangleArea = calci.area_of_rectangle(5.45f, 4.67f);
        double triangleArea = calci.area_of_triangle(5.45f, 5.67f);

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + product);

        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
