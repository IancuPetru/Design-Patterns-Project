import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit22 {

	@Test
	void test() {
		 Amenities H2= new foodbar(new HotelRoom());
	     double output=H2.cost();
		 assertEquals(60,output);
	}

}
