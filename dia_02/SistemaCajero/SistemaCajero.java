package dia_02.SistemaCajero;

public class SistemaCajero {
    public static void main (String[] args){
        double saldo = 500000;

        int pinCorrecto = 1234;
        int pinIngresado = 0;
        int [] pinSimulados = {1232, 1242, 1234};
        final int MAXIMO_INTENTOS = 3;

        int contadorIntentosRealizadosPIN = 0;
        int contadorOpciones = 0;

        int numeroTransaccionesRealizadas = 0;

        while (!(pinIngresado == pinCorrecto) && contadorIntentosRealizadosPIN < MAXIMO_INTENTOS) {
            
            pinIngresado = pinSimulados[contadorIntentosRealizadosPIN];
            
            if (pinIngresado == pinCorrecto) {
                int opcion;
                int [] opcionSimulada = {1,2,3,2,4,5}; 
                String [] ultimasTransacciones = new String[opcionSimulada.length];

                do {
    
                    System.out.println("\n--- MENÚ CAJERO AUTOMÁTICO ---");
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Retirar dinero");
                    System.out.println("3. Depositar dinero");
                    System.out.println("4. Ver últimas 5 transacciones");
                    System.out.println("5. Salir");
                    System.out.println("Seleccione una opción:");
                    

                    opcion = opcionSimulada[contadorOpciones];
                    System.out.println("Opción seleccionada: " + opcion);
                    
                    switch (opcion) {
                        case 1:
                            System.out.println(" \n---- CONSULTA DE SALDO ---- ");
                            System.out.println("💰 Su saldo es: " + saldo);
                            break;
                        case 2:
                            System.out.println(" \n---- RETIRO DE DINERO ---- ");

                            double montoRetirar = 50000;
                            System.out.println("Ingrese el monto a retirar" + montoRetirar);

                            final double MINIMO_RETIRO = 10000;
                            boolean tieneSaldo = montoRetirar <= saldo;
                            boolean estaRetirandoMinimo = montoRetirar >= MINIMO_RETIRO;
                            boolean retiro = tieneSaldo && estaRetirandoMinimo;

                            if (retiro) {
                                saldo -= montoRetirar;
                                System.out.println("Retiro de -$" + montoRetirar + " fue exito");
                                System.out.println("Tu saldo actual es $" + saldo);
                            };

                            ultimasTransacciones[numeroTransaccionesRealizadas] = "Retiro de -$" + montoRetirar;
                            numeroTransaccionesRealizadas++;
                            break;
                        case 3:
                            System.out.println(" \n---- DEPOSITAR DINERO ---- ");

                            double montoDepositar = 20000;
                            System.out.println("Ingrese el monto a depositar" + montoDepositar);

                            saldo += montoDepositar;
                            System.out.println("Deposito de $" + montoDepositar + " fue exito");
                            System.out.println("Tu saldo actual es $" + saldo);   
                            ultimasTransacciones[numeroTransaccionesRealizadas] = "Depostio de $" + montoDepositar;
                            numeroTransaccionesRealizadas++;   
                            break;
                        case 4:
                            System.out.println(" \n---- ULTIMAS TRANSACCIONES ---- ");
                            for (int i = 0; i < numeroTransaccionesRealizadas; i++) {
                                System.out.println((i + 1) + ". " + ultimasTransacciones[i]);
                            }
                            break;
                        case 5:
                            System.out.println("Gracias por usar nuestros servicios");
                            break;        
                        default:
                            break;
                    }
                    contadorOpciones++;
                } while (opcion != 5);
                
            }else{
                
            }

            contadorIntentosRealizadosPIN++;
        }
    
    }
}


