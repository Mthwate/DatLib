package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public class Vector3d extends Vector3g<Vector3d, Double> {

	public Vector3d(Double x, Double y, Double z) {
		super(Calculator.DOUBLE_CALCULATOR, x, y, z);
	}

	@Override
	protected Vector3d getNew(Double x, Double y, Double z) {
		return new Vector3d(x, y, z);
	}
}
