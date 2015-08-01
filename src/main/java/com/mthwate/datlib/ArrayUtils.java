package com.mthwate.datlib;

/**
 * @author lordxarus
 * @since 1.2
 */

public class ArrayUtils {

    public static Object[][] getNeighbors(Object[][] array, int x, int y) {
        Object[][] neighbors = new Object[3][3];
        int alive = 0;
        int dead = 0;

        int[][] modifiers = {
                {-1, 1},{ 0, 1},{ 1, 1},
                {-1, 0},        { 1, 0},
                {-1,-1},{ 0,-1},{ 1,-1}
        };

        for (int[] modifier : modifiers) {
            int nx = modifier[0] + x;
            int ny = modifier[1] + y;
            if (nx >= 0 && ny >= 0 && nx < array.length && ny < array[0].length) {
                neighbors[nx][ny] = array[nx][ny];
            }
        }

        return neighbors;
    }

}
