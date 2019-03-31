package Spalatorie.Servicii;

import Spalatorie.Modele.ListaClienti.ListaClienti;
import Spalatorie.Modele.Oferta.Oferta;
import Spalatorie.Modele.Utilizator.Client;
import Spalatorie.Modele.Utilizator.Plati;
import Spalatorie.Modele.Utilizator.Utilizator;

import javax.rmi.CORBA.Util;
import java.util.*;

public class Servicii {


        private Set<Client> clienti = new HashSet<>();


        private static Servicii ourInstance = new Servicii();
        public static Servicii getInstance() {return ourInstance;}

        public void adaugaClienti()
        {
            System.out.println("Adauga Clienti:");
            Scanner sc = new Scanner(System.in);
            System.out.println("User");
            String user = sc.next();
            System.out.println("Parola:");
            String parola = sc.nextLine();
            System.out.println("Numar Telefon:");
            Integer numarTelefon= sc.nextInt();
            System.out.println("Nume:");
            String nume = sc.nextLine();
            System.out.println("Prenume:");
            String prenume= sc.nextLine();
            System.out.println("Fidelitate :");
            boolean fidel = sc.nextBoolean();

            List<Plati> istoric = new ArrayList<>();
            Plati p = new Plati();
            p.organizarePlati();
            istoric.add(p);

            Client clientNou = new Client(user,parola,numarTelefon,nume,prenume,istoric,fidel);
            this.clienti.add(clientNou);

        }


        public void listaClienti()
        {
            clienti.forEach(c ->System.out.println(c));
        }

        public void afiseazaEvenimenteClienti()
        {
            for ( Client m : clienti)
            {
                m.afiseazaIstoric();
            }
        }

    }


