package com.mthwate.datlib.hash;

import com.mthwate.datlib.time.Timer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author mthwate
 */
public class Sha1HashFunctionTest {

	@Test
	public void testHash() {

		Map<String, byte[]> hashes = new HashMap<>();

		hashes.put("", new byte[] {-38, 57, -93, -18, 94, 107, 75, 13, 50, 85, -65, -17, -107, 96, 24, -112, -81, -40, 7, 9});
		hashes.put("test", new byte[] {-87, 74, -113, -27, -52, -79, -101, -90, 28, 76, 8, 115, -45, -111, -23, -121, -104, 47, -69, -45});
		hashes.put("Test", new byte[] {100, 10, -78, -70, -32, 123, -19, -60, -63, 99, -10, 121, -89, 70, -9, -85, 127, -75, -47, -6});
		hashes.put("1234567890", new byte[] {1, -77, 7, -84, -70, 79, 84, -11, 90, -81, -61, 59, -80, 107, -69, -10, -54, -128, 62, -102});
		hashes.put("This is a long test string to test a hashing algorithm so it needs to be long", new byte[] {44, 28, -111, -117, 0, 53, -55, -64, -38, 84, 114, 35, 113, -45, 53, -14, -2, 15, 43, 106});

		HashFunctionTest.test(new Sha1HashFunction(), hashes);

	}
}