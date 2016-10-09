package com.mthwate.datlib.hash;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 * @author mthwate
 * @since 2.0
 */
public class Sha1HashFunction implements HashFunction {

	private static final int[] K = {
			0x5A827999,
			0x6ED9EBA1,
			0x8F1BBCDC,
			0xCA62C1D6
	};

	@Override
	public byte[] hash(byte[] data) {
		return process(pad(data));
	}

	private static int[] pad(byte[] data) {

		ByteBuffer bb = ByteBuffer.allocate(((data.length + 8) / 64 + 1) * 64);

		bb.put(data);

		bb.put((byte) 128);

		bb.position(bb.position() + bb.remaining() - 8);

		bb.putLong(data.length * 8);

		byte[] ba = bb.array();

		IntBuffer ib = ByteBuffer.wrap(ba).asIntBuffer();
		int[] ia = new int[ib.remaining()];
		ib.get(ia);

		return ia;
	}

	private static byte[] process(int[] data) {

		int H0 = 0x67452301;
		int H1 = 0xEFCDAB89;
		int H2 = 0x98BADCFE;
		int H3 = 0x10325476;
		int H4 = 0xC3D2E1F0;

		int[] W = new int[80];

		for (int i = 0; i < data.length / 16; i++) {

			System.arraycopy(data, i * 16, W, 0, 16);

			for (int j = 16; j < 80; j++) {
				W[j] = rotateLeft(W[j-3] ^ W[j-8] ^ W[j-14] ^ W[j-16], 1);
			}

			int A = H0;
			int B = H1;
			int C = H2;
			int D = H3;
			int E = H4;

			for (int j = 0; j < 80; j++) {
				int TEMP = rotateLeft(A, 5) + f(j,B,C,D) + E + W[j] + K[j/20];
				E = D;
				D = C;
				C = rotateLeft(B, 30);
				B = A;
				A = TEMP;
			}

			H0 += A;
			H1 += B;
			H2 += C;
			H3 += D;
			H4 += E;
		}

		return ByteBuffer.allocate(20).putInt(H0).putInt(H1).putInt(H2).putInt(H3).putInt(H4).array();

	}

	private static int rotateLeft (int x, int n) {
		return (x << n) | (x >>> (32 - n));
	}

	private static int f(int t, int B, int C, int D) {
		switch (t/20) {
			case 0: return f0(B, C, D);
			case 1: return f1(B, C, D);
			case 2: return f2(B, C, D);
			case 3: return f3(B, C, D);
			default: throw new AssertionError();
		}
	}

	private static int f0(int B, int C, int D) {
		return (B & C) | ((~B) & D);
	}

	private static int f1(int B, int C, int D) {
		return B ^ C ^ D;
	}

	private static int f2(int B, int C, int D) {
		return (B & C) | (B & D) | (C & D);
	}

	private static int f3(int B, int C, int D) {
		return B ^ C ^ D;
	}

}
