package Point2DAndPoint3D;

import java.sql.Array;
import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {}

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        float[] ArrayOf = {x, y ,z};
    }
    public float[] getXYZ() {
        float[] ArrayOf = {getX(), getY(), z};
        return ArrayOf;
    }

    public String toString() {
        return "Chuỗi có: " + Arrays.toString(getXYZ());
    }
}
