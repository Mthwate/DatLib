package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public class Vector2i extends Vector2g<Vector2i, Integer> {

	public Vector2i(Integer x, Integer y) {
		super(Calculator.INTEGER_CALCULATOR, x, y);
	}

	@Override
	protected Vector2i getNew(Integer x, Integer y) {
		return new Vector2i(x, y);
	}
}
