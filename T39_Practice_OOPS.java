class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public void getName(){
        System.out.println(name);
    }
    public void setName(){
        String name = " Iyaopan";
        System.out.println(name);
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void silent(){
        System.out.println("Silent");
    }
}
class Square{
    int a;

    public int area(){
        return a*a;
    }
    public int perimeter(){
        return 4*a;
    }
}
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}
public class T39_Practice_OOPS {
    public static void main(String[] args) {
//        Employee harish = new Employee();
//        harish.salary = 10;
//        harish.name = "HArihs";
//        harish.getName();
//        System.out.println(harish.getSalary());
//        harish.setName();
//        CellPhone phone = new CellPhone();
//        phone.ring();
//        phone.silent();
//        phone.vibrate();
        Square square = new Square();
        square.a = 5;
        System.out.println(square.perimeter());
        System.out.println(square.area());
        TommyVecetti game = new TommyVecetti();
        game.hit();
        game.fire();
    }
}
