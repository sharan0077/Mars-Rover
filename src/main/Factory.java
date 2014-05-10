package main;

public class Factory {

    public Rover createRover(int x , int y , Direction direction){
        return new Rover(x,y,direction);
    }
}
