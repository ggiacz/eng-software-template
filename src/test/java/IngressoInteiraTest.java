import org.example.IngressoInteira;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngressoInteiraTest {

    @Test
    void deveRetornarValorFinal() {
        IngressoInteira ingresso = new IngressoInteira();
        ingresso.setPreco(200.0f);
        assertEquals(220f, ingresso.calcularValorFinal());
    }

    @Test
    void deveRetornarInformacoes() {
        IngressoInteira ingresso = new IngressoInteira();
        ingresso.setPreco(200.0f);
        ingresso.setEvento("Show");
        ingresso.setCodigo(2);
        assertEquals("Ingresso Inteira{codigo=2, evento='Show', valor final=220.0}", ingresso.gerarComprovante());
    }
}
