public class App {
    public static void main(String[] args) throws Exception {

        String nome = "Ely";
        saudacao(nome);

        int res = soma(2, 3);
        System.out.println(res);

    }

    // Método não retorna valor (void)
    public static void saudacao(String var) {
        System.out.println("Olá, " + var);
    }

    // Método retorna valor (int/return)
    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

}
