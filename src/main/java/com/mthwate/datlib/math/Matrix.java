package com.mthwate.datlib.math;

import com.mthwate.datlib.math.fraction.FractionBigInteger;

import java.math.BigInteger;

/**
 * @author mthwate
 * @since 1.3
 */
public class Matrix {

	private final int rows;

	private final int cols;

	private final FractionBigInteger[][] contents;

	public Matrix(int[][] contents) {

		rows = contents.length;
		cols = contents[0].length;

		this.contents = new FractionBigInteger[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				this.contents[r][c] = new FractionBigInteger(contents[r][c]);
			}
		}
	}

	public Matrix(long[][] contents) {

		rows = contents.length;
		cols = contents[0].length;

		this.contents = new FractionBigInteger[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				this.contents[r][c] = new FractionBigInteger(contents[r][c]);
			}
		}
	}

	public Matrix(FractionBigInteger[][] contents) {

		rows = contents.length;
		cols = contents[0].length;

		this.contents = contents;
	}

	public Matrix add(Matrix matrix) {

		if (this.rows != matrix.rows || this.cols != matrix.cols) {
			throw new IllegalArgumentException("Matrices must be the same size");
		}

		FractionBigInteger[][] newContents = new FractionBigInteger[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				newContents[r][c] = contents[r][c].add(matrix.contents[r][c]);
			}
		}

		return new Matrix(newContents);
	}

	public Matrix subtract(Matrix matrix) {
		FractionBigInteger[][] newContents = new FractionBigInteger[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				newContents[r][c] = contents[r][c].subtract(matrix.contents[r][c]);
			}
		}

		return new Matrix(newContents);
	}

	public Matrix multiply(long scalar) {
		return multiply(new FractionBigInteger(BigInteger.valueOf(scalar)));
	}

	public Matrix multiply(FractionBigInteger scalar) {
		FractionBigInteger[][] newContents = new FractionBigInteger[rows][cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				newContents[r][c] = contents[r][c].multiply(scalar);
			}
		}

		return new Matrix(newContents);
	}

	public Matrix multiply(Matrix matrix) {

		if (this.cols != matrix.rows) {
			throw new IllegalArgumentException("Supplied matrix must have the same number of rows as this matrix has columns");
		}

		FractionBigInteger[][] newContents = new FractionBigInteger[rows][matrix.cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < matrix.cols; c++) {
				newContents[r][c] = new FractionBigInteger(0);
				for (int i = 0; i < cols; i++) {
					newContents[r][c] = newContents[r][c].add(contents[r][i].multiply(matrix.contents[i][c]));
				}
			}
		}

		return new Matrix(newContents);
	}

	public Matrix transpose() {
		FractionBigInteger[][] newContents = new FractionBigInteger[cols][rows];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				newContents[c][r] = contents[r][c];
			}
		}

		return new Matrix(newContents);
	}

	public Matrix submatrix(int row, int col) {
		FractionBigInteger[][] newContents = new FractionBigInteger[rows-1][cols-1];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (r != row && c != col) {
					newContents[r < row ? r : r-1][c < col ? c : c-1] = contents[r][c];
				}
			}
		}

		return new Matrix(newContents);
	}

	public FractionBigInteger determinant() {
		if (!isSquare()) {
			throw new UnsupportedOperationException("Cannot get determinant of a non square matrix");
		}

		FractionBigInteger determinant = new FractionBigInteger(0);

		if (rows == 1) {
			determinant = contents[0][0];
		} else {
			for (int r = 0; r < rows; r++) {
				determinant = determinant.add(contents[r][0].multiply(BigInteger.valueOf((long) Math.pow(-1, r))).multiply(this.submatrix(r, 0).determinant()));
			}
		}

		return determinant;
	}

	/*
	public FractionBigInteger determinant() {
		if (!isSquare()) {
			throw new UnsupportedOperationException("Cannot get determinant of a non square matrix");
		}

		FractionBigInteger determinant = new FractionBigInteger(0);

		if (rows == 2) {
			determinant = (contents[0][0].multiply(contents[1][1])).subtract(contents[0][1].multiply(contents[1][0]));
		} else {
			for (int r = 0; r < rows; r++) {
				determinant = determinant.add(contents[r][0].multiply((int) Math.pow(-1, r)).multiply(this.submatrix(r, 0).determinant()));
			}
		}

		return determinant;
	}
	*/

	public boolean isSquare() {
		return rows == cols;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;

		if (obj instanceof Matrix) {
			Matrix matrix = (Matrix) obj;
			if (this.rows == matrix.rows && this.cols == matrix.cols) {
				equal = true;
				for (int r = 0; r < rows && equal; r++) {
					for (int c = 0; c < cols && equal; c++) {
						if (!this.contents[r][c].equals(matrix.contents[r][c])) {
							equal = false;
						}
					}
				}
			}
		}

		return equal;
	}

	@Override
	public String toString() {

		int[] longest = new int[cols];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				longest[c] = Math.max(longest[c], contents[r][c].toString().length());
			}
		}



		StringBuilder sb = new StringBuilder();

		for (int r = 0; r < rows; r++) {
			sb.append("[");
			for (int c = 0; c < cols; c++) {

				FractionBigInteger content = contents[r][c];

				for (int i = content.toString().length(); i < longest[c]; i++) {
					sb.append(" ");
				}

				sb.append(content);
				sb.append(" ");
			}

			sb.deleteCharAt(sb.length()-1);
			sb.append(']');
			sb.append(System.lineSeparator());
		}

		return sb.toString();
	}

}
