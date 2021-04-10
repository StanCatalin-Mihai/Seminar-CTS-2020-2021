package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorCard;
import ro.ase.cts.decorator.clase.DecoratorTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Ionel Baciu");
        card.platesteFizic();
        card.platesteOnline();
        System.out.println("=========================Operatii decorator card===================================");
        DecoratorCard decoratorCard = new DecoratorCard(card);
        decoratorCard.platesteContactless();
        decoratorCard.platesteFizic();
        decoratorCard.platesteOnline();
        System.out.println("=========================Operatii decorator telefon===================================");
        DecoratorTelefon decoratorTelefon = new DecoratorTelefon(card);
        decoratorTelefon.platesteContactless();
        decoratorTelefon.platesteFizic();
        decoratorTelefon.platesteOnline();
    }
}
