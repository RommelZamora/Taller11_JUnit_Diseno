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
public class RadicacionTest {
    
    Calculadora calc;
    
    public RadicacionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
<<<<<<< HEAD
    @Test
    @DisplayName("Raiz cuadrada de un numero positivo")
    public void raizCuadradaPositiva() {
        assertEquals(4,calc.radicacion(16,2));
    }
    
    @Test
    @DisplayName("Raiz cuadrada de un numero negativo")
    public void raizCuadradaNegativa() {
        assertEquals(0,calc.radicacion(-2,2));
    }
    
    @Test
    @DisplayName("Raiz enesima de un numero")
    public void raizEnesima() {
        assertEquals(2,calc.radicacion(16,4));
=======
    //@Test
    public void radicacionTest() {
        Calculadora calc = new Calculadora();
        assertNotEquals(6,calc.radicacion(16,2));
    }
    
    @Test
    @AfterEach
    @DisplayName("Multiplicacion básica")
    public void MultiplicacionBasica(){
        Calculadora calculadora = new Calculadora();
        assertEquals(45.00, calculadora.multiplicacion(5, 9));
    }
    
    @Test
    @DisplayName("Multiplicacion de un numero negativo con uno positivo")
    public void MultNegativoXPositivo(){
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.multiplicacion(-4, 8)==-32);
    }
    
    @Test
    @BeforeEach
    @DisplayName("Multiplicacion de numeros negativos")
    public void MultiplicacionNegativos(){
        Calculadora calculadora = new Calculadora();
        assertFalse(calculadora.multiplicacion(-8, -3)==-24);
    }
    
    @Test
    @DisplayName("Multiplicacion de numeros positivos")
    public void MultiplicacionPositivos(){
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.multiplicacion(6, 5)==30);
    }
    
    @Test
    @DisplayName("Multiplicacion de un numero con 0")
    public void MultiplicacionCero(){
        Calculadora calculadora = new Calculadora();
        assertNotEquals(8, calculadora.multiplicacion(8, 0));
    }
    
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
        
>>>>>>> 16dae767cdcf1a25ca571aca357581077dc1ac8b
    }
}
