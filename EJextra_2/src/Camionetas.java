



public class Camionetas extends Vehiculo {

    public Camionetas(String marca, String patente, Combustible comb) {
        super(marca, patente, comb);
    }
    
    
    
    
    
    @Override
    protected double costoCombustible() {

        return (comb.getPrecio()*10)/100;

    }
    
}
