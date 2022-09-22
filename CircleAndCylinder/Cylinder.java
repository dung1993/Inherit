package CircleAndCylinder;

public class Cylinder extends Circle{
    private double high = 1.0;

    public Cylinder(){

    }

    public Cylinder(double high, String color,double radius){
        super(color, radius);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public String toString(){
        return "High of Cylinder: " + getHigh() + " set a color of " + getColor() + " and radius: " + getRadius();
    }
}
