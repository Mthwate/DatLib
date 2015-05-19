package com.mthwate.datlib;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author mthwate
 * @since 1.1
 */
public class HashUtils {

	private static final Charset UTF8 = Charset.forName("UTF-8");

	private final static char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

	private static String toHex(byte[] data) {
		char[] chars = new char[data.length * 2];
		for (int i = 0; i < data.length; i++ ) {
			int v = data[i] & 0xFF;
			chars[i * 2] = HEX_CHARS[v >>> 4];
			chars[i * 2 + 1] = HEX_CHARS[v & 0x0F];
		}
		return new String(chars);
	}

	/**
	 * Hashes data with the specified hashing algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @param alg the hashing algorithm to use
	 * @return the hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] hash(byte[] data, String alg) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(alg);
		return md.digest(data);
	}

	/**
	 * Hashes data with the specified hashing algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @param alg the hashing algorithm to use
	 * @return the hexadecimal hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String hashHex(byte[] data, String alg) throws NoSuchAlgorithmException {
		return toHex(hash(data, alg));
	}

	/**
	 * Hashes data with the specified hashing algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @param alg the hashing algorithm to use
	 * @return the hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] hash(byte[] data, HashAlgorithm alg) throws NoSuchAlgorithmException {
		return hash(data, alg.toString());
	}

	/**
	 * Hashes data with the specified hashing algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @param alg the hashing algorithm to use
	 * @return the hexadecimal hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String hashHex(byte[] data, HashAlgorithm alg) throws NoSuchAlgorithmException {
		return hashHex(data, alg.toString());
	}

	/**
	 * Hashes data using the MD2 algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the MD2 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] md2Hash(byte[] data) throws NoSuchAlgorithmException {
		return hash(data, HashAlgorithm.MD2);
	}

	/**
	 * Hashes a string using the MD2 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the MD2 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] md2Hash(String data, Charset charset) throws NoSuchAlgorithmException {
		return md2Hash(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the MD2 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the MD2 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] md2Hash(String data) throws NoSuchAlgorithmException {
		return md2Hash(data, UTF8);
	}

	/**
	 * Hashes data using the MD2 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the hexadecimal MD2 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String md2Hex(byte[] data) throws NoSuchAlgorithmException {
		return hashHex(data, HashAlgorithm.MD2);
	}

	/**
	 * Hashes a string using the MD2 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the hexadecimal MD2 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String md2Hex(String data, Charset charset) throws NoSuchAlgorithmException {
		return md2Hex(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the MD2 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the hexadecimal MD2 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String md2Hex(String data) throws NoSuchAlgorithmException {
		return md2Hex(data, UTF8);
	}

	/**
	 * Hashes data using the MD5 algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the MD5 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] md5Hash(byte[] data) throws NoSuchAlgorithmException {
		return hash(data, HashAlgorithm.MD5);
	}

	/**
	 * Hashes a string using the MD5 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the MD5 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] md5Hash(String data, Charset charset) throws NoSuchAlgorithmException {
		return md5Hash(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the MD5 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the MD5 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] md5Hash(String data) throws NoSuchAlgorithmException {
		return md5Hash(data, UTF8);
	}

	/**
	 * Hashes data using the MD5 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the hexadecimal MD5 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String md5Hex(byte[] data) throws NoSuchAlgorithmException {
		return hashHex(data, HashAlgorithm.MD5);
	}

	/**
	 * Hashes a string using the MD5 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the hexadecimal MD5 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String md5Hex(String data, Charset charset) throws NoSuchAlgorithmException {
		return md5Hex(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the MD5 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the hexadecimal MD5 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String md5Hex(String data) throws NoSuchAlgorithmException {
		return md5Hex(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-1 algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the SHA-1 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha1Hash(byte[] data) throws NoSuchAlgorithmException {
		return hash(data, HashAlgorithm.SHA1);
	}

	/**
	 * Hashes a string using the SHA-1 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the SHA-1 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha1Hash(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha1Hash(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-1 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the SHA-1 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha1Hash(String data) throws NoSuchAlgorithmException {
		return sha1Hash(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-1 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the hexadecimal SHA-1 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha1Hex(byte[] data) throws NoSuchAlgorithmException {
		return hashHex(data, HashAlgorithm.SHA1);
	}

	/**
	 * Hashes a string using the SHA-1 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the hexadecimal SHA-1 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha1Hex(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha1Hex(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-1 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the hexadecimal SHA-1 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha1Hex(String data) throws NoSuchAlgorithmException {
		return sha1Hex(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-224 algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the SHA-224 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha224Hash(byte[] data) throws NoSuchAlgorithmException {
		return hash(data, HashAlgorithm.SHA224);
	}

	/**
	 * Hashes a string using the SHA-224 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the SHA-224 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha224Hash(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha224Hash(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-224 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the SHA-224 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha224Hash(String data) throws NoSuchAlgorithmException {
		return sha224Hash(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-224 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the hexadecimal SHA-224 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha224Hex(byte[] data) throws NoSuchAlgorithmException {
		return hashHex(data, HashAlgorithm.SHA224);
	}

	/**
	 * Hashes a string using the SHA-224 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the hexadecimal SHA-224 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha224Hex(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha224Hex(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-224 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the hexadecimal SHA-224 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha224Hex(String data) throws NoSuchAlgorithmException {
		return sha224Hex(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-256 algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the SHA-256 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha256Hash(byte[] data) throws NoSuchAlgorithmException {
		return hash(data, HashAlgorithm.SHA256);
	}

	/**
	 * Hashes a string using the SHA-256 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the SHA-256 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha256Hash(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha256Hash(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-256 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the SHA-256 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha256Hash(String data) throws NoSuchAlgorithmException {
		return sha256Hash(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-256 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the hexadecimal SHA-256 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha256Hex(byte[] data) throws NoSuchAlgorithmException {
		return hashHex(data, HashAlgorithm.SHA256);
	}

	/**
	 * Hashes a string using the SHA-256 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the hexadecimal SHA-256 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha256Hex(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha256Hex(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-256 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the hexadecimal SHA-256 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha256Hex(String data) throws NoSuchAlgorithmException {
		return sha256Hex(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-384 algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the SHA-384 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha384Hash(byte[] data) throws NoSuchAlgorithmException {
		return hash(data, HashAlgorithm.SHA384);
	}

	/**
	 * Hashes a string using the SHA-384 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the SHA-384 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha384Hash(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha384Hash(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-384 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the SHA-384 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha384Hash(String data) throws NoSuchAlgorithmException {
		return sha384Hash(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-384 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the hexadecimal SHA-384 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha384Hex(byte[] data) throws NoSuchAlgorithmException {
		return hashHex(data, HashAlgorithm.SHA384);
	}

	/**
	 * Hashes a string using the SHA-384 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the hexadecimal SHA-384 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha384Hex(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha384Hex(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-384 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the hexadecimal SHA-384 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha384Hex(String data) throws NoSuchAlgorithmException {
		return sha384Hex(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-512 algorithm.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the SHA-512 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha512Hash(byte[] data) throws NoSuchAlgorithmException {
		return hash(data, HashAlgorithm.SHA512);
	}

	/**
	 * Hashes a string using the SHA-512 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the SHA-512 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha512Hash(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha512Hash(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-512 algorithm.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the SHA-512 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static byte[] sha512Hash(String data) throws NoSuchAlgorithmException {
		return sha512Hash(data, UTF8);
	}

	/**
	 * Hashes data using the SHA-512 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the data to hash
	 * @return the hexadecimal SHA-512 hash of the data
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha512Hex(byte[] data) throws NoSuchAlgorithmException {
		return hashHex(data, HashAlgorithm.SHA512);
	}

	/**
	 * Hashes a string using the SHA-512 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @param charset the charset of the string
	 * @return the hexadecimal SHA-512 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha512Hex(String data, Charset charset) throws NoSuchAlgorithmException {
		return sha512Hex(data.getBytes(charset));
	}

	/**
	 * Hashes a string using the SHA-512 algorithm. Returns a hexadecimal result.
	 *
	 * @since 1.1
	 * @param data the string to hash
	 * @return the hexadecimal SHA-512 hash of the string
	 * @throws NoSuchAlgorithmException the algorithm is not supported by existing providers
	 */
	public static String sha512Hex(String data) throws NoSuchAlgorithmException {
		return sha512Hex(data, UTF8);
	}

}
