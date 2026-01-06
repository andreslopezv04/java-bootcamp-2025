package dia_01.SistemaEmpleado;
public class SistemaEmpleado {
    public static void main(String[] args) {

        // Declaración de variables para un empleado
        String nombreEmpleado = "Felipe";
        int horaTrabajadas = 160;
        boolean tieneSeguroMedico = true;

        //Constantes que no cambian en el momento de la ejecución
        final double PAGO_POR_HORA = 7380;
        final double DESCUENTO_SEGURO_MEDICO = 50000.0;
        final double DESCUENTO_SEGURIDAD_SOCIAL = 0.04; //Este descuento los colocamos porque el descuente de este seguro social puede cambiar con el tiempo
        
        //Mostrar información del empleado
        System.out.println("---- INFORMACIÓN DEL EMPLEADO ----");
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Horas trabajadas (mes): " + horaTrabajadas);
        System.out.println("Pago por hora: $" + PAGO_POR_HORA);
        System.out.println("¿Tiene seguro médico?: " + tieneSeguroMedico);

        //Variable para calcular el salario
        double salarioBruto = horaTrabajadas * PAGO_POR_HORA;
        double descuentoSeguroSocial = salarioBruto * DESCUENTO_SEGURIDAD_SOCIAL;
        double salarioNeto = salarioBruto - descuentoSeguroSocial;

        System.out.println("\n---- INFORMACIÓN DEL SALARIO ----");
        System .out.println("Salario bruto: $" + salarioBruto);
        System .out.println("Salario descuento del seguro social (4%): $" + descuentoSeguroSocial);
        System .out.println("Salario neto: " + salarioNeto);

        if (tieneSeguroMedico) {
            salarioNeto = salarioNeto - DESCUENTO_SEGURO_MEDICO;
            System.out.println("Descuento seguro médico $" + salarioNeto);
        }

        System.out.println("\n---- Salario final ----");
        System.out.println("Salario neto final: $" + salarioNeto);

        double porcentajeDescuentoTotal = ((salarioBruto - salarioNeto) / salarioBruto) * 100;
        System.out.println("Porcentaje total descontado: " + porcentajeDescuentoTotal + "%");

    }
    
}

