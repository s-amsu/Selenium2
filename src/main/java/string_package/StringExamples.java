package string_package;

import org.checkerframework.checker.units.qual.Length;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = new String("Samsul Islam");

        char[] s3 = {'S', 'A', 'M', 'S','U', 'L'};
        System.out.println(s3);

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

       int len = s1.length();
        System.out.println("Length of s1: "+len);

        // if(s1.equalsIgnoreCase(s2))
        // {
        //     System.out.println("Equals");
        // }else{
           // System.out.println("Not Equals")}
        boolean con = s1.contains("Islam");
        System.out.println(con);

        boolean b = s1.isEmpty();
        System.out.println(b);
    }
}
