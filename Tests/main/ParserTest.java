package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ParserTest {

    Parser parser = new Parser();
    String input = "1 2 N\nL R M";

    @Test
    public void parseInputToCurrentPositionShouldBeAbleToAcceptInputAndReturnCurrentPosition(){

        CurrentPosition currentPosition = new CurrentPosition();
        currentPosition = parser.parseInputToCurrentPosition(input, currentPosition);
        assertEquals(currentPosition.getCurrentDirection(),"N");
        assertEquals(currentPosition.getX_axis(),1);
        assertEquals(currentPosition.getY_axis(),2);
    }

    @Test
    public void testShouldparseInputToListOfInstructions(){
        assertEquals(parser.parseInputToInstructions(input)[0],"L");
        assertEquals(parser.parseInputToInstructions(input)[2],"M");
    }

}
