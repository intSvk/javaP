package Strings;

import java.util.Arrays;

public class StringsMethod {
    public static void main (String[]args){
        String string = "Helloe";
        String string2 = "World";

        // System.out.println(string.charAt(1));
        // System.out.println(string.compareTo(string2));
        // System.out.println(string.concat(string2));
        // System.out.println(string.contains("a"));
        // System.out.println(string.equals(string2));

        // byte[] barr = string.getBytes();
        // System.out.println(Arrays.toString(barr));

        // System.out.println(string.indexOf("e"));
        // System.out.println(String.join("/","25","52","25"));
        // System.out.println(string.length());
        // System.out.println(string.replace("e","a"));
        // System.out.println(string);

        String[] c = string.split("");
        // for(String str :c){
        //     System.out.println(str);
        // }
        System.out.println(Arrays.toString(c));
        System.out.println(string.substring(1,3));
        System.out.println(string);




    }
}
