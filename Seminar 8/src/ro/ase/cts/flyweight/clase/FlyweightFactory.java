package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, FlyweightAbstract> clienti;

    public FlyweightFactory() {
        this.clienti = new HashMap<>();
    }
    public FlyweightAbstract getClient(String nrTelefon)
    {
        if(!this.clienti.containsKey(nrTelefon))
        {
            System.out.println("Am creat client nou");
            this.clienti.put(nrTelefon,new Client("Bosfor",nrTelefon,"bosfor@yahoo.com"));
        }
        return this.clienti.get(nrTelefon);
    }
}
