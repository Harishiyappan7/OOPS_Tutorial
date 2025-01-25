class Cylinder{
    int height;
    int radius;
    int getHeight(){
        return height;
    }
    void setHeight(int h){
        height = h;
    }
    int getRadius(){
        return radius;
    }
    void setRadius(int r){
        radius = r;
    }
    public double area(){
        return 2 * 3.14 * radius * radius + 2*3.14*radius*height;
    }
    public double volume(){
        return 2 * 3.14 * radius * radius * height;
    }
    public Cylinder(int h,int r){
        height = h;
        radius = r;

    }

}
public class T44_Practice_constructors {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(5,10);
        cyl.setHeight(5);
        cyl.setRadius(10);
//        System.out.println(cyl.getHeight());
//        System.out.println(cyl.getRadius());
        System.out.println(cyl.area());
        System.out.println(cyl.volume());
    }
}
