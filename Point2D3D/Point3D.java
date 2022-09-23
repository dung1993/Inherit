package Point2D3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){

    }

    public  Point3D(float z){
        this.z = z;
    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z) {
        this.z = z;
        super.setXY(x,y);
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    public String toString(){
        return "Point X :" + getX() + " Point Y:" + getY() + " Point Z:" + getZ() + "Point3D" + getXYZ();
    }


}
