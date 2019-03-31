package Spalatorie.Modele.Oferta;

import java.util.List;
import java.util.Scanner;

public class Oferta {
    private Integer numarOferte;
    private String numeOferta;
    private String detaliiOferta;
    private List<Oferta> listaOferte;


    public Oferta(Integer numarOferte, String numeOferta, String detaliiOferta, List<Oferta> listaOferte) {
        this.numarOferte = numarOferte;
        this.numeOferta = numeOferta;
        this.detaliiOferta = detaliiOferta;
        this.listaOferte = listaOferte;
    }

    public Integer getNumarOferte() {
        return numarOferte;
    }

    public void setNumarOferte(Integer numarOferte) {
        this.numarOferte = numarOferte;
    }

    public String getNumeOferta() {
        return numeOferta;
    }

    public void setNumeOferta(String numeOferta) {
        this.numeOferta = numeOferta;
    }

    public String getDetaliiOferta() {
        return detaliiOferta;
    }

    public void setDetaliiOferta(String detaliiOferta) {
        this.detaliiOferta = detaliiOferta;
    }

    public List<Oferta> getListaOferte() {
        return listaOferte;
    }

    public void setListaOferte(List<Oferta> listaOferte) {
        this.listaOferte = listaOferte;
    }

    public void afisareListaOferte(){


    }



    public void adaugaOferta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adauga o oferta:");
        System.out.println("Numar oferta:");
        numarOferte = sc.nextInt();
        System.out.println("Nume Oferta");
        numeOferta = sc.next();
        System.out.println("Detalii oferta:");
        detaliiOferta = sc.next();
        this.numeOferta=numeOferta;
        this.detaliiOferta=detaliiOferta;
        this.numarOferte=numarOferte;
    }

}
