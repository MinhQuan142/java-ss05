public class Cylinder extends Circle {
    private double height;

    // Constructor mặc định
    public Cylinder() {
    }

    // Constructor với tham số
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    // Getter và Setter cho height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức tính thể tích
    public double getVolume() {
        return getArea() * height;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + ", volume=" + getVolume() + "]";
    }

}

