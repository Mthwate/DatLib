package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
@Deprecated
public class Set3i extends Set3g<Set3i, Integer> implements Serializable {

	private static final long serialVersionUID = 5969787431476209188L;

	public Set3i(Integer x, Integer y, Integer z) {
		super(x, y, z, Calculator.INTEGER_CALCULATOR);
	}

	public Set3i(Set3i set) {
		super(set);
	}

	@Override
	public Set3i clone() {
		return new Set3i(this);
	}
}
