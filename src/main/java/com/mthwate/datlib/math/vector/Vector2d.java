package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public class Vector2d extends Vector2g<Vector2d, Double> {

	public Vector2d(Double x, Double y) {
		super(Calculator.DOUBLE_CALCULATOR, x, y);
	}

	@Override
	protected Vector2d getNew(Double x, Double y) {
		return new Vector2d(x, y);
	}
}
