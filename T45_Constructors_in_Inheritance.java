class Base1{
    Base1(){
        System.out.println("I am a base1 constructor");
    }
    Base1(int x){
        System.out.println("I am a base1 constructor with x value :" + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(5);
        System.out.println("I am a derived1 constructor");
    }
    Derived1(int x,int y){
        System.out.println(" y values " + y );
    }
}
public class T45_Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1(5);
        Derived1 d = new Derived1(1,4);
    }
}
