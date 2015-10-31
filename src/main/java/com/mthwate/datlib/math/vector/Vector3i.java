package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public class Vector3i extends Vector3g<Vector3i, Integer> {

	public Vector3i(Integer x, Integer y, Integer z) {
		super(Calculator.INTEGER_CALCULATOR, x, y, z);
	}

	@Override
	protected Vector3i getNew(Integer x, Integer y, Integer z) {
		return new Vector3i(x, y, z);
	}
}
