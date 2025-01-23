package Oops2;

public class InnerClasses {
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("Harish");
        System.out.println(obj.name);

    }
}
