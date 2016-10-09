package com.mthwate.datlib.hash;

import org.junit.Assert;

import java.util.Map;

/**
 * @author mthwate
 */
public class HashFunctionTest {

	static void test(HashFunction function, Map<String, byte[]> hashes) {
		for (Map.Entry<String, byte[]> hash : hashes.entrySet()) {
			Assert.assertArrayEquals(function.hash(getBytes(hash.getKey())), hash.getValue());
		}
	}

	private static byte[] getBytes(String str) {
		byte[] bytes = new byte[str.length()];
		for (int i = 0; i < str.length(); i++) {
			bytes[i] = (byte) str.charAt(i);
		}
		return bytes;
	}

}
