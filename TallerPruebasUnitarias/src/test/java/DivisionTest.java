/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.example.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author radri
 */
public class DivisionTest {
    
    public DivisionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    @DisplayName("division de un numero con 0")
    public void divicionCero(){
        Calculadora calculadora = new Calculadora();
        assertThrows(Exception.class,()->{calculadora.division(0, 0);});
        
    }
    @Test
    @DisplayName("division de un numero positivo con uno negativo")
    public void divicionNegativo(){
        Calculadora calculadora = new Calculadora();
        assertNotEquals(1, calculadora.division(8, -2));
        
    }
    
    @Test
    @DisplayName("division simple")
    public void divicionSimple(){
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.division(2, 2));
    
    }
}
