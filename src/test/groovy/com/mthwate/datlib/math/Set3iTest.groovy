package com.mthwate.datlib.math

import com.mthwate.datlib.math.set.Set3i
import org.junit.Assert

/**
 * @author mthwate
 */
class Set3iTest extends GroovyTestCase {

	void testPlus() {
		int range = 5;

		for (int x1 = -range; x1 <= range; x1++) {
			for (int y1 = -range; y1 <= range; y1++) {
				for (int z1 = -range; z1 <= range; z1++) {
					for (int x2 = -range; x2 <= range; x2++) {
						for (int y2 = -range; y2 <= range; y2++) {
							for (int z2 = -range; z2 <= range; z2++) {
								Set3i vect1 = new Set3i(x1, y1, z1);
								Set3i vect2 = new Set3i(x2, y2, z2);
								Set3i vect3 = vect1 + vect2;
								Assert.assertEquals(vect1, new Set3i(x1, y1, z1));
								Assert.assertEquals(vect2, new Set3i(x2, y2, z2));
								Assert.assertEquals(vect3, new Set3i(x1 + x2, y1 + y2, z1 + z2));
								vect1 += vect2;
								Assert.assertEquals(vect1, vect3);
							}
						}
					}
				}
			}
		}
	}

	void testGetX() {
		int range = 10;

		for (int i = -range; i <= range; i++) {
			Assert.assertEquals(new Set3i(i, 0, 0).getX(), i);
		}
	}

	void testGetY() {
		int range = 10;

		for (int i = -range; i <= range; i++) {
			Assert.assertEquals(new Set3i(0, i, 0).getY(), i);
		}
	}

	void testGetZ() {
		int range = 10;

		for (int i = -range; i <= range; i++) {
			Assert.assertEquals(new Set3i(0, 0, i).getZ(), i);
		}
	}

	void testEquals() {
		Set3i vect1 = new Set3i(1, 2, 3);
		Set3i vect2 = new Set3i(1, 2, 3);
		Set3i vect3 = new Set3i(1, 2, 2);
		Integer i = new Integer(1);
		Assert.assertEquals(vect1, vect1);
		Assert.assertEquals(vect1, vect2);
		Assert.assertNotEquals(vect1, null);
		Assert.assertNotEquals(vect1, 1);
		Assert.assertNotEquals(vect1, i);
		Assert.assertNotEquals(vect1, vect3);
	}

	void testToString() {
		Set3i vect = new Set3i(1, 2, 3);
		Assert.assertEquals(vect.toString(), "(1, 2, 3)");
	}
}
