package Spalatorie.Modele.Oferta;

import java.util.List;

public class OferteMoment extends Oferta {
    private Integer pretOferta;
    private Integer timpExpirare;

    public OferteMoment(Integer numarOferte, String numeOferta, String detaliiOferta, List<Oferta> listaOferte, Integer timpExpirare) {
        super(numarOferte, numeOferta, detaliiOferta, listaOferte);
        this.timpExpirare = timpExpirare;
    }

    public Integer getPretOferta() {
        return pretOferta;
    }

    public void setPretOferta(Integer pretOferta) {
        this.pretOferta = pretOferta;
    }

    public Integer getTimpExpirare() {
        return timpExpirare;
    }

    public void setTimpExpirare(Integer timpExpirare) {
        this.timpExpirare = timpExpirare;
    }

    public void afisareOferta(){


    }
    public void alegereOferta(){

    }


}
