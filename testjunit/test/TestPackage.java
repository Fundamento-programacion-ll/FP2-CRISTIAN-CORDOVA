/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        double numero1=5;
        double numero2=5;
        Testjunit pruebita = new Testjunit();
        double expResult = 10;
        double resultado = pruebita.sumarDosNumeros(numero1, numero2);
        assertEquals(expResult, resultado, 0.0);
        //fail("Fallo prueba suma");
    }
    
    @Test 
    public void testResta(){
        System.out.println("test Resta");
        double numero1=2;
        double numero2=2;
        Testjunit pruebita = new Testjunit();
        double expResult = 0;
        double resultado = pruebita.restaDosNumeros(numero1, numero2);
        assertEquals(expResult, resultado, 0.0);
        //fail("Fallo prueba resta no deben ser negativos");
    }
    
    @Test 
    public void testmultiplicacion(){
        System.out.println("test Multiplicacion");
        double numero1=2;
        double numero2=2;
        Testjunit pruebita = new Testjunit();
        double expResult = 4;
        double resultado = pruebita.multiplicacionDosNumeros(numero1, numero2);
        assertEquals(expResult, resultado, 0.0);
        //fail("Fallo prueba multiplicacion");
    }
    
    
    @Test 
    public void testDivision(){
        System.out.println("test Division");
        double numero1=4;
        double numero2=2;
        Testjunit pruebita = new Testjunit();
        double expResult = 2;
        double resultado = pruebita.DivisionDosNumeros(numero1, numero2);
        double result = 4;
        assertEquals(numero1, result, 0.0);
        //fail("Fallo prueba division debe ser mayor a cero");
    }
}
