package org.example;

public class IngressoInteira extends Ingresso{
    @Override
    public float calcularValorFinal() {
        return this.getPreco() + (this.getPreco() * 0.10f);
    }

    @Override
    public String getTipo() {
        return "Ingresso Inteira";
    }
}
