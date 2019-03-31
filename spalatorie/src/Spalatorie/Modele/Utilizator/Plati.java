package Spalatorie.Modele.Utilizator;

import java.util.Scanner;

public class Plati {
    private Integer numarPlata;
    private Integer sumaPlata;
    private String dataPlata;

    public Plati()
    {
        this.numarPlata=null;
        this.sumaPlata=null;
        this.dataPlata=null;
    }

    public Plati(Integer numarPlata, Integer sumaPlata, String dataPlata) {
        this.numarPlata = numarPlata;
        this.sumaPlata = sumaPlata;
        this.dataPlata = dataPlata;
    }

    public void organizarePlati(){
        System.out.println("Adauga o plata:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Numar Plata");
        Integer nrPlata = sc.nextInt();
        System.out.println("Suma Plata:");
        Integer suma = sc.nextInt();
        System.out.println("Data Plata:");
        String data = sc.nextLine();

        this.numarPlata=nrPlata;
        this.dataPlata=data;
        this.sumaPlata=suma;
    }

    public Integer getNumarPlata() {
        return numarPlata;
    }

    public void setNumarPlata(Integer numarPlata) {
        this.numarPlata = numarPlata;
    }

    public Integer getSumaPlata() {
        return sumaPlata;
    }

    public void setSumaPlata(Integer sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    public String getDataPlata() {
        return dataPlata;
    }

    public void setDataPlata(String dataPlata) {
        this.dataPlata = dataPlata;
    }
}
