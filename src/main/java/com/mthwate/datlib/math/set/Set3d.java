package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
@Deprecated
public class Set3d extends Set3g<Set3d, Double> implements Serializable {

	private static final long serialVersionUID = 9160974412909509546L;

	public Set3d(Double x, Double y, Double z) {
		super(x, y, z, Calculator.DOUBLE_CALCULATOR);
	}

	public Set3d(Set3d set) {
		super(set);
	}

	@Override
	public Set3d clone() {
		return new Set3d(this);
	}
	
}
