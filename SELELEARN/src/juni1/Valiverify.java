package juni1;

import org.junit.Test;

import junit.framework.Assert;

public class Valiverify {
@Test
public void testverify() {
	int x=10;
	int y=10;
	Assert.assertEquals(x, y);
}
@Test
public void testverify1() {
	int x=10;
	int y=20;
	Assert.assertTrue(x< y);
}
@Test
public void testverify2() {
	System.out.println("hi");
	String exp="logout";
	String acutual="logout";
	Assert.assertEquals(exp, acutual);
}
}
