package com.mthwate.datlib.math.set;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mthwate
 */
public class Set2iTest {

	@Test
	public void testAddNew() {
		int range = 10;

		for (int x1 = -range; x1 <= range; x1++) {
			for (int y1 = -range; y1 <= range; y1++) {
				for (int x2 = -range; x2 <= range; x2++) {
					for (int y2 = -range; y2 <= range; y2++) {
						Set2i vect1 = new Set2i(x1, y1);
						Set2i vect2 = new Set2i(x2, y2);
						Set2i vect3 = vect1.addNew(vect2);
						Assert.assertEquals(vect3, new Set2i(x1 + x2, y1 + y2));
					}
				}
			}
		}
	}

	@Test
	public void testAddLocal() {
		int range = 10;

		for (int x1 = -range; x1 <= range; x1++) {
			for (int y1 = -range; y1 <= range; y1++) {
				for (int x2 = -range; x2 <= range; x2++) {
					for (int y2 = -range; y2 <= range; y2++) {
						Set2i vect1 = new Set2i(x1, y1);
						Set2i vect2 = new Set2i(x2, y2);
						vect1.addLocal(vect2);
						Assert.assertEquals(vect1, new Set2i(x1 + x2, y1 + y2));
					}
				}
			}
		}
	}

	@Test
	public void testGetX() {
		int range = 10;

		for (Integer i = -range; i <= range; i++) {
			Assert.assertEquals(new Set2i(i, 0).getX(), i);
		}
	}

	@Test
	public void testGetY() {
		int range = 10;

		for (Integer i = -range; i <= range; i++) {
			Assert.assertEquals(new Set2i(0, i).getY(), i);
		}
	}

	@Test
	public void testEquals() {
		Set2i vect1 = new Set2i(1, 2);
		Set2i vect2 = new Set2i(1, 2);
		Set2i vect3 = new Set2i(2, 1);
		Integer i = new Integer(1);
		Assert.assertEquals(vect1, vect1);
		Assert.assertEquals(vect1, vect2);
		Assert.assertNotEquals(vect1, null);
		Assert.assertNotEquals(vect1, 1);
		Assert.assertNotEquals(vect1, i);
		Assert.assertNotEquals(vect1, vect3);
	}

	@Test
	public void testToString() {
		Set2i vect = new Set2i(1, 2);
		Assert.assertEquals(vect.toString(), "(1, 2)");
	}
}