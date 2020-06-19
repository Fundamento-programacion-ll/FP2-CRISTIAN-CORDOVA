import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testjunit.Testjunit;

/**
 *
 * @author crist
 */
public class TestPackage {
    
    public TestPackage() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void testSumar(){
        System.out.println("test Suma");
        double numero1=0.0;
        double numero2=0.0;
        Testjunit pruebita = new Testjunit();
        double expResult = 0.0;
        double resultado = pruebita.sumarDosNumeros(numero1, numero2);
        assertEquals(expResult, resultado, 0.0);
        //fail("Fallo prueba");
    }
}
