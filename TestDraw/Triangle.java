package TestDraw;


public class Triangle extends DrawingApp {

    private String type;
    private int height; 
    

    // private Point pointA;
    // private Point pointB;
    // private Point pointC;

    // public Point getPointA(){
    //     return pointA;
    // }

    // public void setPointA(Point pointA){
    //     this.pointA = pointA;
    // }

    
    // public Point getPointB(){
    //     return pointB;
    // }

    // public void setPointB(Point pointB){
    //     this.pointB = pointB;
    // }

    
    // public Point getPointC(){
    //     return pointC;
    // }

    // public void setPointC(Point pointC){
    //     this.pointC = pointC;
    // }


    public void setData(String type , int height){
        this.type = type;
        this.height = height;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
    
    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void draw(){
        
        System.out.println(getType() + "triangle is drawing and the height is " + getHeight());
        // System.out.println(type + "type of triangle and height is " + height );


        System.out.println("Point A = " + super.pointA.getX() +","+ super.pointA.getY());
        System.out.println("Point B = " + super.pointB.getX() +","+ super.pointA.getX());
        // System.out.println("Point B = " + super.getX() + "," + super.getY());
        // System.out.println("Point C = " + super.getX() + "," + super.getY());
    }
    
}
