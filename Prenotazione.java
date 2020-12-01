package esercizio9;

import java.util.GregorianCalendar;

public class Prenotazione {
 
    private String nomeCliente;
    private String cognomeCliente;
    private Camera prenotaCamera;
    private GregorianCalendar checkIn = new GregorianCalendar();
    private GregorianCalendar checkOut = new GregorianCalendar();

    public Prenotazione(String nomeCliente, String cognomeCliente, Camera prenotaCamera, GregorianCalendar checkIn, GregorianCalendar checkOut) {
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.prenotaCamera = prenotaCamera;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
               
        occupaStanza();
    }
    
    private void occupaStanza(){
        prenotaCamera.setOccupata();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public Camera getPrenotaCamera() {
        return prenotaCamera;
    }

    public GregorianCalendar getCheckIn() {
        return checkIn;
    }

    public GregorianCalendar getCheckOut() {
        return checkOut;
    }
    
    public int getNumeroStanza(){
        return prenotaCamera.getNumero();
    }
    
    
}
