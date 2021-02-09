package stringskatas.tenminuteswalk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenMinutesWalkTest {
  @Test
  public void Test() {
    assertEquals("Should return true", true, TenMinutesWalk.isValidWalk(new char[] {'n','s','w','e','n','s','w','e','n','s'}));
    assertEquals("Should return false", false, TenMinutesWalk.isValidWalk(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    assertEquals("Should return false", false, TenMinutesWalk.isValidWalk(new char[] {'w'}));
    assertEquals("Should return false", false, TenMinutesWalk.isValidWalk(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    assertEquals("Should return false", false, TenMinutesWalk.isValidWalk(new char[] {'w','w','w','e','w','e','w','e','w','e'}));
    assertEquals("Should return false", false, TenMinutesWalk.isValidWalk(new char[] {'n','s'}));
  }
}
