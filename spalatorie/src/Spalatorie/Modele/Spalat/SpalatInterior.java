package Spalatorie.Modele.Spalat;

import java.util.List;

public class SpalatInterior extends Spalat {
    private Integer pret;
    private Integer durata;

    public SpalatInterior(List<Spalat> listaSpalat, Integer pret, Integer durata) {
        super(listaSpalat);
        this.pret = pret;
        this.durata = durata;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        this.durata = durata;
    }

//    public Integer calculeazaPret(){
//
//
//    }
//    public Integer calculeazaDurata(){
//
//
//    }
}
