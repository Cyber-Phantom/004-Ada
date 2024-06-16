package Animais;

public abstract class Animal {

    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    // Construtores ============================================================

    public Animal(
            String nome,
            String cor,
            int altura,
            double peso,
            String estadoDeEspirito) {

        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    // Getters =================================================================

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public int getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getEstadoDeEspirito() {
        return this.estadoDeEspirito;
    }

    // Setters =================================================================

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    // Métodos =================================================================

    protected void comer() {
    }

    protected void dormir() {
    }

    public abstract void soar();

}
