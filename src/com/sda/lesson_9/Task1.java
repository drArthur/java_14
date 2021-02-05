package com.sda.lesson_9;
//// Create a program that takes as an input a 2D char array
//// of a minesweeper map. We have 2 elements - ' '(empty space) and '*'(bomb)
//// output a 2D array with numbers of adjacent mines nearby
//
////___*
////_*_*
////____
////****
//
////113*
////1*3*
////3453
////****
public class Task1 {
    public static void main(String[] args) {
        char [][] map = new char[][] {
                {' ', ' ',' ', '*'},
                {' ', '*',' ', '*'},
                {' ', ' ',' ', ' '},
                {'*', '*','*', '*'}
        };

        for (int column=0; column < map.length; column++ ) {
            for (int row=0; row <map[column].length; row++) {
                if (map[column][row]== '*') {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" "+ check(map, column, row));
                }
            }
            System.out.println();
        }
    }
    public static int check(char [][] map, int column, int row) {
        int counter = 0;
        for (int c = column-1; c< map.length && c<=column+1; c++) {
            for (int r = row - 1; r< map[column].length && r<=row+1; r++) {

                if (c<0 || r < 0)
                    continue;
                if (map[c][r]== '*')
                    counter++;

            }
        }

        return counter;
    }
}
