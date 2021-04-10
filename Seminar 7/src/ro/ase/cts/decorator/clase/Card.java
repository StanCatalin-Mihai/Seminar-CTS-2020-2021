package ro.ase.cts.decorator.clase;

public class Card implements CardBancar {
    private String titular;

    public Card(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public void platesteFizic() {
        StringBuilder builder = new StringBuilder();
        builder.append("Titularul contului ").append(this.titular).append(" a platit fizic.");
        System.out.println(builder.toString());
    }

    @Override
    public void platesteOnline() {
        StringBuilder builder = new StringBuilder();
        builder.append("Titularul contului ").append(this.titular).append(" a platit online.");
        System.out.println(builder.toString());
    }
}
