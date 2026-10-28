package org.example;

public abstract class Ingresso {

    private int codigo;
    protected String evento;
    private float preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public abstract float calcularValorFinal();

    public String getTipo() {
        return "Ingresso";
    }

    public String gerarComprovante() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", evento='" + this.evento + '\'' +
                ", valor final=" + this.calcularValorFinal() +
                '}';
    }
}
