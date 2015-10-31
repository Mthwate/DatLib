package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public class Vector3f extends Vector3g<Vector3f, Float> {

	public Vector3f(Float x, Float y, Float z) {
		super(Calculator.FLOAT_CALCULATOR, x, y, z);
	}

	@Override
	protected Vector3f getNew(Float x, Float y, Float z) {
		return new Vector3f(x, y, z);
	}
}
