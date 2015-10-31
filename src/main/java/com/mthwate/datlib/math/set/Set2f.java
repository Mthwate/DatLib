package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
@Deprecated
public class Set2f extends Set2g<Set2f, Float> implements Serializable {

	private static final long serialVersionUID = -4566815787927882365L;

	public Set2f(Float x, Float y) {
		super(x, y, Calculator.FLOAT_CALCULATOR);
	}

	public Set2f(Set2f set) {
		super(set);
	}

	@Override
	public Set2f clone() {
		return new Set2f(this);
	}
	
}
