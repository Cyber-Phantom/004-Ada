import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] num = new int[5];

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        System.out.println(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        //================================================================================================

        String[] letr = new String[5];

        letr[0] = "A";
        letr[1] = "B";
        letr[2] = "C";
        letr[3] = "D";
        letr[4] = "E";

        System.out.println(letr);

        for (int i = 0; i < letr.length; i++) {
            System.out.println(letr[i]);
        }

        // ================================================================================================

        System.out.println("============================================================");

        //String[] letr1 = new String[5];
        String[] letr1 = {"A", "B", "C", "D", "E"};

        System.out.println(letr1);

        for (int i = 0; i < letr1.length; i++) {
            System.out.println(letr1[i]);
        }

        System.out.println("============================================================");

        System.out.println(Arrays.toString(letr1));

        // ================================================================================================

        int[] num1 = {9, 10, 12, 25, 2};
        int maior = num1[0];
        int menor = num1[0];
        int media = 0;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] > maior) {
                maior = num1[i];
            }
            if (num1[i] < menor) {
                menor = num1[i];
            }

            media += num1[i];
        }

        System.out.println("============================================================");

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media / num1.length);

    }
}
