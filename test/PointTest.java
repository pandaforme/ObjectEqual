import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
	private Object	point1;
	private Point	point2;

	@Before
	public void setUp() {
		point1 = new Point(1, 1);
		point2 = new Point(1, 1);
	}

	@Test
	public void testCase1() {
		assertTrue(point2.equals(point1));
	}

	@Test
	public void testCase2() {
		Set<Object> set = new HashSet<Object>();
		set.add(point1);
		assertTrue(set.contains(point2));
	}
}
