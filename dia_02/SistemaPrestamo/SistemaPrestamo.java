package dia_02.SistemaPrestamo;

public class SistemaPrestamo {
    public static void main (String [] args){

        String nombreCliente = "Yorlan Andres";
        int edad = 25;
        double ingresoMensual = 2000000;
        boolean tieneTrabajoEstable = true;
        boolean tieneDeudasActivas = true;
        double montoPrestamoSolicitado = 5000000;
        int antiguedadLaboralMeses = 27;

        //Información del cliente - prestamo

        System.out.println("---- INFORMACIÓN DEL CLIENTE ----");
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Edad: " + edad);
        System.out.println("Ingreso mensual: " + ingresoMensual);
        System.out.println("¿Tiene trabajo estable?: " + (tieneTrabajoEstable ? "Si" : "No"));
        System.out.println("¿Tiene deudas activas?: " + (tieneDeudasActivas ? "Si" : "No"));
        System.out.println("Monto prestamo solicitado: " + montoPrestamoSolicitado);
        System.out.println("Antiguedad laboral (meses): " + antiguedadLaboralMeses);

        //Reglas del banco
        double cuotaMensual = montoPrestamoSolicitado / 12;
        boolean calificaParaPrestamo = edad >= 21 && tieneTrabajoEstable && !tieneDeudasActivas && ingresoMensual >= (cuotaMensual * 3) && antiguedadLaboralMeses >=6 ;
        System.out.println(calificaParaPrestamo);
        if (calificaParaPrestamo) {
            System.out.println("Mr(s). " + nombreCliente + " usted clasifica para el prestamo de $" + montoPrestamoSolicitado);
            System.out.println("Sus cuotas son de: $" + cuotaMensual);
        }else{
            System.out.println("Lo sentimos. Usted no clasifica para este prestamo");
            System.out.println("Edad: " + (edad >= 21 ? "Cumple" : "No cumple"));
            System.out.println("¿Tiene trabajo estable? : " + (tieneTrabajoEstable ? "Cumple" : "No cumple"));
            System.out.println("¿Tiene deudas activas? : " + (!tieneDeudasActivas ? "Cumple" : "No cumple"));
            System.out.println("¿Cuotas tres veces más que su ingreso mensual? : " + ((ingresoMensual >= (cuotaMensual * 3)) ? "Cumple" : "No cumple"));
        }
        

    }
}
/*
    Es importante que los valores que son constantes como la edad minima colocarla en un variable para que al momento de 
    que cambie la edad minima para solicitar un prestamo simplemente se cambia este

    Ahora en la evalución de criterios se debe hacer mejor por separado para tener mejor un orden 
        boolean cumpleEdad = edad >= EDAD_MINIMA;
        boolean cumpleTrabajoEstable = tieneTrabajoEstable;
        boolean cumpleNoDeudas = !tieneDeudasActivas;
        boolean cumpleIngreso = ingresoMensual >= ingresoMinimoRequerido;
        boolean cumpleAntiguedad = antiguedadLaboralMeses >= ANTIGUEDAD_MINIMA_MESES;

        boolean calificaParaPrestamo = cumpleEdad && 
                                       cumpleTrabajoEstable && 
                                       cumpleNoDeudas && 
                                       cumpleIngreso && 
                                       cumpleAntiguedad;

        en lugar de hacerlo todo en una linea como         
        boolean calificaParaPrestamo = edad >= 21 && tieneTrabajoEstable && !tieneDeudasActivas && ingresoMensual >= (cuotaMensual * 3) && antiguedadLaboralMeses >=6 ;


*/


