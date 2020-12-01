package esercizio9;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Albergo {
    
    private String nome;
    private ArrayList <Camera> listaCamere;
    private ArrayList <Prenotazione> listaPrenotazioni;

    public Albergo(String nome){
        this.nome = nome;
        listaCamere = new ArrayList<>();
        listaPrenotazioni = new ArrayList<>();
    }
    
    public void aggiungiPrenotazione(Prenotazione nuovaPrenotazione){
        listaPrenotazioni.add(nuovaPrenotazione);
        setCameraOccupata(nuovaPrenotazione.getNumeroStanza());
    }
    
    private void setCameraOccupata(int numeroStanza){
        for(int i = 0; i < listaCamere.size(); i++){
            if(listaCamere.get(i).getNumero() == numeroStanza){
                listaCamere.get(i).setOccupata();
            }
        }
    }
    
    public boolean rimuoviPrenotazione(int numeroStanza){
        
        for(int i = 0; i < listaPrenotazioni.size(); i++){
            if(numeroStanza == listaPrenotazioni.get(i).getNumeroStanza()){
                    listaPrenotazioni.remove(i);
                    return true;
                }
        }
        
        return false;
    }
    
    public void aggiungiCamera(Camera nuovaCamera){
        listaCamere.add(nuovaCamera);
    }
    
    public boolean rimuoviCamera(int numeroCamera){
        for(int i = 0; i < listaCamere.size(); i++){
            if(numeroCamera == listaCamere.get(i).getNumero()){
                listaCamere.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList <Prenotazione> ricercaPrenotazioniGiornoSpecifico(GregorianCalendar ricercaData){
        ArrayList <Prenotazione> prenotazioniGiornoSpecifico = new ArrayList<>();
        
        for(int i = 0; i < listaPrenotazioni.size(); i++){
            if(ricercaData.equals(listaPrenotazioni.get(i).getCheckIn())){
                prenotazioniGiornoSpecifico.add(listaPrenotazioni.get(i));
            }
         }
        return prenotazioniGiornoSpecifico;
    }
    
//    public String ricercaCamereLibere(){
//        String camereLibere = "";
//
//        for(int i = 0; i < listaCamere.size(); i++){
//            if(!listaCamere.get(i).isOccupata()){
//                camereLibere += "Numero: " + listaCamere.get(i).getNumero();
//                camereLibere += " Tipologia: " + listaCamere.get(i).getTipologia() + "\n";
//            }
//        }
//        return camereLibere;
//    }
    
    public ArrayList <Camera> ricercaCamereLibere(){
        ArrayList <Camera> camereLibere = new ArrayList<>();

        for(int i = 0; i < listaCamere.size(); i++){
            if(!listaCamere.get(i).isOccupata()){
                camereLibere.add(listaCamere.get(i));
            }
        }
        return camereLibere;
    }
    
    
}


