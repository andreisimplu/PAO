package Spalatorie.Modele.Oferta;

import java.util.List;

public class OfertaFidelitate extends Oferta {
   private Integer pretOferta;

    public OfertaFidelitate(Integer numarOferte, String numeOferta, String detaliiOferta, List<Oferta> listaOferte, Integer pretOferta) {
        super(numarOferte, numeOferta, detaliiOferta, listaOferte);
        this.pretOferta = pretOferta;
    }
/*
    public Integer OfertaFidelitate(Integer pretOferta) {
        this.pretOferta = pretOferta;
    }

    public Integer getPretOferta() {
        return pretOferta;
    }

    public void setPretOferta(Integer pretOferta) {
        this.pretOferta = pretOferta;
    }

    public void afisareOferta(){


    }
    public void afisareMesaj(){

    }

    public Integer calculeazaPret(){


    }

    public void verificaDisponibilitatea(){


    }*/
}
