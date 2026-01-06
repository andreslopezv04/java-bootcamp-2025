package dia_01.CalculadoraViaje;

public class CalculadoraViaje {
    public static void main(String[] args) {
        
        String destino = "Cali";
        int distaciaKM = 412;
        double consumoPor100KM = 20;
        final double PRECIO_COMBUSTIBLE_LITRO = 7500;
        int numeroDePasajeros = 4;

        System.out.println("---- INFORMACIÓN DEL VIAJE ----");
        System.out.println("Destino: " + destino);
        System.out.println("Número de pasajeros: " + numeroDePasajeros);
        System.out.println("Distacia (KM): " + distaciaKM);
        System.out.println("Precio del combustible (lb): " + PRECIO_COMBUSTIBLE_LITRO );
        System.out.println("Consumo del vehiculo (litros por 100km): " + consumoPor100KM);

        //Calculos de viaje
        double litrosNecesariosViaje = (distaciaKM / 100.0) * consumoPor100KM;
        double costoTotalCombustible = litrosNecesariosViaje * PRECIO_COMBUSTIBLE_LITRO;
        double costoPorPersona = costoTotalCombustible / numeroDePasajeros;


        System.out.println("\n---- Información del costos del viaje ----");
        System.out.println("Litros necesarios para viaje: " + litrosNecesariosViaje);
        System.out.println("Costo total del combustible: $" + costoTotalCombustible);
        System.out.println("Costo por persona: $" + costoPorPersona);

        if (distaciaKM >= 300) {
            System.out.println("El viaje es algo");
        }else {
            System.out.println("El viaje es corto");
        }
    }
}
