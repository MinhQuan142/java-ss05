public class Point3D extends Point2D {
    private float z = 0.0f;

    // Constructors
    public Point3D() {}

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    // Getters and setters
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y); // Gọi phương thức setXY của lớp cha
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {getX(), getY(), z}; // Sử dụng getX() và getY() từ lớp cha
    }

    // toString method
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
