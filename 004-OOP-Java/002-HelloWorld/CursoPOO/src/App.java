import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class App {

    public static void main(String[] args) {

        System.out.println("Olá, mundo!");
        System.out.println("==================================");

        // // Cachorro 1
        // Cachorro cachorro1 = new Cachorro();
        // cachorro1.setNome("Bingo");
        // cachorro1.setCor("Preto");
        // cachorro1.setAltura(50);
        // cachorro1.setPeso(5.6);
        // cachorro1.setTamanhoDoRabo(35);

        // System.out.println(cachorro1.getNumeroDeCachorros());

        // Cachorro 1
        Cachorro cachorro1 = new Cachorro(
                "Bingo",
                "Preto",
                50,
                6.5,
                35,
                "neutro");

        // Cachorro 2
        Cachorro cachorro2 = new Cachorro(
                "Meg",
                "Preta",
                30,
                3.5,
                5,
                "neutro");

        // Gato
        Gato gato1 = new Gato(
                "Fafá",
                "Bege",
                20,
                2.5,
                "neutro");

        // Passaro
        Passaro passaro1 = new Passaro(
                "PiuPiu",
                "Amarelo",
                10,
                0.50,
                "neutro");

        System.out.println("Cachorros=" + cachorro2.getNumeroDeCachorros());
        System.out.println("Gatos=" + gato1.getNumeroDeGatos());
        System.out.println("Passaros=" + passaro1.getNumeroDePassaros());
        System.out.println("==================================");

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        System.out.println(gato1.toString());
        System.out.println(passaro1.toString());
        System.out.println("==================================");

        // Cachorro 1
        System.out.println("O " + cachorro1.getNome() + " pegou a " + cachorro1.pegar() + "!");
        System.out.println("O " + cachorro1.getNome() + " está " + cachorro1.interagir("carinho") + "!");
        System.out.println("O " + cachorro1.getNome() + " está " + cachorro1.interagir("vai dormir") + "!");
        System.out.println("O " + cachorro1.getNome() + " está " + cachorro1.interagir("pisou na patinha") + "!");
        System.out.println("O " + cachorro1.getNome() + " está " + cachorro1.interagir("qq coisa") + "!");
        // Cachorro 2
        System.out.println("A " + cachorro2.getNome() + " pegou a " + cachorro2.pegar() + "!");
        // Gato 1
        System.out.println("A " + gato1.getNome() + "!");
        // Passaaro 1
        System.out.println("O " + passaro1.getNome() + "!");
        
        System.out.println("==================================");

        cachorro1.soar();
        cachorro2.soar();
        gato1.soar();
        passaro1.soar();

        System.out.println("==================================");

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println("Cachorro1 = " + cachorro1.getEstadoDeEspirito());

        petshop.tosar(cachorro2);
        System.out.println("Cachorro2 = " + cachorro2.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println("Gato = " + gato1.getEstadoDeEspirito());

        petshop.deixarNoHotel(passaro1);
        System.out.println("Passaro = " + passaro1.getEstadoDeEspirito());
    }
}
