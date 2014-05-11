package main;

import java.util.HashMap;

public class Direction{

    public String current;



    HashMap<String, Integer> nextCordinate = new HashMap<String, Integer>();
    HashMap<String, Direction> directionsOnLeft = new HashMap<String, Direction>();
    HashMap<String,Direction> directionsOnRight = new HashMap<String, Direction>();

//    private void setPosition(Position position){
//        nextCordinate.put("N", position.incrementY());
//        nextCordinate.put("S", position.decrementY());
//        nextCordinate.put("E", position.icrementX());
//        nextCordinate.put("W", position.decrementX());
//    }

    private void setLeft(){
        directionsOnLeft.put("N",new Direction("W"));
        directionsOnLeft.put("S",new Direction("E"));
        directionsOnLeft.put("E",new Direction("N"));
        directionsOnLeft.put("W",new Direction("S"));
    }

    private void setRight(){
        directionsOnRight.put("N",new Direction("E"));
        directionsOnRight.put("S",new Direction("W"));
        directionsOnRight.put("E",new Direction("S"));
        directionsOnRight.put("W",new Direction("N"));
    }

    public Direction(String current) {
        this.current = current;
    }

    public Direction getLeft(){
        setLeft();
        return directionsOnLeft.get(current);
    }

    public Direction getRight(){
        setRight();
        return directionsOnRight.get(current);
    }

    public Position getNextCoordinate(Position position){
       // setPosition(position);
        if(position.direction.current.equalsIgnoreCase("N")) position.incrementY();
        if(position.direction.current.equalsIgnoreCase("S")) position.decrementY();
        if (position.direction.current.equalsIgnoreCase("E")) position.icrementX();
        if(position.direction.current.equalsIgnoreCase("W")) position.decrementX();
        return position;
    }

}