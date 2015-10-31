package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
@Deprecated
public class Set3f extends Set3g<Set3f, Float> implements Serializable {

	private static final long serialVersionUID = 9080675547546977506L;

	public Set3f(Float x, Float y, Float z) {
		super(x, y, z, Calculator.FLOAT_CALCULATOR);
	}

	public Set3f(Set3f set) {
		super(set);
	}

	@Override
	public Set3f clone() {
		return new Set3f(this);
	}
	
}
