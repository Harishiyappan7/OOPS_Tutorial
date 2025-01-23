package OOPS3Properties;

public class Box {
    double l;
    double b;
    double h;
    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    Box(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    public static void main(String[] args) {
        Box box1= new Box(5,2,3);

        BoxWeight box2 = new BoxWeight(4,6,8,6);
        System.out.println(box2.weight);
    }
}
