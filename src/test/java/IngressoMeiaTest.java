import org.example.IngressoMeia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngressoMeiaTest {

    @Test
    void deveRetornarValorFinal() {
        IngressoMeia ingresso = new IngressoMeia();
        ingresso.setPreco(200.0f);
        assertEquals(100f, ingresso.calcularValorFinal());
    }

    @Test
    void deveRetornarInformacoes() {
        IngressoMeia ingresso = new IngressoMeia();
        ingresso.setPreco(200.0f);
        ingresso.setEvento("Show");
        ingresso.setCodigo(2);
        assertEquals("Ingresso Meia{codigo=2, evento='Show', valor final=100.0}", ingresso.gerarComprovante());
    }
}
