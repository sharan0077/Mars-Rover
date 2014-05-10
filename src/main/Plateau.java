package main;

public class Plateau {
    private final int x_axis_boundary;
    private final int y_axis_boundary;

    public Plateau(int x_axis_boundary, int y_axis_boundary) {
        this.x_axis_boundary = x_axis_boundary;
        this.y_axis_boundary = y_axis_boundary;
    }

    public int getX_axis_boundary() {
        return x_axis_boundary;
    }

    public int getY_axis_boundary() {
        return y_axis_boundary;
    }
}
