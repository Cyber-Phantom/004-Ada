package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;

    // Construtores ============================================================

    public Passaro(
            String nome,
            String cor,
            int altura,
            double peso,
            String estadoDeEspirito) {

        super(nome, 
              cor, 
              altura, 
              peso,
              estadoDeEspirito);

        numeroDePassaros++;
    }

    // Getters =================================================================

    public int getNumeroDePassaros() {
        return this.numeroDePassaros;
    }

    // Setters =================================================================

    public void setNumeroPassaros(int numeroDePassaros) {
        this.numeroDePassaros = numeroDePassaros;
    }

    // Overrides =================================================================

    @Override
    public String toString() {
        return "Passaro{" + "nome='" + nome + '\'' + '}';
    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }

}
