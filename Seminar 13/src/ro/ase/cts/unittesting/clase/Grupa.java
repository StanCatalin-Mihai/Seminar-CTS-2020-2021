package ro.ase.cts.unittesting.clase;

import java.util.ArrayList;
import java.util.List;

//O grupa contine maxim 35 de studenti
// Numarul grupei pentru facultatea noastra este cuprins intre 1000 - 1100

public class Grupa {
    private List<IStudent> studenti;
    private int nrGrupa;

    public Grupa(int nrGrupa)  {
        if(nrGrupa < 1000 || nrGrupa > 1100 )
        {
            throw new IllegalArgumentException();
        }
        this.nrGrupa=nrGrupa;
        studenti=new ArrayList<>();
    }

    public List<IStudent> getStudenti() {
        return studenti;
    }

    public int getNrGrupa() {
        return nrGrupa;
    }

    public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        if(studenti.size() == 35)
        {
            throw new IllegalArgumentException();
        }
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public float getPromovabilitate(){
        int nrRestantieri=0;
        for(IStudent student:studenti){
            if(student.areRestante()){
                nrRestantieri++;
            }
        }
        return (this.studenti.size()-nrRestantieri)/(float)this.studenti.size();
    }
    
    
    
}