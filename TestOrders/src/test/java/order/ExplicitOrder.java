package order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExplicitOrder
{
	@Order(2)
	@Test
	void test1()
	{
		System.out.println("Test1 - 2");
	}
	
	@Order(1)
	@Test
	void test2()
	{
		System.out.println("Test2 - 1");
	}
	
	@Order(3)
	@Test
	void test3()
	{
		System.out.println("Test3 - 3");
	}
}
