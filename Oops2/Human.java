package Oops2;

public class Human {
    int age;
    String name;
    long sal;
    static long population;

    static void message(){
        System.out.println("Hello");
    }

    Human(int age,String name,long sal){
        this.age = age;
        this.name = name;
        this.sal = sal;
        Human.population +=1;
        Human.message();
    }
}
