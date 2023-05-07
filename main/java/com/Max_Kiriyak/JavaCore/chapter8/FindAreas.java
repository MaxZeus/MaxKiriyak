package main.java.com.Max_Kiriyak.JavaCore.chapter8;
class Figure {
    double dim1;
    double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    double area() {
        System.out.println("Area for Figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double area() {
        System.out.println("Inside Area for rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    double area() {
        System.out.println("Inside Area of triangle.");
        return dim1 * dim2 / 2;
    }
}
public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = f;
        System.out.println("Area is " + f.area() + "\n");

        figref = r;
        System.out.println("Area is " + r.area() + "\n");

        figref = t;
        System.out.println("Area is " + t.area());

    }
}
