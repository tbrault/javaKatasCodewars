package stringskatas.vowelcount;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class VowelCountTest {

	@Test
	void test() {
		assertEquals("Nope!", 5, VowelCount.getCount("alaikezum"));
	}

}
