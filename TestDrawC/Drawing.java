package TestDrawC;

public class Drawing {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        
        try {
            triangle.draw();
        } catch (RuntimeException e) {
            System.err.println(e);
        }
    }
}
