package com.mthwate.datlib;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author mthwate
 * @since 1.1
 */
public class HashUtils {

	private static String toHex(byte[] data) {
		StringBuilder sb = new StringBuilder();
		for (byte b : data) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
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

}
