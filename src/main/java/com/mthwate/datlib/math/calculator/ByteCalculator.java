package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class ByteCalculator implements Calculator<Byte> {

	private static final ByteCalculator INSTANCE = new ByteCalculator();

	public static ByteCalculator getInstance() {
		return INSTANCE;
	}

	private ByteCalculator() {}

	@Override
	public Byte add(Byte n1, Byte n2) {
		return (byte) (n1 + n2);
	}

	@Override
	public Byte subtract(Byte n1, Byte n2) {
		return (byte) (n1 - n2);
	}

	@Override
	public Byte multiply(Byte n1, Byte n2) {
		return (byte) (n1 * n2);
	}

	@Override
	public Byte divide(Byte n1, Byte n2) {
		return (byte) (n1 / n2);
	}

	@Override
	public Byte modulo(Byte n1, Byte n2) {
		return (byte) (n1 % n2);
	}

	@Override
	public Byte abs(Byte n) {
		return (byte) Math.abs(n);
	}

	@Override
	public Byte power(Byte n1, Byte n2) {
		return (byte) Math.pow(n1, n2);
	}

	@Override
	public int compare(Byte n1, Byte n2) {
		return n1.compareTo(n2);
	}

	@Override
	public Byte getZero() {
		return 0;
	}

	@Override
	public Byte getOne() {
		return 1;
	}

}
