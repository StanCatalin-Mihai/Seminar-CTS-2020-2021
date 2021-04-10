package ro.ase.cts.decorator.clase;

public class DecoratorTelefon extends DecoratorAbstract {
    public DecoratorTelefon(CardBancar cardBancar) {
        super(cardBancar);
    }

    @Override
    public void platesteContactless() {
        StringBuilder builder = new StringBuilder();
        builder.append("Titularul contului ").append(((Card)super.getCardBancar()).getTitular()).append(" a platit contactless cu telefonul.");
        System.out.println(builder.toString());
    }
}
