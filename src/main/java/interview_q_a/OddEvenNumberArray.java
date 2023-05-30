package interview_q_a;
public class OddEvenNumberArray {
    public static void main(String[] args) {
        int x[] = {4,3,5,6,7,8,6,5,4};

        System.out.println("Even number in array: ");
        for (int i=0;i<x.length; i++)
        {
            if(x[i]%2==0)
                System.out.println(x[i]);
        }
        //Enhance for loop
       /* for(int value:x)
        {
            if(value%2==0)
                System.out.println(value);*/

        System.out.println("Odd number in array: ");
        for(int i=0;i<x.length;i++){
            if(x[i]%2!=0)
            {
                System.out.println(x[i]);
            }
            /*for(int number:x)
            {
                if(number%2==0)
                    System.out.println(number);*/
            }
        }
    }

