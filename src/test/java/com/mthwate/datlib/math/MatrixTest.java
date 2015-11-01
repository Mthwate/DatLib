package com.mthwate.datlib.math;

import com.mthwate.datlib.math.fraction.FractionBigInteger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * @author mthwate
 */
public class MatrixTest {

	@Test
	public void testTranspose() {

		for (int i = 0; i < 100; i++) {

			int r = nextInt(i, 10);
			int c = nextInt(i, 10);

			Matrix a = getMatrix(i, r, c);

			Assert.assertEquals(a, a.transpose().transpose());
		}

		for (int i = 0; i < 100; i++) {

			int r = nextInt(i, 10);
			int c = nextInt(i, 10);

			Matrix a = getMatrix(i, r, c);
			Matrix b = getMatrix(-i, r, c);

			Assert.assertEquals(a.add(b).transpose(), a.transpose().add(b.transpose()));
		}

		for (int i = 0; i < 100; i++) {
			for (int s = -10; s <= 10; s++) {

				int r = nextInt(i, 10);
				int c = nextInt(i, 10);

				Matrix a = getMatrix(i, r, c);

				Assert.assertEquals(a.multiply(s).transpose(), a.transpose().multiply(s));
			}
		}

	}

	@Test
	public void testAdd() {

		for (int i = 0; i < 100; i++) {

			int r = nextInt(i, 10);
			int c = nextInt(i, 10);

			Matrix a = getMatrix(i, r, c);
			Matrix b = getMatrix(-i, r, c);

			Assert.assertEquals(a.add(b), b.add(a));
		}

	}

	@Test
	public void testMultiply() {

		for (int i = 0; i < 100; i++) {

			int r = nextInt(i, 10);
			int c = nextInt(i, 10);

			Matrix a = getMatrix(i, r, c);

			Assert.assertEquals(a.multiply(getIdentityMatrix(c)), a);
		}

	}

	@Test
	public void testDeterminant() {

		for (int i = 0; i < 100; i++) {

			int s = nextInt(i, 3);

			Matrix a = getMatrix(i, s, s);
			Matrix b = getMatrix(-i, s, s);

			System.out.println(a);
			System.out.println(b);

			Assert.assertEquals(a.multiply(b).determinant(), a.determinant().multiply(b.determinant()));
		}

	}

	private static Matrix getMatrix(int i, int rows, int cols) {
		FractionBigInteger[][] contents = new FractionBigInteger[rows][cols];

		Random rand = new Random(i);

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				contents[r][c] = new FractionBigInteger(rand.nextInt(51) - 25, rand.nextInt(25) + 1);
			}
		}

		return new Matrix(contents);
	}

	private static int nextInt(int seed, int i) {
		Random rand = new Random(seed);
		return rand.nextInt(i) + 1;
	}

	private static Matrix getIdentityMatrix(int size) {
		int[][] contents = new int[size][size];

		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				if (r == c) {
					contents[r][c] = 1;
				}
			}
		}

		return new Matrix(contents);
	}
}