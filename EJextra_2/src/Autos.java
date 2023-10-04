





public class Autos extends Vehiculo{

    
    public Autos(String marca, String patente, Combustible comb) {
        super(marca, patente, comb);
    }

    
    @Override
    protected double costoCombustible() {

        
        
        return (comb.getPrecio()*7)/100;

    }

    
    
}
