package hoteltest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hotel.DP;
import hotel.IData;
import hotel.InHotel;

public class InHotelTest{
	protected DP dp=new DP();
	protected IData id=dp;
	protected InHotel ih=new InHotel();
	@Test
	public void testIn() {
		dp.iniRooms();
		assertEquals("Marry成功入住102房间", ih.in(102, "Marry"));
	}

}
