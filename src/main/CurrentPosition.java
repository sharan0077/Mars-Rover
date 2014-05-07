package main;

/**
 * Created by gurushan on 5/7/14.
 */
public class CurrentPosition {
    public int x_axis;
    public int y_axis;
    public String currentDirection;

    public int getX_axis() {
        return x_axis;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }
}
