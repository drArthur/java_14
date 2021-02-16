package com.sda.lesson_9;
// Create a program that takes as an input a 2D char array
// of a minesweeper map. We have 2 elements - ' '(empty space) and '*'(bomb)
// output a 2D array with numbers of adjacent mines nearby

//___*
//_*_*
//____
//****

//113*
//1*3*
//3453
//****
public class Task1 {
    public static void main(String[] args) {
        char [][] map = new char[][] {
                {' ', ' ',' ', '*'},
                {' ', '*',' ', '*'},
                {' ', ' ',' ', ' '},
                {'*', '*','*', '*'}
        };

        // loop through each element in the map array
        // the first loop goes through each column (each vertical line)
        // from 0 to map.length(3)
        for (int column=0; column < map.length; column++ ) {
            // for each column, we loop through each row element. (each element horizontally)
            for (int row=0; row <map[column].length; row++) {
                // if the element is a bomb, we output a bomb
                // and don't calculate anything
                if (map[column][row]== '*') {
                    System.out.print(" *");
                }
                // else, if it's not a bomb, then we calculate the
                // amount of adjacent bombs, and write the number in the
                // cell
                else {
                    System.out.print(" "+ check(map, column, row));
                }
            }
            System.out.println();
        }
    }

    /**
     * Calculates, how many adjacent bomb tiles there are for our tile
     * @param map the array we're using to store each tile
     * @param column the vertical index of our tile
     * @param row the horizontal index of our tile
     * @return the amount of adjacent bombs
     */
    public static int check(char [][] map, int column, int row) {
        // introduce a counter for bombs
        int counter = 0;
        // iterate through columns relative to our tile:
        // the previous one, the current one, the next one.
        // we also check if the next column is out of boundaries
        // of the array.
        for (int c = column - 1; c < map.length && c<=column+1; c++) {
            // iterate through rows relative to our tile. Same as the columns
            // also check if the next row is smaller than the amount of rows
            for (int r = row - 1; r < map[column].length && r<=row+1; r++) {
                // if the relative column or row is smaller
                // than the minimum index for the array,
                // we skip that step
                if (c<0 || r < 0)
                    continue;
                // if we find a bomb, we make counter bigger by 1.
                if (map[c][r]== '*')
                    counter++;
            }
        }
        // by the end of the method, counter has the value of
        // how many adjacent bombs there are
        // so, returning counter
        return counter;
    }
}
