package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;
import com.mthwate.datlib.math.calculator.FloatCalculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class LoopingFloat extends LoopingNumber<LoopingFloat, Float> {

	public LoopingFloat(Float value, Float inclusiveBound, Float exclusiveBound) {
		super(value, inclusiveBound, exclusiveBound, Calculator.FLOAT_CALCULATOR);
	}

	@Override
	public LoopingFloat clone() {
		return new LoopingFloat(this.value, this.inclusive, this.exclusive);
	}

}
