package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.1
 */
public enum HashAlgorithm {

	MD2("MD2"),
	MD5("MD5"),
	SHA1("SHA-1"),
	SHA224("SHA-224"),
	SHA256("SHA-256"),
	SHA384("SHA-384"),
	SHA512("SHA-512");

	private String name;

	HashAlgorithm(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
