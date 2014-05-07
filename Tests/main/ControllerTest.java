package main;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ControllerTest {

    String input = "1 2 N\nL R M";

    @Test
    public void testShouldCreateControllerClassByAcceptingAndReturningInput(){
        Controller controller = new Controller();
        controller.setInput(input);
        assertEquals(controller.getInput(), input);
    }

    @Test
    public void getCurrentPositionShouldBeAbleToGetCurrentPositionAfterParsingInput(){
        Controller controller = new Controller();
        CurrentPosition currentPosition = new CurrentPosition();
        controller.setInput(input);
        currentPosition.setX_axis(1);
        currentPosition.setY_axis(2);
        currentPosition.setCurrentDirection("N");
        assertEquals(controller.getCurrentPosition(input).x_axis, currentPosition.x_axis);
        assertEquals(controller.getCurrentPosition(input).y_axis,currentPosition.y_axis);
        assertEquals(controller.getCurrentPosition(input).currentDirection,currentPosition.currentDirection);
    } 

    @Test
    public void getInstructionsShouldReturnListOfInstructions(){
        Controller controller = new Controller();
        controller.setInput(input);
        assertEquals(controller.getInstructions(input)[0],"L");
        assertEquals(controller.getInstructions(input)[2],"M");
    }

    @Test
    public void sendInstructionsToRoverShouldSendInstructionsToRover(){
        Controller controller = new Controller();
        Parser parser = new Parser();
        Rover rover = new Rover();
        controller.setInput(input);
        String[] instructions = parser.parseInputToInstructions(input);
        CurrentPosition currentPosition = new CurrentPosition();
        currentPosition = parser.parseInputToCurrentPosition(input,currentPosition);
        assertEquals(controller.sendInstructionsToRover(rover,currentPosition,instructions),true);
        assertEquals(rover.currentPosition.x_axis,1);
        assertEquals(rover.instructions[0],"L");
    }


}
