public class App {
    public static void main(String[] args) throws Exception {

        // um em um
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        // 2 em 2
        for (int i = 1; i <= 50; i+=2) {
            System.out.println(i);
        }

        // for aninhado
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " x " + i + " = " + j * i);
            }
        }

    }
}
