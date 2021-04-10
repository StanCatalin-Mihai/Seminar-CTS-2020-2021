package ro.ase.cts.decorator.clase;

import javax.print.DocFlavor;

public abstract class DecoratorAbstract implements CardBancar{
    private CardBancar cardBancar;

    public DecoratorAbstract(CardBancar cardBancar) {
        this.cardBancar = cardBancar;
    }

    public abstract void platesteContactless();

    public CardBancar getCardBancar()
    {
        return this.cardBancar;
    }

    @Override
    public void platesteFizic()
    {
        this.cardBancar.platesteFizic();
    }

    @Override
    public void platesteOnline()
    {
        this.cardBancar.platesteOnline();
    }
}
