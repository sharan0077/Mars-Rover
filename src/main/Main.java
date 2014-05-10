package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x , y;
        Direction direction;
        Rover rover;
        String input = args[0];
        Parser parser = new Parser();
        Plateau plateau = parser.getPlateau(input);
        List<String[]> listOfInstructionsForRovers = parser.parseInputToListOfInstructions(input);
        List<Position> listOfPositionOfRovers = parser.parseInputToListOfPositionOfRovers(input);
        List<Position>listOfPositionOfRoversAfterMoving = new ArrayList<Position>();
        Factory factory = new Factory();
        List<Rover> listOfRovers = new ArrayList<Rover>();
        for ( int i = 0; i < listOfInstructionsForRovers.size(); i++ ){
            x = listOfPositionOfRovers.get(i).x;
            y = listOfPositionOfRovers.get(i).y;
            direction = listOfPositionOfRovers.get(i).direction;
            rover = factory.createRover(x,y,direction);
            listOfRovers.add(rover);
        }
        Controller controller = new Controller();
        for (int i = 0 ; i < listOfRovers.size() ; i++) {
            listOfPositionOfRoversAfterMoving.add(
            controller.getPositionOfRoverAfterMoving(listOfRovers.get(i),listOfInstructionsForRovers.get(i),plateau));
        }
    }
}
