package com.mthwate.datlib.hash;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/**
 * @author mthwate
 * @since 2.0
 */
public class Md5HashFunction implements HashFunction {

	@Override
	public byte[] hash(byte[] data) {
		return process(pad(data));
	}

	private static int[] pad(byte[] data) {

		ByteBuffer bb = ByteBuffer.allocate(((data.length + 8) / 64 + 1) * 64);

		bb.put(data);

		bb.put((byte) 128);

		bb.position(bb.position() + bb.remaining() - 8);

		bb.order(ByteOrder.LITTLE_ENDIAN).putLong(data.length * 8);

		byte[] ba = bb.array();

		IntBuffer ib = ByteBuffer.wrap(ba).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
		int[] ia = new int[ib.remaining()];
		ib.get(ia);

		return ia;
	}

	private static int F(int x, int y, int z) {
		return (x & y) | (~x & z);
	}

	private static int G(int x, int y, int z) {
		return (x & z) | (y & ~z);
	}

	private static int H(int x, int y, int z) {
		return x ^ y ^ z;
	}

	private static int I(int x, int y, int z) {
		return y ^ (x | ~z);
	}

	private static byte[] process(int[] data) {

		int A = 0x67452301;
		int B = 0xefcdab89;
		int C = 0x98badcfe;
		int D = 0x10325476;

		int[] X = new int[16];

		int AA;
		int BB;
		int CC;
		int DD;

		for (int i = 0; i < data.length / 16; i++) {

			System.arraycopy(data, i * 16, X, 0, 16);

			AA = A;
			BB = B;
			CC = C;
			DD = D;


			// Round 1
			A = FF(A, B, C, D, X[ 0],  7, 0xd76aa478);
			D = FF(D, A, B, C, X[ 1], 12, 0xe8c7b756);
			C = FF(C, D, A, B, X[ 2], 17, 0x242070db);
			B = FF(B, C, D, A, X[ 3], 22, 0xc1bdceee);
			A = FF(A, B, C, D, X[ 4],  7, 0xf57c0faf);
			D = FF(D, A, B, C, X[ 5], 12, 0x4787c62a);
			C = FF(C, D, A, B, X[ 6], 17, 0xa8304613);
			B = FF(B, C, D, A, X[ 7], 22, 0xfd469501);
			A = FF(A, B, C, D, X[ 8],  7, 0x698098d8);
			D = FF(D, A, B, C, X[ 9], 12, 0x8b44f7af);
			C = FF(C, D, A, B, X[10], 17, 0xffff5bb1);
			B = FF(B, C, D, A, X[11], 22, 0x895cd7be);
			A = FF(A, B, C, D, X[12],  7, 0x6b901122);
			D = FF(D, A, B, C, X[13], 12, 0xfd987193);
			C = FF(C, D, A, B, X[14], 17, 0xa679438e);
			B = FF(B, C, D, A, X[15], 22, 0x49b40821);

			// Round 2
			A = GG(A, B, C, D, X[ 1],  5, 0xf61e2562);
			D = GG(D, A, B, C, X[ 6],  9, 0xc040b340);
			C = GG(C, D, A, B, X[11], 14, 0x265e5a51);
			B = GG(B, C, D, A, X[ 0], 20, 0xe9b6c7aa);
			A = GG(A, B, C, D, X[ 5],  5, 0xd62f105d);
			D = GG(D, A, B, C, X[10],  9, 0x02441453);
			C = GG(C, D, A, B, X[15], 14, 0xd8a1e681);
			B = GG(B, C, D, A, X[ 4], 20, 0xe7d3fbc8);
			A = GG(A, B, C, D, X[ 9],  5, 0x21e1cde6);
			D = GG(D, A, B, C, X[14],  9, 0xc33707d6);
			C = GG(C, D, A, B, X[ 3], 14, 0xf4d50d87);
			B = GG(B, C, D, A, X[ 8], 20, 0x455a14ed);
			A = GG(A, B, C, D, X[13],  5, 0xa9e3e905);
			D = GG(D, A, B, C, X[ 2],  9, 0xfcefa3f8);
			C = GG(C, D, A, B, X[ 7], 14, 0x676f02d9);
			B = GG(B, C, D, A, X[12], 20, 0x8d2a4c8a);

			// Round 3
			A = HH(A, B, C, D, X[ 5],  4, 0xfffa3942);
			D = HH(D, A, B, C, X[ 8], 11, 0x8771f681);
			C = HH(C, D, A, B, X[11], 16, 0x6d9d6122);
			B = HH(B, C, D, A, X[14], 23, 0xfde5380c);
			A = HH(A, B, C, D, X[ 1],  4, 0xa4beea44);
			D = HH(D, A, B, C, X[ 4], 11, 0x4bdecfa9);
			C = HH(C, D, A, B, X[ 7], 16, 0xf6bb4b60);
			B = HH(B, C, D, A, X[10], 23, 0xbebfbc70);
			A = HH(A, B, C, D, X[13],  4, 0x289b7ec6);
			D = HH(D, A, B, C, X[ 0], 11, 0xeaa127fa);
			C = HH(C, D, A, B, X[ 3], 16, 0xd4ef3085);
			B = HH(B, C, D, A, X[ 6], 23, 0x04881d05);
			A = HH(A, B, C, D, X[ 9],  4, 0xd9d4d039);
			D = HH(D, A, B, C, X[12], 11, 0xe6db99e5);
			C = HH(C, D, A, B, X[15], 16, 0x1fa27cf8);
			B = HH(B, C, D, A, X[ 2], 23, 0xc4ac5665);

			// Round 4
			A = II(A, B, C, D, X[ 0],  6, 0xf4292244);
			D = II(D, A, B, C, X[ 7], 10, 0x432aff97);
			C = II(C, D, A, B, X[14], 15, 0xab9423a7);
			B = II(B, C, D, A, X[ 5], 21, 0xfc93a039);
			A = II(A, B, C, D, X[12],  6, 0x655b59c3);
			D = II(D, A, B, C, X[ 3], 10, 0x8f0ccc92);
			C = II(C, D, A, B, X[10], 15, 0xffeff47d);
			B = II(B, C, D, A, X[ 1], 21, 0x85845dd1);
			A = II(A, B, C, D, X[ 8],  6, 0x6fa87e4f);
			D = II(D, A, B, C, X[15], 10, 0xfe2ce6e0);
			C = II(C, D, A, B, X[ 6], 15, 0xa3014314);
			B = II(B, C, D, A, X[13], 21, 0x4e0811a1);
			A = II(A, B, C, D, X[ 4],  6, 0xf7537e82);
			D = II(D, A, B, C, X[11], 10, 0xbd3af235);
			C = II(C, D, A, B, X[ 2], 15, 0x2ad7d2bb);
			B = II(B, C, D, A, X[ 9], 21, 0xeb86d391);


			A += AA;
			B += BB;
			C += CC;
			D += DD;

		}

		return ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN).putInt(A).putInt(B).putInt(C).putInt(D).array();
	}

	private static int FF(int a, int b, int c, int d, int k, int s, int t) {
		return b + rotateLeft((a + F(b,c,d) + k + t), s);
	}

	private static int GG(int a, int b, int c, int d, int k, int s, int t) {
		return b + rotateLeft((a + G(b,c,d) + k + t), s);
	}

	private static int HH(int a, int b, int c, int d, int k, int s, int t) {
		return b + rotateLeft((a + H(b,c,d) + k + t), s);
	}

	private static int II(int a, int b, int c, int d, int k, int s, int t) {
		return b + rotateLeft((a + I(b,c,d) + k + t), s);
	}

	private static int rotateLeft(int x, int n) {
		return (x << n) | (x >>> (32 - n));
	}

}
