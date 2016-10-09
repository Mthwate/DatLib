package com.mthwate.datlib.hash;

import com.mthwate.datlib.time.Timer;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author mthwate
 */
public class Md5HashFunctionTest {

	@Test
	public void testHash() {

		Map<String, byte[]> hashes = new HashMap<>();

		hashes.put("", new byte[] {-44, 29, -116, -39, -113, 0, -78, 4, -23, -128, 9, -104, -20, -8, 66, 126});
		hashes.put("test", new byte[] {9, -113, 107, -51, 70, 33, -45, 115, -54, -34, 78, -125, 38, 39, -76, -10});
		hashes.put("Test", new byte[] {12, -68, 102, 17, -11, 84, 11, -48, -128, -102, 56, -115, -55, 90, 97, 91});
		hashes.put("1234567890", new byte[] {-24, 7, -15, -4, -8, 45, 19, 47, -101, -80, 24, -54, 103, 56, -95, -97});
		hashes.put("This is a long test string to test a hashing algorithm so it needs to be long", new byte[] {-89, -114, -53, 106, 65, 42, 79, 17, 108, 64, 53, -62, -105, -5, -26, -83});

		HashFunctionTest.test(new Md5HashFunction(), hashes);

	}

}