package main;


public class Controller {


    private String input;

    Parser parser = new Parser();

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public CurrentPosition getCurrentPosition(String input) {

        CurrentPosition currentPosition = new CurrentPosition();
        return parser.parseInputToCurrentPosition(input,currentPosition);

    }

    public String[] getInstructions(String input) {

        return parser.parseInputToInstructions(input);

    }

    public boolean sendInstructionsToRover(Rover rover, CurrentPosition currentPosition, String[] instructions) {

        rover.currentPosition = currentPosition;
        rover.instructions = instructions;
        return true;
    }
}
