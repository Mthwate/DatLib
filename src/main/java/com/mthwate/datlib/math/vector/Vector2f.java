package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public class Vector2f extends Vector2g<Vector2f, Float> {

	public Vector2f(Float x, Float y) {
		super(Calculator.FLOAT_CALCULATOR, x, y);
	}

	@Override
	protected Vector2f getNew(Float x, Float y) {
		return new Vector2f(x, y);
	}
}
