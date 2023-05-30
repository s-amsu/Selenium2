package string_package;



public class StringExamples2 {
    public static void main(String[] args) {
        String firstName = "Samsul";
        String lastName = " Islam";

        String fullName = firstName.concat(lastName);
        System.out.println("Full Name = "+fullName);

        String upperName = fullName.toUpperCase();
        System.out.println("Uppername = "+upperName);

        String lowerName = fullName.toLowerCase();
        System.out.println("LowerName = "+lowerName);

        boolean b = firstName.startsWith("Sam");
        System.out.println("b = "+b);

        boolean last = lastName.endsWith("an");
        System.out.println("lastName = "+last);

        String [] names = {"Samsul", "Mosarof", "Fahad"};
       /* for (String x : names){
            System.out.println(x);}*/
        for (int i = 0; i<3; i++){
            System.out.println(names[i]);
        }
    }
}
