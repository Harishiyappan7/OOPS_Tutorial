class Base{
    int x;

    public int getX() {
        System.out.println("This is base class");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Animal{
    public void walk(){
        System.out.println("Walk");
    }
    public void bite(){
        System.out.println("bite");
    }

}
class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class T45_Inheritance  {
    public static void main(String[] args) {
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());
//
//        Derived d =new Derived();
//        d.setX(10);
//        System.out.println(d.getX());

        Animal a = new Animal();
        a.walk();
//        a.bark();           ---------> error

        Dog g = new Dog();
        g.walk();
        g.bark();
    }
}
