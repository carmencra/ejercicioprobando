package busquedabinaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class busquedabinariaTest {
	@Test
    void testEsta() {
        int[] v = new int[7];
        
        for(int j = 0; j < v.length; j++) {
            v[j] = j;
        }
        
        int busca = busquedabinaria.buscab(v, 4);
        int espera = 4;

        
        
        assertEquals(espera, busca);
    }

    @Test
    void testNoEsta() {
        int[] v = new int[7];
        
        for(int j = 0; j < v.length; j++) {
            v[j] = j;
        }

        int busca= busquedabinaria.buscab(v, 8);
        int espera = -1;
        
        assertEquals(espera, busca);
    }
}