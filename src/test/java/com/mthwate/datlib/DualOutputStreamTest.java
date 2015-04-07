package com.mthwate.datlib;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public class DualOutputStreamTest {

	@Test
	public void testWrite() throws Exception {

		ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
		ByteArrayOutputStream baos2 = new ByteArrayOutputStream();

		DualOutputStream duos = new DualOutputStream(baos1, baos2);

		DataOutputStream daos = new DataOutputStream(duos);

		daos.writeUTF("This is a test");
		daos.writeBoolean(true);
		daos.writeBoolean(false);
		daos.writeUTF("again");
		daos.writeFloat(5.5f);
		daos.writeDouble(15.2);
		daos.writeInt(7001);
		daos.writeLong(1234567890);
		daos.writeShort(123);
		daos.flush();

		Assert.assertNotEquals(baos1.size(), 0);
		Assert.assertEquals(baos1.size(), baos2.size());

		for (int i = 0; i < baos1.size(); i++) {
			Assert.assertEquals(baos1.toByteArray()[i], baos2.toByteArray()[i]);
		}
	}
}