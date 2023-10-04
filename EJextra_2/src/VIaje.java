



public class Viaje {
    
    private int distCiudad,peajes,kmCiudad;
    private boolean mismaRuta;
    private Vehiculo vehiculo;

    public Viaje(int distCiudad, int peajes, int kmCiudad, boolean mismaRuta, Vehiculo vehiculo) {
        this.distCiudad = distCiudad;
        this.peajes = peajes;
        this.kmCiudad = kmCiudad;
        this.mismaRuta = mismaRuta;
        this.vehiculo = vehiculo;
    }

    public int getDistCiudad() {
        return distCiudad;
    }

    public void setDistCiudad(int distCiudad) {
        this.distCiudad = distCiudad;
    }

    public int getPeajes() {
        return peajes;
    }

    public void setPeajes(int peajes) {
        this.peajes = peajes;
    }

    public int getKmCiudad() {
        return kmCiudad;
    }

    public void setKmCiudad(int kmCiudad) {
        this.kmCiudad = kmCiudad;
    }

    public boolean isMismaRuta() {
        return mismaRuta;
    }

    public void setMismaRuta(boolean mismaRuta) {
        this.mismaRuta = mismaRuta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
   
    
    
    
    
     
    
    
    
    
    
}
