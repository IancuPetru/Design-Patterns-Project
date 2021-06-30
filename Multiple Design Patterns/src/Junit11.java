import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit11 {

	@Test
	void test() {
		 Amenities H1= new new Spa(new foodbar(new HotelRoom()));
		  double output=H1.cost();
		  assertEquals(80,output);
	}

}
