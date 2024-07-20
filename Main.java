import java.util.Arrays;

//public class Main {
//    public static void main(String[] args) {
//        // Tạo đối tượng Circle
//        Circle circle = new Circle(2.5, "blue");
//        System.out.println(circle);
//
//        // Tạo đối tượng Cylinder
//        Cylinder cylinder = new Cylinder(2.5, "green", 5.0);
//        System.out.println(cylinder);
//    }
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Point2D
        Point2D point2D = new Point2D(2.5f, 3.8f);
        System.out.println("Point2D: " + point2D); // In ra tọa độ của điểm 2D
        System.out.println("X: " + point2D.getX()); // Lấy tọa độ x
        System.out.println("Y: " + point2D.getY()); // Lấy tọa độ y
        point2D.setXY(4.2f, 1.9f); // Thay đổi tọa độ x và y
        System.out.println("Point2D sau khi thay đổi: " + point2D);

        // Tạo đối tượng Point3D
        Point3D point3D = new Point3D(1.1f, 5.6f, 8.3f);
        System.out.println("Point3D: " + point3D); // In ra tọa độ của điểm 3D
        System.out.println("X: " + point3D.getX()); // Lấy tọa độ x (thừa kế từ Point2D)
        System.out.println("Y: " + point3D.getY()); // Lấy tọa độ y (thừa kế từ Point2D)
        System.out.println("Z: " + point3D.getZ()); // Lấy tọa độ z
        point3D.setXYZ(7.0f, 2.2f, 9.5f); // Thay đổi tọa độ x, y và z
        System.out.println("Point3D sau khi thay đổi: " + point3D);

        // Kiểm tra phương thức getXY và getXYZ
        float[] arr2D = point2D.getXY();
        System.out.println("Tọa độ của Point2D: " + Arrays.toString(arr2D)); // In mảng tọa độ
        float[] arr3D = point3D.getXYZ();
        System.out.println("Tọa độ của Point3D: " + Arrays.toString(arr3D)); // In mảng tọa độ
    }
}

