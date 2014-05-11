package main;

import java.util.HashMap;

public class Controller {

    HashMap<String,Position> instructionSet = new HashMap<String, Position>();

    private void instructRover(Rover rover){
        instructionSet.put("L",rover.turnLeft());
        instructionSet.put("R",rover.turnRight());
        instructionSet.put("M",rover.move());
    }

    public Position getPositionOfRoverAfterMoving(Rover rover, String[] instructions , Plateau plateau){
        int x_axis , y_axis;
        boolean isRover_X_AxisOnBoundary, isRover_Y_AxisOnBoundary;
        instructRover(rover);
        for (String instruction : instructions) {
            x_axis = rover.position.x;
            y_axis = rover.position.y;
            isRover_X_AxisOnBoundary = (x_axis == plateau.getX_axis_boundary()) || ( x_axis == 0 );
            isRover_Y_AxisOnBoundary = (y_axis == plateau.getY_axis_boundary()) || ( y_axis == 0 );
            if(instruction == "M" && isRover_X_AxisOnBoundary || isRover_Y_AxisOnBoundary)
                return null;
            rover.position = instructionSet.get(instruction);
//            System.out.println(rover.position.x);
//            System.out.println(rover.position.y);
//            System.out.println(rover.position.direction.current);
//            System.out.println("----------------------------------");
        }
        return rover.position;
    }

}
