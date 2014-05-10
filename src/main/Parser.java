package main;


import java.util.ArrayList;
import java.util.List;

public class Parser {

    public String[] parseInputToInstructions(String input) {
        return input.split("\n")[1].split(" ");
    }

    public List<Position> parseInputToListOfPositionOfRovers(String cliInput){
        List<Position> listOfPositionOfRovers = new ArrayList<Position>();
        String[] input = cliInput.split("/n");
        String direction;
        int x , y;
        for (int i = 0 ; i < input.length ; i = i+2){
            x = Integer.parseInt(input[i].split(" ")[0]);
            y = Integer.parseInt(input[i].split(" ")[1]);
            direction = input[i].split(" ")[2];
            listOfPositionOfRovers.add(new Position(x , y , new Direction(direction)));
        }
        return listOfPositionOfRovers;
    }

    public Plateau getPlateau(String input) {
        int x_axis_boundary = Integer.parseInt(input.split("\n")[0].split(" ")[0]);
        System.out.println(input.split("\n")[0].split(" ")[1]);
        int y_axis_boundary = Integer.parseInt(input.split("\n")[0].split(" ")[1]);
        Plateau plateau = new Plateau(x_axis_boundary , y_axis_boundary);
        return plateau;
    }

    public List<String[]> parseInputToListOfInstructions(String cliInput){
        List<String[]> instructionsOfRovers = new ArrayList<String[]>();
        String[] instruction;
        String[] input = cliInput.split("\n");
        for (int i = 0 ; i < input.length ; i = i+2 ){
            instruction =  parseInputToInstructions(input[i]);
            instructionsOfRovers.add(instruction);
        }
        return instructionsOfRovers;
    }

}
