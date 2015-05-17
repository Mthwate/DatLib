package com.mthwate.datlib;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * @author mthwate
 */
public class HashUtilsTest {

	private final Charset UTF8 = Charset.forName("UTF-8");

	private final byte[][] data = {"Testing".getBytes(UTF8), "Abc123".getBytes(UTF8), "DatLib".getBytes(UTF8)};

	private final String[] md2 = {"a3e2c444defc08fd988386f90255c622", "3d5ddd728c73b2096f79d320099c1bd4", "fb62e8009ae4c2a6f39252b5a9552875"};

	private final String[] md5 = {"fa6a5a3224d7da66d9e0bdec25f62cf0", "61bd60c60d9fb60cc8fc7767669d40a1", "7c47e4410d62fdf6a9f0694e92ba3efd"};

	private final String[] sha1 = {"0820b32b206b7352858e8903a838ed14319acdfd", "bec75d2e4e2acf4f4ab038144c0d862505e52d07", "1ea813fce560d20e8fa46d455b8b2748a97fc7c0"};

	private final String[] sha224 = {"1dedc96442b74fe1955a880161bb581016c8dfbd2a5e1899eb51ad68", "b66616cbd459ed4bd029482855334a8aee87984287498309e0a1d957", "c4ab1f748f5af6103b2c6e41699dc080b73018927c99b74ad8d58bbb"};

	private final String[] sha256 = {"e806a291cfc3e61f83b98d344ee57e3e8933cccece4fb45e1481f1f560e70eb1", "7f91e8a4b648b0125b15dc5a3b6466f9f4906d92c72bea9bd6be92c853bebda2", "bdccef69ed734a24b856d2592c1439caa44c1c5d20672a94cece13de3218a622"};

	private final String[] sha384 = {"2ca8b7b913d970a884fdb61daf74f6b4f868bc2ac20ea7583009259f382b14a04be97ea64ba0bab703ca7ea75a932bd5", "7d22fc23ffa840c97b1b5385cb82e88e4e419c9c6a0a7ef6edad02537add78a695b2c5c8af4cbeba1cbd66708d6b2b49", "4d93d92d10d124f554f5d18826b0cedb8536c67ac2e23777732856f5d192f3d2882cff7cf21bc8281d8a2a49df1b516e"};

	private final String[] sha512 = {"64f02697ccd1c0ae741d9e226f957127da7a614d6a18f55f9f2726d2027faac1e95e619dac5417eb4898fd6a9fb8aeb9cdd005e913c80e57454cae4b6fc6e5d6", "bc30ecc758c63691c69e66d846326670924bff9609b5febf39c1e86cca8fb72783ad5e5b7076359e6d709bc58cd379ade1495945f8591e9876cb2634e43139a6", "4b675033a85a00561ce0a2bb03802d5676f22b8504e15af15811e5c06981dc0433719f38913d2d3f1136ae3bab9b4d5f7eb2b2afc27fdc17edf2ba7c820b8327"};

	@Test
	public void testMd2Hex() throws Exception {
		for (int i = 0; i < data.length; i++) {
			Assert.assertEquals(md2[i], HashUtils.md2Hex(data[i]));
		}
	}

	@Test
	public void testMd5Hex() throws Exception {
		for (int i = 0; i < data.length; i++) {
			Assert.assertEquals(md5[i], HashUtils.md5Hex(data[i]));
		}
	}

	@Test
	public void testSha1Hex() throws Exception {
		for (int i = 0; i < data.length; i++) {
			Assert.assertEquals(sha1[i], HashUtils.sha1Hex(data[i]));
		}
	}

	@Test
	public void testSha224Hex() throws Exception {
		for (int i = 0; i < data.length; i++) {
			Assert.assertEquals(sha224[i], HashUtils.sha224Hex(data[i]));
		}
	}

	@Test
	public void testSha256Hex() throws Exception {
		for (int i = 0; i < data.length; i++) {
			Assert.assertEquals(sha256[i], HashUtils.sha256Hex(data[i]));
		}
	}

	@Test
	public void testSha384Hex() throws Exception {
		for (int i = 0; i < data.length; i++) {
			Assert.assertEquals(sha384[i], HashUtils.sha384Hex(data[i]));
		}
	}

	@Test
	public void testSha512Hex() throws Exception {
		for (int i = 0; i < data.length; i++) {
			Assert.assertEquals(sha512[i], HashUtils.sha512Hex(data[i]));
		}
	}
}