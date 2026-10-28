package org.example;

public class IngressoMeia extends Ingresso{
    @Override
    public float calcularValorFinal() {
        return this.getPreco() - (this.getPreco() * 0.50f);
    }

    @Override
    public String getTipo() {
        return "Ingresso Meia";
    }
}
