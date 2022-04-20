package Lambda;

interface A{

    void show();
}

public class TestLambda {


    
    public static void main(String[] args) {
        
        // Without the lambda expression
    
    A obj = new A(){

        // This is called an inner class
        public void show(){
            System.out.println("Hello");
        }
    };


    // With the lambda expression

    A obj2 = ()->{
        System.out.println("World");
    };

    obj.show();
    obj2.show();
}
}
