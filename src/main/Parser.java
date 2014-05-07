package main;


public class Parser {
    public CurrentPosition parseInputToCurrentPosition(String input,CurrentPosition currentPosition) {
        currentPosition.setCurrentDirection(input.split("\n")[0].split(" ")[2]);
        currentPosition.setX_axis(Integer.parseInt(input.split("\n")[0].split(" ")[0]));
        currentPosition.setY_axis(Integer.parseInt(input.split("\n")[0].split(" ")[1]));
        return currentPosition;
    }

    public String[] parseInputToInstructions(String input) {
        return input.split("\n")[1].split(" ");
    }
}
