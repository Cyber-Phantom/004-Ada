public class App {
    public static void main(String[] args) throws Exception {
        int numero = -10;
        String resultado = "";
        if (numero >= 0) {
            resultado = "positivo";
        } else {
            resultado = "negativo";
        }
        System.out.println("Hello, World! O número é " + resultado);
    }
}
