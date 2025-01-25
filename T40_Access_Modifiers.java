class MyEmployee{

    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }

}
class Circle{
    private int rad;

    public void setRad(int i){
        if(i==0){
            System.out.println("No Circle");
        }
        else{
            rad = i;
        }
    }
    public double getArea(){
        return 2*3.14*rad;
    }


}
public class T40_Access_Modifiers {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        Circle area = new Circle();
//        emp.id = 5;
//        System.out.println(id); //---> error due to private access modifier in myemployee class
        emp.setId(5);
        emp.setName("Harish");
        System.out.println(emp.getName());
        System.out.println(emp.getId());
        area.setRad(5);
        System.out.println(area.getArea());
    }
}
