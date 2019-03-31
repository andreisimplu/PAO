package Spalatorie.Modele.Utilizator;

public class Utilizator {
    private String user;
    private String parola;
    private Integer numarTelefon;
    private String nume;
    private String prenume;

    public Utilizator(String user, String parola, Integer numarTelefon, String nume, String prenume) {
        this.user = user;
        this.parola = parola;
        this.numarTelefon = numarTelefon;
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Integer getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(Integer numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
