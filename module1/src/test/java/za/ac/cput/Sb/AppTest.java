package za.ac.cput.Sb;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    App ap = new App();

    @Test
    public void test()
    {
        Assert.assertEquals(12,ap.sum());

    }

}
