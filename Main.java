package esercizio9;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        
        Albergo divi = new Albergo("Divi");
        
        divi.aggiungiCamera(new Camera(101, "Singola"));
        divi.aggiungiCamera(new Camera(102, "Doppia"));
        divi.aggiungiCamera(new Camera(103, "Tripla"));
        
        divi.aggiungiPrenotazione(new Prenotazione("Giovanni", "Rana", new Camera(101, "Singola"), new GregorianCalendar(2021, 8, 1), new GregorianCalendar(2021, 8, 8)));
        divi.aggiungiPrenotazione(new Prenotazione("Mario", "Rossi", new Camera(102, "Doppia"), new GregorianCalendar(2021, 8, 1), new GregorianCalendar(2021, 8, 8)));

        
        if(divi.rimuoviPrenotazione(101)){
            System.out.println("Camera rimossa.");
        } else {
            System.out.println("Camera non rimossa.");
        }
        
        divi.ricercaPrenotazioniGiornoSpecifico(new GregorianCalendar(2021, 8, 1));
        divi.ricercaCamereLibere();
    }
}
