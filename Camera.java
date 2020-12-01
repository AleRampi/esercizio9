package esercizio9;

public class Camera {
    
    private int numero;
    private String tipologia;
    private boolean occupata;
    
    public Camera(int numero, String tipologia){
        this.numero = numero;
        this.tipologia = tipologia;
        occupata = false;
    }
    
    public void setOccupata(){
        occupata = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipologia() {
        return tipologia;
    }
    
    public boolean isOccupata(){
        return occupata;
    }
    
}
