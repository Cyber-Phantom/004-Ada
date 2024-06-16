package Lojas;

import Animais.Animal;

public class Petshop {
    
    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("limpo");

    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("com saudades");
    }

    public void tosar(Animal animal) {
        animal.setEstadoDeEspirito("tosado");
    }
}
