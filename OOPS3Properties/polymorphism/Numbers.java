package OOPS3Properties.polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers sum = new Numbers();
        System.out.println(sum.sum(4,5,6));
    }
}
