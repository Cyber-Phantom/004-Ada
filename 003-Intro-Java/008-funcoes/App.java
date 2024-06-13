public class App {
    public static void main(String[] args) throws Exception {

        String nome = "Ely";
        saudacao(nome);

        int n1, n2;
        n1 = 2;
        n2 = 3;
        int res = soma(n1, n2);
        System.out.println(res);

    }

    public static void saudacao(String var) {
        System.out.println("Olá, " + var);
    }

    public static void soma(int num1, int num2) {
        return num1 + num2;
    }

}
