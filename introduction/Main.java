package introduction;

public class Main {
 public static void main(String[] args) {
  Student student1 = new Student(88,"HArud",88);
  Student student2 = new Student(8,"Arud",8);
//  student1.rollNo = 4;
  System.out.println(student1.rollNo);
  System.out.println(student1.name);
  System.out.println(student1.marks);
  System.out.println(student2.rollNo);
  System.out.println(student2.name);
  System.out.println(student2.marks);
  Student random = new Student(student1);
  Student random2 = new Student();
  System.out.println(random2.name);


 }
}
class Student{
 int rollNo;
 String name;
 float marks;
 Student(Student other){
  this.name = other.name;
  this.rollNo = other.rollNo;
  this.marks = other.marks;
 }

 Student(){
  this(14,"sdfsdf",555);
 }
 Student(int rollNo,String name,float marks){
  this.rollNo = rollNo;
  this.name = name;
  this.marks = marks;
 }

}
