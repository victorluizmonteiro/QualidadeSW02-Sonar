package br.com.fiap.regras;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ImpedimentoTest {

    @Test
    public void testImpedido() {
        Impedimento impedimento = new Impedimento();
        Double posicaoAtaque = 105.10;
        Double posicaoDefesa = 105.0;
        boolean impedido = impedimento.estaImpedido(posicaoAtaque, posicaoDefesa);
        assertTrue(impedido);
        assertNotNull(impedimento);
        assertNotNull(posicaoAtaque);
        assertNotNull(posicaoDefesa);

    }

    @Test
    public void TestNaoImpedido() {
        Impedimento impedimento = new Impedimento();
        Double posicaoAtaque = 105.10;
        Double posicaoDefesa = 105.15;
        boolean impedido = impedimento.estaImpedido(posicaoAtaque, posicaoDefesa);
        assertFalse(impedido);

    }


}
