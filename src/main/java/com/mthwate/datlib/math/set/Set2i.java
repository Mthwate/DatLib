package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2i extends Set2g<Set2i, Integer> implements Serializable {

	private static final long serialVersionUID = 3039497236768820386L;

	public Set2i(Integer x, Integer y) {
		super(x, y, Calculator.INTEGER_CALCULATOR);
	}

	public Set2i(Set2i set) {
		super(set);
	}

	@Override
	public Set2i clone() {
		return new Set2i(this);
	}
	
}
