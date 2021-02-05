package com.sda.lesson_8;

public class Example3 {
    public static void main(String[] args) {
        Inputs i = Inputs.LEFT;

        switch (i) {
            case UP:
                //check if we can move the character
                //move the character up
                //trigger some animation
                //etc
                break;
            case DOWN:
                break;
            case LEFT:
                break;
            case RIGHT:
                break;
            case JUMP:
                break;
            case SHOOT:
                break;
        }
    }

    public static Inputs test(){
        return Inputs.UP;
    }
}
