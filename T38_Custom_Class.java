class Employee1{
    int id;
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public void getDetails(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class T38_Custom_Class {
    public static void main(String[] args) {
//        System.out.println("hello");
        Employee1 harish = new Employee1();  //Instantiating a new object
//        Setting attributes
        harish.id = 1;
        harish.name = "Harish";
        harish.salary = 55555;
//        System.out.println(harish.id);
//        System.out.println(harish.name);
        harish.getDetails();
        int sal = harish.getSalary();
        System.out.println(sal);
    }
}
