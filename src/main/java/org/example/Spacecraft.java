package org.example;

public class Spacecraft {
    private int x, y, z;
    private char direction;

    public Spacecraft(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        if (direction == 'N') y++;
        else if (direction == 'S') y--;
        else if (direction == 'E') x++;
        else if (direction == 'W') x--;
        else if (direction == 'U') z++;
        else if (direction == 'D') z--;
    }

    public void moveBackward() {
        if (direction == 'N') y--;
        else if (direction == 'S') y++;
        else if (direction == 'E') x--;
        else if (direction == 'W') x++;
        else if (direction == 'U') z--;
        else if (direction == 'D') z++;
    }

    public void turnLeft() {
        if (direction == 'N') direction = 'W';
        else if (direction == 'S') direction = 'E';
        else if (direction == 'E') direction = 'N';
        else if (direction == 'W') direction = 'S';
    }

    public void turnRight() {
        if (direction == 'N') direction = 'E';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'E') direction = 'S';
        else if (direction == 'W') direction = 'N';
    }

    public void turnUp() {
        if (direction == 'N' || direction == 'S') direction = 'U';
    }

    public void turnDown() {
        if (direction == 'N' || direction == 'S') direction = 'D';
    }

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            executeSingleCommand(command);
        }
    }

    private void executeSingleCommand(char command) {
        if (command == 'f') {
            moveForward();
        } else if (command == 'b') {
            moveBackward();
        } else if (command == 'l') {
            turnLeft();
        } else if (command == 'r') {
            turnRight();
        } else if (command == 'u') {
            turnUp();
        } else if (command == 'd') {
            turnDown();
        }
    }

    public String getPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public char getDirection() {
        return direction;
    }
}