package Resizeable;

import javax.print.DocFlavor;

public class Square extends Rectangle{
    public Square(){};
    public Square(double width){
        super(width);
    }

    public double getSquareArea() {
        return getWidth() * getWidth();
    }

    public double getSquarePremeter(){
        return 4*getWidth();
    }


    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }
}
