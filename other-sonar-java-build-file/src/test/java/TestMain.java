import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestMain
{
    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testFalse()
    {
        assertFalse( false );
    }
    
    @Test
    public void testPrependHelloToMatthew()
    {
        assertEquals("Hello Matthew", Main.prependHello( "Matthew" ));
    }
}
