package Arraylist;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// import org.junit.Test;

public class ArrayListTest {

    private static final int INITIAL_CAPACITY = 5;

    // @Test
    public static void main(String[] args) {
        // int a[] = { 1, 2, 3, 4 };
        ArrayList<String> arrli = new ArrayList<>(INITIAL_CAPACITY);
        arrli.add("B");
        arrli.add("A");
        arrli.add("D");
        arrli.add("C");
        System.out.println(arrli);

        // Using the Iterator

        // Iterator itr = arrli.iterator();

        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
       
        System.out.println(arrli.get(2));
        arrli.set(2,"H");
        
        Collections.sort(arrli);
         
        System.out.println(arrli);
        // System.out.println(Arrays.toString(a));

    
    }
}