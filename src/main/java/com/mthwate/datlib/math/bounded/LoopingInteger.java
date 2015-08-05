package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class LoopingInteger extends LoopingNumber<LoopingInteger, Integer> {

	public LoopingInteger(Integer value, Integer inclusiveBound, Integer exclusiveBound) {
		super(value, inclusiveBound, exclusiveBound, Calculator.INTEGER_CALCULATOR);
	}

	@Override
	public LoopingInteger clone() {
		return new LoopingInteger(this.value, this.inclusive, this.exclusive);
	}

}
