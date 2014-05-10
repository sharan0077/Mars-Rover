package main;

public class Position {

    int x , y ;
    Direction direction;

    public Position(int x, int y , Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int icrementX(){
        return this.x++;
    }

    public int incrementY(){
        return this.y++;
    }

    public int decrementX(){
        return this.x--;
    }

    public int decrementY(){
        return this.y--;
    }
}
