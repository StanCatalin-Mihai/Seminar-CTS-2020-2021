package ro.ase.cts.decorator.clase;

public class DecoratorCard extends DecoratorAbstract {


    public DecoratorCard(CardBancar cardBancar) {
        super(cardBancar);
    }

    @Override
    public void platesteContactless() {
        StringBuilder builder = new StringBuilder();
        builder.append("Titularul contului ").append(((Card)super.getCardBancar()).getTitular()).append(" a platit contactless cu cardul.");
        System.out.println(builder.toString());
    }
}
