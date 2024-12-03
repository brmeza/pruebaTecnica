package org.bmsoft.pruebatecnica.Service;

import org.bmsoft.pruebatecnica.Entity.PalindromeRequest;
import org.bmsoft.pruebatecnica.Entity.PalindromeResponse;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public PalindromeResponse processPalindrome(PalindromeRequest request) {
        String cadena = request.getCadena();
        int lengthCadena = cadena.length();
        boolean isPalindromo = isPalindromo(cadena);
        int lengthCaracteresEspeciales = countSpecialCharacters(cadena);

        return new PalindromeResponse(lengthCadena, isPalindromo, lengthCaracteresEspeciales);
    }

    private boolean isPalindromo(String cadena) {
        String cleaned = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    private int countSpecialCharacters(String cadena) {
        return (int) cadena.chars().filter(c -> !Character.isLetterOrDigit(c)).count();
    }
}
