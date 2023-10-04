



public class Viaje {
    
    private int distCiudad,peajes,kmCiudadInicio,kmCiudadFinal,costoPeaje;
    private Vehiculo vehiculo;

    public Viaje() {
    }

    public Viaje(int distCiudad, int peajes, int costoPeaje, Vehiculo vehiculo) {
        this.distCiudad = distCiudad;
        this.peajes = peajes;
        this.costoPeaje = costoPeaje;
        this.vehiculo = vehiculo;
    }

    public Viaje(int peajes, int kmCiudadInicio, int kmCiudadFinal, int costoPeaje, Vehiculo vehiculo) {
        this.peajes = peajes;
        this.kmCiudadInicio = kmCiudadInicio;
        this.kmCiudadFinal = kmCiudadFinal;
        this.costoPeaje = costoPeaje;
        this.vehiculo = vehiculo;
    }

    public Viaje(int distCiudad, int peajes, int kmCiudadInicio, int kmCiudadFinal, int costoPeaje, boolean mismaRuta, Vehiculo vehiculo) {
        this.distCiudad = distCiudad;
        this.peajes = peajes;
        this.kmCiudadInicio = kmCiudadInicio;
        this.kmCiudadFinal = kmCiudadFinal;
        this.costoPeaje = costoPeaje;
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

    public int getKmCiudadInicio() {
        return kmCiudadInicio;
    }

    public void setKmCiudadInicio(int kmCiudadInicio) {
        this.kmCiudadInicio = kmCiudadInicio;
    }

    public int getKmCiudadFinal() {
        return kmCiudadFinal;
    }

    public void setKmCiudadFinal(int kmCiudadFinal) {
        this.kmCiudadFinal = kmCiudadFinal;
    }

    public int getCostoPeaje() {
        return costoPeaje;
    }

    public void setCostoPeaje(int costoPeaje) {
        this.costoPeaje = costoPeaje;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    
    
    
    
    
    public double calculoCostoCombustible(Vehiculo v1){
       
        
        return distCiudad*v1.costoCombustible();
        
        
        
        
    }
    
    
    
    public double costoPeaje(Vehiculo v1){
        
        if (v1 instanceof Autos || v1 instanceof Camionetas) {
            System.out.println("Vas a pagar el peaje barato pa");
            costoPeaje=200;
            return costoPeaje*=peajes;
            
        }else{
            System.out.println("Vas a pagar caro, camionero del orto");
            costoPeaje=400;
            return costoPeaje*=peajes;
        }
        
    }
    
    
    
    public double calculoDistancia(){
        
        if (distCiudad!=0) {
            return Math.abs(kmCiudadInicio-kmCiudadFinal);
        } else{
            return distCiudad;
        }
        
        

        
        
    }
    
    
    public double costoViaje(){
        
        
        
        
        return costoPeaje(vehiculo)+calculoCostoCombustible(vehiculo);
        
        
        
        
    }
     
    
    
    
    
    
}
