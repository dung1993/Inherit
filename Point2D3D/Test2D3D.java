package Point2D3D;

public class Test2D3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.5f,4.7f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(1.7f,4.5f,3.2f);
        System.out.println(point3D);
    }
}
