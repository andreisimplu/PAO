package Spalatorie.Modele.Utilizator;

import java.util.List;

public class Client extends Utilizator {
    private List<Plati> istoric;
    private boolean Fidelitate;

    public Client(String user, String parola, Integer numarTelefon, String nume, String prenume, List<Plati> istoric, boolean fidelitate) {
        super(user, parola, numarTelefon, nume, prenume);
        this.istoric = istoric;
        Fidelitate = fidelitate;
    }

    public void afiseazaIstoric() {

        istoric.forEach(e -> System.out.println(e));
    }

    public List<Plati> getIstoric() {
        return istoric;
    }

    public void setIstoric(List<Plati> istoric) {
        this.istoric = istoric;
    }

    public boolean isFidelitate() {
        return Fidelitate;
    }

    public void setFidelitate(boolean fidelitate) {
        Fidelitate = fidelitate;
    }

}
