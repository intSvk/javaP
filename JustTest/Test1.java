package JustTest;

public class Test1 {

    private String hi;
    
    Test2 test2 =  new Test2();

    public void setTest2(int input){
        test2.setValue(input);
    }

    public int getTest2(){
        int TestA = test2.getValue();
        return TestA;
    }

    public String getTest1(){
        return hi;
    }

    public void setTest1(String h){
        this.hi = h; 
    }
    
}
