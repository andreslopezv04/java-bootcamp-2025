package dia_01.SistemaFacturaciónRestaurante;

public class SistemaFacturacionRestaurante {
    public static void main (String [] args){

        //Declaración de las variables los datos de un pedido en el restaurante
        String nombreCliente = "Yorlan";
        String nombreMesero = "Andres";
        int numeroMesa = 3;
        double precioPlatoPrincipal = 75000;
        double precioBebida = 15000;
        double precioPostre = 10000;
        boolean tieneDescuentoVIPCliente = false;
        boolean darPropina = true;

        //Constantes del sistema
        final double IVA = 0.19;
        final double DESCUENTO_VIP = 0.15;
        final double PROPINA_SUGERIDA = 0.1;

        
        System.out.println("---- INFORMACIÓN DEL CLIENTE ----");
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Atendido por: " + nombreMesero);
        System.out.println("Cliente VIP: " + (tieneDescuentoVIPCliente ? "Si" : "No"));
        System.out.println("Mesa #: " + numeroMesa);

        System.out.println("\n--- CONSUMO ");
        System.out.println("Nombre del mesero: " + nombreMesero);
        System.out.println("Plato principal: " + precioPlatoPrincipal);
        System.out.println("Bebida: " + precioBebida);
        System.out.println("Postre: " + precioPostre);
        System.out.println("¿Propina? " + (darPropina ? "Si" : "No"));
        

        
        //Calculos de los precios de la factura
        double subTotal = precioPlatoPrincipal + precioBebida + precioPostre;
        double IVAPagar = subTotal * IVA;
        double totalAntesDescuento = subTotal + IVAPagar;

        System.out.println("\n---- DESGLOSE DE PRECIOS ----");
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("IVA pagar: $" + IVAPagar);
        System.out.println("Total sin descuentos: $" + totalAntesDescuento);

        // Condición para aplicar descuento VIP
        double descuentoPorVIP = 0;
        double totalDespuesDescuento = totalAntesDescuento;

        if (tieneDescuentoVIPCliente){
            descuentoPorVIP = totalAntesDescuento * DESCUENTO_VIP;
            totalDespuesDescuento = totalAntesDescuento - descuentoPorVIP;

            System.out.println("\n---- VIP ----");
            System.out.println("Descuento VIP (15%): -$" + descuentoPorVIP);
            System.out.println("Total con descuento:  $" + totalDespuesDescuento);
        }

        // Aplicar propina
        double propinaPagar = 0;
        double totalFinal = totalDespuesDescuento;
        
        
        if (darPropina){
            propinaPagar = totalAntesDescuento * PROPINA_SUGERIDA;
            totalFinal = totalDespuesDescuento + propinaPagar;

            System.out.println("\n---- Propina ----");
            System.out.println("Propina sugerida (10%): $" + propinaPagar);
        }

        
        System.out.println("\n Total final: $" + totalFinal);
    }
}
