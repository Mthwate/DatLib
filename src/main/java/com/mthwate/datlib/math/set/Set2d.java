package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
@Deprecated
public class Set2d extends Set2g<Set2d, Double> implements Serializable {

	private static final long serialVersionUID = 7545185431305740320L;

	public Set2d(Double x, Double y) {
		super(x, y, Calculator.DOUBLE_CALCULATOR);
	}

	public Set2d(Set2d set) {
		super(set);
	}

	@Override
	public Set2d clone() {
		return new Set2d(this);
	}
	
}
