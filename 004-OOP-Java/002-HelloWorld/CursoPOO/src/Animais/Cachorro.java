package Animais;

public class Cachorro extends Animal {

    // Atributos =================================================================

    // public String nome;
    // public String cor;
    // public int altura;
    // public double peso;
    // public int tamanhoDoRabo;
    // public String estadoDeEspirito;

    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    // Construtores ============================================================

    public Cachorro(
            String nome,
            String cor,
            int altura,
            double peso,
            int tamanhoDoRabo,
            String estadoDeEspirito) {

        super(nome, 
              cor, 
              altura, 
              peso, 
              estadoDeEspirito);

        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros++;
    }

    // Getters =================================================================

    public int getNumeroDeCachorros() {
        return this.numeroDeCachorros;
    }

    public int getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }

    // Setters =================================================================

    public void setNumeroDeCachorros(int numeroDeCachorros) {
        this.numeroDeCachorros = numeroDeCachorros;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    // Métodos =================================================================

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        
        // if (acao.equals("carinho")) {
        //     this.estadoDeEspirito = "feliz";
        // } else if (acao.equals("vai dormir")) {
        //     this.estadoDeEspirito = "bravo";
        // } else {
        //     this.estadoDeEspirito = "neutro";
        // }

        // return estadoDeEspirito;

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisou na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro";
        }
                
        return estadoDeEspirito;

    }

    // Overrides =================================================================

    @Override
    public String toString() {
        return "Cachorro{" + "nome='" + nome + '\'' + '}';
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }

}
