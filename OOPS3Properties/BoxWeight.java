package OOPS3Properties;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double l,double b,double h,double weight){
        super(l,b,h);
        this.weight = weight;
    }
}
