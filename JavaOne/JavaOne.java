package JavaOne;

public class JavaOne {
    public static int areaSquare(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        // Procedural
        System.out.println(JavaOne.areaSquare(5));

        // Object-oriented Programming
        Square s = new Square(5);
        System.out.println(s.getArea());

        Square s2= new Square(6);
        System.out.println(s2.getArea());
        System.out.println(s);
    }
}