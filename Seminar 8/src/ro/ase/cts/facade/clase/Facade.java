package ro.ase.cts.facade.clase;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa) {
        if(OperatorMese.esteLibera(masa.getNrMasa()))
        {
            Picolo picolo = new Picolo("Broski");
            if(picolo.esteMasaDebarasata(masa) && picolo.esteMasaAranjata(masa))
            {
                return true;
            }
        }
        return false;
    }
}
