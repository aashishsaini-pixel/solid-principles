package LSP;

public class Main {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(5d , 4d);
        System.out.println("Area of Rectangle : " + rectangle.area());


        Square square = new Square(16d);

        System.out.println("Area of Square : " + square.area());


        Square square1 = new Square(7d);
        square1.setHeight(8d);
        square1.setWidth(8d);
        System.out.println(square1.area());



    }
}
