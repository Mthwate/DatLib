package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;
import com.mthwate.datlib.math.calculator.LongCalculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class LoopingLong extends LoopingNumber<LoopingLong, Long> {

	public LoopingLong(Long value, Long inclusiveBound, Long exclusiveBound) {
		super(value, inclusiveBound, exclusiveBound, Calculator.LONG_CALCULATOR);
	}

	@Override
	public LoopingLong clone() {
		return new LoopingLong(this.value, this.inclusive, this.exclusive);
	}

}
