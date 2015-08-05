package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;
import com.mthwate.datlib.math.calculator.DoubleCalculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class LoopingDouble extends LoopingNumber<LoopingDouble, Double> {

	public LoopingDouble(Double value, Double inclusiveBound, Double exclusiveBound) {
		super(value, inclusiveBound, exclusiveBound, Calculator.DOUBLE_CALCULATOR);
	}

	@Override
	public LoopingDouble clone() {
		return new LoopingDouble(this.value, this.inclusive, this.exclusive);
	}
	
}
