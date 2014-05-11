package main;

import java.util.List;

/**
 * Created by gurushan on 5/11/14.
 */
public class Formtter {
    public String getFormattedOutput(List<Position> listOfPositionsOfRoverAfterMoving){
        String output = "";
        for (Position position : listOfPositionsOfRoverAfterMoving) {
            output = output + position.x + " " + position.y + " " + position.direction.current + "\n";
        }
        return output;
    }
}
