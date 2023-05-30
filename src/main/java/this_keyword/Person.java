package this_keyword;



import java.awt.*;

public class Person {
    String name;
    int age;
    String hairColor;
    Person(String name, int age){
     this.name = name;
     this.age = age;
    }
    Person(String name, int age, String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    void display(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("HairColor is : "+hairColor);
    }
}
