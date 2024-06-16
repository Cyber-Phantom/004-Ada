package implementation;

public class SupermarketArray implements Supermarket {

    // Atributos

    private final String[] items;
    private int lastIndex;

    // Construtor

    public SupermarketArray(final int size) {
        items = new String[size];
        lastIndex = -1;
    }

    // Overrides

    @Override
    public void add(final String item) {
        if (lastIndex == items.length - 1) {
            System.err.println("Lista de mercado cheia!");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("################################");
        if (lastIndex < 0) {
            System.err.println("Lista de mercado vazia!");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + items[i]);
        }
        System.out.println("################################");
    }

    @Override
    public void delete(final int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Indice Inválido: " + index + "!");
        }
    }

    // Métodos privados

    private void shift(final int index) {
        for (int i = index; i < lastIndex; i++) {
            items[i] = items[i + 1];
        }
    }

}
