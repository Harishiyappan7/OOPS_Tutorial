
class Employee2{
    private int id;
    private String name;
    private int salary;
    public Employee2(){
        id =5;
        name = "Harihs";
        salary = 10000;
    }
    public Employee2(int i,String n,int s){
        id = i;
        name = n;
        salary = s;
    }

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
    public void setSalary(int s){
        salary=s;
    }
    public int getSalary(){
        return salary;
    }

}
public class T41_Constructors {


    public static void main(String[] args) {
//        Employee2 emp = new Employee2();
        Employee2 emp = new Employee2(5,"Iyappan",52000);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
        System.out.println(emp.getSalary());
    }

}
