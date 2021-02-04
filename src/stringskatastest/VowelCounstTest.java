package stringskatastest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import stringskatas.VowelCount;

class VowelCounstTest {

	@Test
	void test() {
		assertEquals("Nope!", 5, VowelCount.getCount("alaikezum"));
	}

}
