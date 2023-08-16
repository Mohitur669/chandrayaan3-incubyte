package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpacecraftTest {

    @Test
    public void testMoveForward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.moveForward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveForward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveForward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveForward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveForward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveForward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackward() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.moveBackward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveBackward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveBackward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveBackward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveBackward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveBackward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testTurnLeft() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnLeft();
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnLeft();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnLeft();
        assertEquals('N', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnLeft();
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testTurnRight() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnRight();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnRight();
        assertEquals('W', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnRight();
        assertEquals('S', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnRight();
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testTurnUp() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnUp();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnUp();
        assertEquals('U', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnUp();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnUp();
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testTurnDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.turnDown();
        assertEquals('D', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.turnDown();
        assertEquals('D', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnDown();
        assertEquals('E', spacecraft.getDirection());

        spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnDown();
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testExecuteCommands() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        spacecraft.executeCommands(commands);
        assertEquals("(-1, 1, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    // More edge cases
    @Test
    public void testMoveForwardSouth() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveForward();
        assertEquals("(0, -1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardEast() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveForward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardWest() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveForward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardUp() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveForward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testMoveForwardDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveForward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardSouth() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'S');
        spacecraft.moveBackward();
        assertEquals("(0, 1, 0)", spacecraft.getPosition());
        assertEquals('S', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardEast() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.moveBackward();
        assertEquals("(-1, 0, 0)", spacecraft.getPosition());
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardWest() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.moveBackward();
        assertEquals("(1, 0, 0)", spacecraft.getPosition());
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardUp() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.moveBackward();
        assertEquals("(0, 0, -1)", spacecraft.getPosition());
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardDown() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.moveBackward();
        assertEquals("(0, 0, 1)", spacecraft.getPosition());
        assertEquals('D', spacecraft.getDirection());
    }

    // Unknown cases
    @Test
    public void testMoveForwardWithDifferentStartingPosition() {
        Spacecraft spacecraft = new Spacecraft(2, -3, 1, 'N');
        spacecraft.moveForward();
        assertEquals("(2, -2, 1)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    @Test
    public void testMoveBackwardWithDifferentStartingPosition() {
        Spacecraft spacecraft = new Spacecraft(2, -3, 1, 'N');
        spacecraft.moveBackward();
        assertEquals("(2, -4, 1)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    @Test
    public void testTurnLeftFromUpDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'U');
        spacecraft.turnLeft();
        assertEquals('U', spacecraft.getDirection());
    }

    @Test
    public void testTurnRightFromDownDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'D');
        spacecraft.turnRight();
        assertEquals('D', spacecraft.getDirection());
    }

    @Test
    public void testTurnUpFromEastDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'E');
        spacecraft.turnUp();
        assertEquals('E', spacecraft.getDirection());
    }

    @Test
    public void testTurnDownFromWestDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'W');
        spacecraft.turnDown();
        assertEquals('W', spacecraft.getDirection());
    }

    @Test
    public void testExecuteEmptyCommands() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        char[] commands = {};
        spacecraft.executeCommands(commands);
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    @Test
    public void testExecuteUnknownCommand() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        char[] commands = {'x', 'y', 'z'};
        spacecraft.executeCommands(commands);
        assertEquals("(0, 0, 0)", spacecraft.getPosition());
        assertEquals('N', spacecraft.getDirection());
    }

    //    resolving invalid inputs
    @Test
    public void testSetInvalidDirection() {
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, 'N');
        spacecraft.setDirection('X');
        assertEquals('N', spacecraft.getDirection());
    }
}