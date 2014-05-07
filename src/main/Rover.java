package main;

/**
 * Created by gurushan on 5/7/14.
 */
public class Rover {
    public CurrentPosition currentPosition;
    public String[] instructions;

    public CurrentPosition getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(CurrentPosition currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String[] getInstructions() {
        return instructions;
    }

    public void setInstructions(String[] instructions) {
        this.instructions = instructions;
    }
}
