package main;

public class Rover {
    public Position position;

    public Rover(int x , int y , Direction direction){
        this.position = new Position(x,y,direction);
    }

    public Position move() {
        return position.direction.getNextCoordinate(position);

    }

    public Position turnLeft() {
        position.direction =  position.direction.getLeft();
        return position;
    }

    public Position turnRight() {
        position.direction = position.direction.getRight();
        return position;
    }
}
