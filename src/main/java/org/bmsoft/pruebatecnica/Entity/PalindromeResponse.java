package org.bmsoft.pruebatecnica.Entity;

import lombok.Data;

@Data
public class PalindromeResponse {
    private int lengthCadena;
    private boolean isPalindromo;
    private int lengthCaracteresEspeciales;

    public PalindromeResponse(int lengthCadena, boolean isPalindromo, int lengthCaracteresEspeciales) {
        this.lengthCadena = lengthCadena;
        this.isPalindromo = isPalindromo;
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }
}