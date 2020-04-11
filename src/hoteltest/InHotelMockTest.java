package hoteltest;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import hotel.IData;
import hotel.InHotel;

public class InHotelMockTest {
	private Mockery context=new Mockery();
	private IData iData=null;
	private InHotel ih=null;
	
	@Before
	public void setUp() throws Exception{
		iData=context.mock(IData.class);
		ih=new InHotel(iData);
		context.checking(new Expectations() {{
			oneOf(iData).in_Out_Room(901,"Marry");will(returnValue("Marry成功入住901"));
		}});
		}

	@Test
	public void testIn() {
		assertEquals("Marry成功入住901",ih.in(901, "Marry"));
	}

}
