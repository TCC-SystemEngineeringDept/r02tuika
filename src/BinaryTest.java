import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTest {

	@Test
	void testIsEven() {
		assertEquals(true, Binary.isEven(2));
		assertEquals(false, Binary.isEven(3));
	}

}
