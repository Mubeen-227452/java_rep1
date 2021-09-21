import org.testng.annotations.Test;

public class gp{
@Test(groups= {"m"}) 
public void test_1() {
	System.out.println("test1");
}
@Test
public void test_2() {
	System.out.println("test2");
}
@Test(groups= {"m"}) 
public void test_3() {
	System.out.println("test3");
}
@Test
public void test_4() {
	System.out.println("test4");
}
@Test(groups= {"m"}) 
public void test_5() {
	System.out.println("test5");
}@Test
public void test_6() {
	System.out.println("test6");
}
}
