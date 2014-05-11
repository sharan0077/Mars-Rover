package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x , y;
        Direction direction;
        Rover rover;
        String input = "3 3\n1 2 N\nLLM";
        Parser parser = new Parser();
        Plateau plateau = parser.getPlateau(input);
        List<String[]> listOfInstructionsForRovers = parser.parseInputToListOfInstructions(input);
        List<Position> listOfPositionOfRovers = parser.parseInputToListOfPositionOfRovers(input);
        List<Position>listOfPositionOfRoversAfterMoving = new ArrayList<Position>();
        Factory factory = new Factory();
        List<Rover> listOfRovers = new ArrayList<Rover>();
        for ( int i = 0; i < listOfInstructionsForRovers.size(); i++ ){
            x = listOfPositionOfRovers.get(i).getX();
            y = listOfPositionOfRovers.get(i).getY();
            direction = listOfPositionOfRovers.get(i).getDirection();
            rover = factory.createRover(x,y,direction);
            listOfRovers.add(rover);
        }
        Controller controller = new Controller();
        for (int i = 0 ; i < listOfRovers.size() ; i++) {
            listOfPositionOfRoversAfterMoving.add(
            controller.getPositionOfRoverAfterMoving(listOfRovers.get(i),listOfInstructionsForRovers.get(i),plateau));
        }
        Formtter formatter = new Formtter();
        String output = formatter.getFormattedOutput(listOfPositionOfRoversAfterMoving);
        System.out.println("Positon of Rovers After Moving");
        System.out.println(output);
    }
}
