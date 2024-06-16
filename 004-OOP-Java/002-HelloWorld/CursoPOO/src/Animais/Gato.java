package Animais;

public class Gato extends Animal {

    static int numeroDeGatos;

    // Construtores ============================================================

    public Gato(
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

        numeroDeGatos++;
    }

    // Getters =================================================================

    public int getNumeroDeGatos() {
        return this.numeroDeGatos;
    }

    // Setters =================================================================

    public void setNumeroDeGatos(int numeroDeGatos) {
        this.numeroDeGatos = numeroDeGatos;
    }

    // Overrides =================================================================

    @Override
    public String toString() {
        return "Gato{" + "nome='" + nome + '\'' + '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }

}
