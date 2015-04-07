package com.mthwate.datlib;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StringUtilsTest {

	@Test
	public void testJoin() throws Exception {

		List<String> strings = new ArrayList<>();

		strings.add("The fox is fast ");
		strings.add(" My   Aunt went to the store");
		strings.add("a     ");
		strings.add("    a");
		strings.add("Testing 1 2 3");
		strings.add("Hello World!");

		for (String str : strings) {
			String[] split = str.split(" ");
			if (str.endsWith(" ")) {
				Assert.assertNotEquals(str, StringUtils.join(split, " "));
			} else {
				Assert.assertEquals(str, StringUtils.join(split, " "));
			}
		}
	}
}