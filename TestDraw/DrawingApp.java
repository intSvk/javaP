package TestDraw;

public class DrawingApp {

    static Point pointA = new Point();
    static Point pointB = new Point();
    static Point pointC = new Point();


    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setType("Equillatral ");


       

        pointA.setXY(0, 0);
        pointB.setXY(-20, 0);
        pointC.setXY(0, 20);

        
        // triangle.setHeight(25);

        // triangle.draw();

        triangle.setData("Isometric", 10);

        triangle.draw();

        // System.out.println(pointB.getX());
    }

  
}
