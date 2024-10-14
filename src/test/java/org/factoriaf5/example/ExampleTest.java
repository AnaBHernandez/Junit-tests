package org.factoriaf5.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ExampleTest {
    private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar() {
        int num1 = 35;
        int num2 = 79;
        int result = example.sumar(num1, num2);

        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 117);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo() {
        int number = 4;
        boolean result = example.checkPositivo(number);
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        int number = -4;
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    public void testContarLetrasA() {
        String cadena = "mellamoana";
        example.contarLetrasA(cadena);
        int result = example.contarLetrasA(cadena);
        assertEquals(3, result);
        assertNotNull(result);
    }

    @Test
    public void testcontieneElemento() {
        List<String> colores = List.of("Negro", "Blanco", "Gris");
        String color = "Negro";
        boolean result = this.example.contieneElemento(colores, color);
        assertTrue(result);
    }

    @Test
    public void testrevertirCadena() {
        String cadena = "ordenador";
        String result = this.example.revertirCadena(cadena);
        assertEquals("rodanedro", result);
}

    @Test
    public void testfactorial() {
        int number = 6;
        long result = this.example.factorial(number);
        assertEquals(720, result);
}

    @Test
    public void testfactorialerror() {
        int number = -6;
        assertThrows(IllegalArgumentException.class, () -> {
            example.factorial(number);
    });
}

    @Test
    public void testesprimo() {
        int number = 7;
        boolean result = example.esPrimo(number);       
        assertTrue(result);
    }
    @Test
    public void testnoesprimo() {
        int number = 9;
        boolean result = example.esPrimo(number);       
        assertFalse(result);

    }

    @Test
    public void testMensajeConRetraso () throws InterruptedException {
    String result = this.example.mensajeConRetraso();
    assertEquals("Listo después de retraso", result);   
    }    
}
        

        
 



