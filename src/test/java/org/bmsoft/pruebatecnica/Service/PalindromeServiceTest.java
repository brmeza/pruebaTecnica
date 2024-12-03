package org.bmsoft.pruebatecnica.Service;

import org.bmsoft.pruebatecnica.Entity.PalindromeRequest;
import org.bmsoft.pruebatecnica.Entity.PalindromeResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {

    private PalindromeService palindromeService;

    @BeforeEach
    void setUp() {
        palindromeService = new PalindromeService();
    }

    @Test
    void processPalindrome() {
        // Entrada
        PalindromeRequest request = new PalindromeRequest("anita lava la tina");

        // Ejecución
        PalindromeResponse response = palindromeService.processPalindrome(request);

        // Validaciones
        assertNotNull(response, "La respuesta no debe ser nula");
        assertEquals(18, response.getLengthCadena(), "La longitud de la cadena debe ser 18");
        assertTrue(response.isPalindromo(), "La cadena debe ser identificada como palíndromo");
        assertEquals(3, response.getLengthCaracteresEspeciales(), "La cantidad de caracteres especiales debe ser 3");
    }
}