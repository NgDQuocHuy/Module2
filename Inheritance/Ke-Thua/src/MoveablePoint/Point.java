package MoveablePoint;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        float[] Array = {x, y};
    }

    public float[] getXY() {
        float[] Array = {x, y};
        return Array;
    }

    @Override
    public String toString() {
        return "Chuỗi có: " + Arrays.toString(getXY());
    }
}
