import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalavrasRepetidasTests {
    
    private final String palavra;
    private final String esperado;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(
            new Object[][] {
                {"bola", "bola: none"},
                {"abacate", "abacate: a"},
                {"ovo", "ovo: o"},
                {"paralelepipedo", "paralelepipedo: p,a,l,e"},
                {"kkkkkkkkkkkk", "kkkkkkkkkkkk: k"}
            });
    }

    public PalavrasRepetidasTests(String palavra, String esperado) {
        this.palavra = palavra;
        this.esperado = esperado;
    }

    @Test
    public void palavrasRepetidas() {
        VerificadorPalavrasRepetidas verificador = new VerificadorPalavrasRepetidas();
        String resultado = verificador.verificar(palavra);
        assertEquals(esperado, resultado);
    }
}