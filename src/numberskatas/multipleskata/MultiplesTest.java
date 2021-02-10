package numberskatas.multipleskata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesTest {
    @Test
    public void test() {
      assertEquals(23, new Multiples().addMultiplesOfThreeOrFive(10));
      assertEquals(3, new Multiples().addMultiplesOfThreeOrFive(4));
      assertEquals(8, new Multiples().addMultiplesOfThreeOrFive(6));
      assertEquals(0, new Multiples().addMultiplesOfThreeOrFive(3));
      assertEquals(0, new Multiples().addMultiplesOfThreeOrFive(0));
    }
    
}
