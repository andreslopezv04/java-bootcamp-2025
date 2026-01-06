package dia_01.CalculadoraViaje;

public class CalculadoraViaje {
    public static void main(String[] args) {
        
        String destino = "Cali";
        int distaciaKM = 7812;
        double consumoVehiculo = 100;
        final double PRECIO_COMBUSTIBLE_LITRO = 7500;
        int numeroDePasajeros = 4;

        System.out.println("---- INFORMACIÓN DEL VIAJE ----");
        System.out.println("Destino: " + destino);
        System.out.println("Número de pasajeros: " + numeroDePasajeros);
        System.out.println("Distacia (KM): " + distaciaKM);
        System.out.println("Precio del combustible (lb): " + PRECIO_COMBUSTIBLE_LITRO );
        System.out.println("Consumo del vehiculo (litros por 100km): " + consumoVehiculo);


    
    }
}
