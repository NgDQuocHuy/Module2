package moveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {}

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] Speed = {xSpeed, ySpeed};
        return Speed;
    }

    public void setSpeed() {
        float[] Speed = {xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return Arrays.toString(super.getXY())
                + ", speed = "
                + Arrays.toString(getSpeed());
    }

    public MoveablePoint move(float x, float y) {
        super.setX(x += xSpeed);
        super.setY(y += ySpeed);
        return this;
    }
}
