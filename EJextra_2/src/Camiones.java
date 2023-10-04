


public class Camiones extends Vehiculo {

    public Camiones(String marca, String patente, Combustible comb) {
        super(marca, patente, comb);
    }

   
    
    
    
   
    @Override
    protected double costoCombustible() {

        return (comb.getPrecio()*12)/100;

    }

}
