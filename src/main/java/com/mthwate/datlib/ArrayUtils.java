package com.mthwate.datlib;

import java.lang.reflect.Array;

/**
 * @author lordxarus
 * @since 1.2
 */

public class ArrayUtils {

	public static <T> T[][] getNeighbors(T[][] array, int x, int y, Class<T> type) {
		T[][] neighbors = (T[][]) Array.newInstance(type, 3, 3);

		for (int ix = -1; ix <= 1; ix++) {
			for (int iy = -1; iy <= 1; iy++) {
				int nx = ix + y;
				int ny = iy + y;
				if (nx >= 0 && ny >= 0 && nx < array.length && ny < array[0].length) {
					neighbors[ix+1][iy+1] = array[nx][ny];
				}
			}
		}

		return neighbors;
	}

}
