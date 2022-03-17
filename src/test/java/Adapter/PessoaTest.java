package Adapter;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PessoaTest {

    @Test
    void deveRetornarTipoIngresso() {
        Pessoa consumidor = new Pessoa();
        consumidor.setIngresso("Ingresso Inteira");

        assertEquals("Ingresso Inteira", consumidor.getIngresso());
    }

    @Test
    void deveRetornarValorIngresso() {
        Pessoa consumidor = new Pessoa();
        consumidor.setIngresso("Ingresso Meia");

        assertEquals(10.0f, consumidor.getValorIngresso());
    }
}
