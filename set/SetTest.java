package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 5; i++) {

            s.add(i);
        }
        System.out.println(s);

        

    }
}
